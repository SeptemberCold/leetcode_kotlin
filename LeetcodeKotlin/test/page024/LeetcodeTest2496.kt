package page024

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
object LeetcodeTest2496 : BaseTest<Array<String>, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2496().maximumValue(it) }
    }

    override fun getExample(): List<Array<String>> {
        val example = ArrayList<Array<String>>()
        example.add(arrayOf("alic3", "bob", "3", "4", "00000"))
        example.add(arrayOf("1", "01", "001", "0001"))
        return example
    }
}