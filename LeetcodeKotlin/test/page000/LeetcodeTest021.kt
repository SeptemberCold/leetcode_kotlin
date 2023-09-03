package page000

import base.BaseTest

/**
 *
 * ��Ŀ:
 *
 * ����:
 * ����:
 *
 * ����:
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
            //��һ������
            var list1 = Leetcode021.ListNode(1)
            var list2 = Leetcode021.ListNode(1)
            it.add(Data(list1, list2))
            list1.next = Leetcode021.ListNode(2)
            list2.next = Leetcode021.ListNode(3)
            list1 = list1.next!!
            list2 = list2.next!!
            list1.next = Leetcode021.ListNode(4)
            list2.next = Leetcode021.ListNode(4)
            //�ڶ�������
            it.add(Data(null, null))
            //����������
            list2 = Leetcode021.ListNode(0)
            it.add(Data(null, list2))
        }
    }

}