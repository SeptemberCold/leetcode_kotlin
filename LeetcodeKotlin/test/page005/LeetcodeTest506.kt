package page005

import base.BaseTest

object LeetcodeTest506 : BaseTest<IntArray, Array<String>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode506().findRelativeRanks(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(5, 4, 3, 2, 1))
            it.add(intArrayOf(1, 4, 3, 2, 5))
        }
    }

}