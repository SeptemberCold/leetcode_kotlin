package page001

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
object LeetcodeTest141 : BaseTest<Leetcode141.ListNode, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode141().hasCycle(it) }
    }

    /**
     * �������ݲ������ã�ֱ��ʹ�����۵ı�������
     */
    override fun getExample(): List<Leetcode141.ListNode> {
        return ArrayList()
    }


}