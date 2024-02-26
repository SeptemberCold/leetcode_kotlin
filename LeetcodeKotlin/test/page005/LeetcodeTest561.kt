package page005

import base.BaseTest

object LeetcodeTest561 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode561().arrayPairSum(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(1, 4, 3, 2))
            it.add(intArrayOf(6, 2, 6, 5, 1, 2))
        }
    }


}