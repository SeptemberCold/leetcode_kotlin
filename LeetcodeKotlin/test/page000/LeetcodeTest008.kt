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
object LeetcodeTest008 : BaseTest<String, Int>() {


    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode008().myAtoi(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("  +  413")
            it.add("4193 with words")
            it.add("   -42")
        }
    }
}