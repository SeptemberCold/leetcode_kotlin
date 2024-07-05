package page030

import base.BaseTest


object LeetcodeTest3033 : BaseTest<Array<IntArray>, Array<IntArray>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode3033().modifiedMatrix(it) }
    }

    override fun getExample(): List<Array<IntArray>> {
        return getArrayList().also {
            it.add(arrayOf(intArrayOf(1, 2, -1), intArrayOf(4, -1, 6), intArrayOf(7, 8, 9)))
        }
    }

}