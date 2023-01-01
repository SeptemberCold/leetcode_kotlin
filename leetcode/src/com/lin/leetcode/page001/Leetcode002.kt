package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/01/01/22:48
 *
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，
 * 并且每个节点只能存储一位数字。请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 */
object Leetcode002 {

    /**
     * 执行用时：204 ms
     * 内存消耗：41.5 MB
     */
    private fun addTwoNumbers01(l1: ListNode?, l2: ListNode?): ListNode? {
        //保留引用
        var temp1 = l1
        var temp2 = l2
        //逢十进一
        var i = 0
        while (temp1 != null) {
            //根据二号链表的节点 两数相加
            if (temp2 != null) {
                temp1.`val` = temp1.`val` + temp2.`val` + i
            } else {
                temp1.`val` = temp1.`val` + i
            }
            //逢十进一处理
            if (temp1.`val` >= 10) {
                temp1.`val` = temp1.`val` - 10
                i = 1
            } else {
                i = 0
            }
            //如果一号链表的下一个节点空了，但逢十进一还没有计算
            //如果一号链表的下一个节点空了，但二号链表还有下一个节点
            //发生这两种情况都给一号链表生成一个新的节点
            if ((temp1.next == null && i == 1) || (temp1.next == null && temp2?.next != null)) {
                temp1.next = ListNode(0)
                temp1 = temp1.next
            } else {
                temp1 = temp1.next
            }
            temp2 = temp2?.next
        }
        return l1
    }

    /**
     * 递归方式
     * 执行用时：200 ms
     * 内存消耗：40.5 MB
     */
    private fun addTwoNumbers02(l1: ListNode?, l2: ListNode?): ListNode? {
        //两个链表都是空的 返回null 用于结束递归
        if (l1 == null && l2 == null) return null
        //缓存赋值 kotlin不能对参数直接操作
        var temp1 = l1
        var temp2 = l2
        //如果有链表长度不够就补上
        if (temp1 == null) temp1 = ListNode(0)
        if (temp2 == null) temp2 = ListNode(0)
        //计算两者之和
        val `val` = temp1.`val` + temp2.`val`
        //大于十直接加到链表下一个节点
        if (`val` >= 10) {
            if (temp1.next == null) temp1.next = ListNode(0)
            temp1.next!!.`val` = temp1.next!!.`val` + 1
        }
        //保存计算得到的值，大于10就减10
        val listNode = ListNode(if (`val` >= 10) `val` - 10 else `val`)
        //下一个节点的递归
        listNode.next = addTwoNumbers02(temp1.next, temp2.next)
        return listNode
    }


    /**
     * 链表
     */
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


    @JvmStatic
    fun main(args: Array<String>) {
        val testData = getTestData()
        println("方法一开始->${System.currentTimeMillis()}")
        for (index in testData.indices) {
            if (index % 2 != 0) continue
            if (index + 1 > testData.size - 1) break
            var result = addTwoNumbers01(testData[index], testData[index + 1])
            var str = ""
            while (result != null) {
                str += result.`val`
                result = result.next
            }
            println(str)
            println("耗时:${index + 1}->${System.currentTimeMillis()}")
        }
        println("方法二开始->${System.currentTimeMillis()}")
        for (index in testData.indices) {
            if (index % 2 != 0) continue
            if (index + 1 > testData.size - 1) break
            var result = addTwoNumbers02(testData[index], testData[index + 1])
            var str = ""
            while (result != null) {
                str += result.`val`
                result = result.next
            }
            println(str)
            println("耗时:${index + 1}->${System.currentTimeMillis()}")
        }

    }

    /**
     * 获取测试用例
     */
    private fun getTestData(): List<ListNode> {
        val data = ArrayList<ListNode>()
        data.add(getTestData(intArrayOf(2, 2, 2)))
        data.add(getTestData(intArrayOf(2, 2, 2, 2)))
        data.add(getTestData(intArrayOf(9, 9, 9, 9, 9, 9, 9)))
        data.add(getTestData(intArrayOf(9, 9, 9, 9)))
        return data
    }

    /**
     * 获取测试用例
     */
    private fun getTestData(array: IntArray): ListNode {
        val node = ListNode(0)
        var temp = node
        for (i in array.indices) {
            temp.`val` = array[i]
            if (i == array.size - 1) break
            temp.next = ListNode(0)
            temp = temp.next!!
        }
        return node
    }


}