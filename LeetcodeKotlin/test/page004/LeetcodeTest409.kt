package page004

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
object LeetcodeTest409 : BaseTest<String, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode409().longestPalindrome(it) }
    }

    override fun getExample(): List<String> {
        val example = ArrayList<String>()
        example.add("adam")
        example.add("abccccdd")
        example.add("a")
        return example
    }
}