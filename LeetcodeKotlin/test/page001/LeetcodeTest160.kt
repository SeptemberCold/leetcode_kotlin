package page001

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
object LeetcodeTest160 : BaseTest<LeetcodeTest160.Data, Leetcode160.ListNode?>() {


    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode160().getIntersectionNode(it.headA, it.headB) }
    }

    data class Data(val headA: Leetcode160.ListNode?, val headB: Leetcode160.ListNode?)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            val head4 = Leetcode160.ListNode(4)
            val head5 = Leetcode160.ListNode(5)
            val head8 = Leetcode160.ListNode(8)
            val headA = Leetcode160.ListNode(4)
            headA.next = Leetcode160.ListNode(1)
            headA.next?.next = head8
            headA.next?.next?.next = head4
            headA.next?.next?.next?.next = head5
            val headB = Leetcode160.ListNode(5)
            headB.next = Leetcode160.ListNode(6)
            headB.next?.next = Leetcode160.ListNode(1)
            headB.next?.next?.next = head8
            it.add(Data(headA, headB))
        }
    }

}