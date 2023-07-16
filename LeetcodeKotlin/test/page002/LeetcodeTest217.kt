package page002

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
object LeetcodeTest217 : BaseTest<IntArray, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode217().containsDuplicate(it) }
    }

    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(1, 2, 3, 1))
        example.add(intArrayOf(1, 2, 3, 4))
        example.add(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))
        return example
    }
}