package page019

import base.BaseTest

object LeetcodeTest1991 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode1991().findMiddleIndex(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(2, 3, -1, 8, 4))
            it.add(intArrayOf(1, -1, 4))
            it.add(intArrayOf(2, 5))
            it.add(intArrayOf(1))
        }
    }

}