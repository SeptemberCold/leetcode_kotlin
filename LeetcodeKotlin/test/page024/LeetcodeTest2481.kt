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
object LeetcodeTest2481 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2481().numberOfCuts(it) }
    }

    override fun getExample(): List<Int> {
        val example = ArrayList<Int>()
        example.add(1)
        example.add(4)
        example.add(3)
        return example
    }
}