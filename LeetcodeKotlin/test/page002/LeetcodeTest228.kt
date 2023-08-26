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
object LeetcodeTest228 : BaseTest<IntArray, List<String>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode228().summaryRanges(it) }
    }


    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(0, 1, 2, 4, 5, 7))
            it.add(intArrayOf(0, 2, 3, 4, 6, 8, 9))
            it.add(intArrayOf())
        }
    }
}