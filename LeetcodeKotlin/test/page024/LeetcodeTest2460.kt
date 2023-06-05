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
object LeetcodeTest2460 : BaseTest<IntArray, IntArray>() {


    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2460().applyOperations(it) }
    }


    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(1, 2, 2, 1, 1, 0))
        example.add(intArrayOf(0, 1))
        return example
    }


}