package page025

import base.BaseTest

object LeetcodeTest2529 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2529().maximumCount(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(-2, -1, -1, 1, 2, 3))
            it.add(intArrayOf(-3, -2, -1, 0, 0, 1, 2))
            it.add(intArrayOf(5, 20, 66, 1314))
        }
    }

}