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
object LeetcodeTest275 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        LeetcodeTest274.methodTest(getExample()) { return@methodTest Leetcode275().hIndex(it) }
    }

    override fun getExample(): List<IntArray> {
        return LeetcodeTest274.getArrayList().also {
            it.add(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
            it.add(intArrayOf(0, 1, 3, 5, 6))
            it.add(intArrayOf(1, 2, 100))
        }
    }
}