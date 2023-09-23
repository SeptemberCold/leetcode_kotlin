package page006

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
object LeetcodeTest657 : BaseTest<String, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode657().judgeCircle(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("UD")
            it.add("LL")
        }
    }


}