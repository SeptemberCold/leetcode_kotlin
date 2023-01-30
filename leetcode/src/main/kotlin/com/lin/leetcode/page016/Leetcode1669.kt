package com.lin.leetcode.page016

/**
 *
 * @author lin
 * @date 2023/01/30/18:30
 *
 * 合并两个链表
 * 给你两个链表list1 和list2，它们包含的元素分别为n 个和m 个。
 * 请你将list1中下标从 a 到 b 的全部节点都删除，并将list2接在被删除节点的位置。
 * 请你返回结果链表的头指针。
 */
object Leetcode1669 {

    /**
     * 执行用时：500 ms
     * 内存消耗：42.8 MB
     */
    private fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        //b+1的节点
        var bNode: ListNode? = null
        //用于保存当前节点
        var node = list1
        //用于记录节点下标
        var i = 0
        //遍历到节点最后
        while (node != null) {
            //如果下一个节点是a 保留下一个节点用于继续遍历 但上一个节点的引用指向list2
            if (i + 1 == a) {
                val temp = node.next
                node.next = list2
                node = temp
                i++
                continue
            }
            //如果当前节点是b 保留下一个节点
            if (i == b) {
                if (node.next == null) return list1
                bNode = node.next!!
                break
            }
            //向下遍历
            node = node.next
            i++
        }
        node = list2
        while (node != null) {
            if (node.next == null) {
                node.next = bNode
                break
            }
            node = node.next
        }
        return list1
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            var answer = mergeInBetween(it.list1, it.a, it.b, it.list2)
            while (answer != null) {
                println(answer.`val`)
                answer = answer.next
            }
        }

    }

    private fun getTestData(): List<Data> {
        val data = ArrayList<Data>()
        val array1 = intArrayOf(0, 1, 2, 3, 4, 5)
        val list1 = ListNode(0)
        var node: ListNode? = list1
        for (i in array1) {
            if (node != null) {
                node.`val` = i
            } else {
                node = ListNode(i)
            }
            node = node.next
        }
        val array2 = intArrayOf(1000000, 1000001, 1000002)
        val list2 = ListNode(0)
        node = list2
        for (i in array2) {
            if (node != null) {
                node.`val` = i
            } else {
                node = ListNode(i)
            }
            node = node.next
        }
        data.add(Data(list1, 3, 4, list2))
        return data
    }

    class Data(val list1: ListNode, val a: Int, val b: Int, val list2: ListNode)
}