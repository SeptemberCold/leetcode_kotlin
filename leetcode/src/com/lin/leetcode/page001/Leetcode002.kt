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
     * 链表
     */
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


    @JvmStatic
    fun main(args: Array<String>) {
        val testData = getTestData()
        println("0->${System.currentTimeMillis()}")
        for (index in testData.indices) {
            if (index % 2 != 0) continue
            if (index + 1 > testData.size - 1) break
            var result = addTwoNumbers01(testData[index], testData[index + 1])
            while (result != null) {
                println("${result.`val`}")
                result = result.next
            }
            println("${index + 1}->${System.currentTimeMillis()}")
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