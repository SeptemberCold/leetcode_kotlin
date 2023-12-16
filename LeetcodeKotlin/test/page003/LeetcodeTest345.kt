package page003

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
object LeetcodeTest345 : BaseTest<String, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode345().reverseVowels(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("hello")
            it.add("leetcode")
        }
    }
}