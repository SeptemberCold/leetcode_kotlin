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
object LeetcodeTest141 : BaseTest<Leetcode141.ListNode, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode141().hasCycle(it) }
    }

    /**
     * 链表数据不好配置，直接使用力扣的编码器吧
     */
    override fun getExample(): List<Leetcode141.ListNode> {
        return ArrayList()
    }


}