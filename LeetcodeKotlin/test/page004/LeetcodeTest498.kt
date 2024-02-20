package page004

import base.BaseTest

object LeetcodeTest498 : BaseTest<Array<IntArray>, IntArray>() {


    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode498().findDiagonalOrder(it) }
    }

    override fun getExample(): List<Array<IntArray>> {
        return getArrayList().also {
            it.add(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))
            it.add(arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5), intArrayOf(2, 0, 3, 4)))
            it.add(arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 0, 7, 8), intArrayOf(0, 10, 11, 12), intArrayOf(13, 14, 15, 0)))
            it.add(arrayOf(intArrayOf(1, 0)))
        }
    }

}