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
object LeetcodeTest122 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode122().maxProfit(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(7, 1, 5, 3, 6, 4))
            it.add(intArrayOf(1, 2, 3, 4, 5))
            it.add(intArrayOf(7, 6, 4, 3, 1))
        }
    }
}