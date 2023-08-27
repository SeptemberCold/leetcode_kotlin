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
object LeetcodeTest056 : BaseTest<Array<IntArray>, Array<IntArray>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode056().merge(it) }
    }

    override fun getExample(): List<Array<IntArray>> {
        return getArrayList().also {
//            it.add(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
//            it.add(arrayOf(intArrayOf(1, 4), intArrayOf(0, 1)))
            it.add(arrayOf(intArrayOf(2, 3), intArrayOf(4, 5), intArrayOf(6, 7), intArrayOf(8, 9), intArrayOf(1, 10)))
        }
    }

}