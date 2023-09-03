package page000

import base.BaseTest

/**
 *
 * 题目:
 *
 * 描述:
 * 限制:
 *
 * 链接:
 *
 */
object LeetcodeTest021 : BaseTest<LeetcodeTest021.Data, Leetcode021.ListNode?>() {

    data class Data(val list1: Leetcode021.ListNode?, val list2: Leetcode021.ListNode?)

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode021().mergeTwoLists(it.list1, it.list2) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            //第一个参数
            var list1 = Leetcode021.ListNode(1)
            var list2 = Leetcode021.ListNode(1)
            it.add(Data(list1, list2))
            list1.next = Leetcode021.ListNode(2)
            list2.next = Leetcode021.ListNode(3)
            list1 = list1.next!!
            list2 = list2.next!!
            list1.next = Leetcode021.ListNode(4)
            list2.next = Leetcode021.ListNode(4)
            //第二个参数
            it.add(Data(null, null))
            //第三个参数
            list2 = Leetcode021.ListNode(0)
            it.add(Data(null, list2))
        }
    }

}