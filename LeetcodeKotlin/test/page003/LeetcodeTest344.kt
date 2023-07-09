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
object LeetcodeTest344 : BaseTest<CharArray, Unit>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode344().reverseString(it) }
    }

    override fun getExample(): List<CharArray> {
        val example = ArrayList<CharArray>()
        example.add(charArrayOf('h', 'e', 'l', 'l', 'o'))
        return example
    }
}