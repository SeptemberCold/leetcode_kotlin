package page001

import base.BaseTest


object LeetcodeTest198 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode198().rob(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(1, 2, 3, 1))
            it.add(intArrayOf(2, 7, 9, 3, 1))
        }
    }


}