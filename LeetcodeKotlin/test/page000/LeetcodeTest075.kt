package page000

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
object LeetcodeTest075 : BaseTest<IntArray, Unit>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode075().sortColors(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(2, 0, 2, 1, 1, 0))
            it.add(intArrayOf(2, 0, 1))
        }
    }
}