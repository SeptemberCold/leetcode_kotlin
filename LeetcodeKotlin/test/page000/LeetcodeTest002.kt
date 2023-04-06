package page000

import base.BaseTest

object LeetcodeTest002 : BaseTest<LeetcodeTest002.Data, Leetcode002.ListNode>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode002().addTwoNumbers(it.l1, it.l2)!! }
    }

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data(getListNode(intArrayOf(9, 9, 9, 9, 9, 9, 9)), getListNode(intArrayOf(9, 9, 9, 9))))
        return example
    }


    class Data(
        val l1: Leetcode002.ListNode, val l2: Leetcode002.ListNode
    )


    private fun getListNode(array: IntArray): Leetcode002.ListNode {
        val result = Leetcode002.ListNode(array[0])
        var temp = result
        for (i in 1 until array.size) {
            temp.next = Leetcode002.ListNode(array[i])
            temp = temp.next!!
        }
        return result
    }

}