package page005

import base.BaseTest


object LeetcodeTest594 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode594().findLHS(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(1, 3, 2, 2, 5, 2, 3, 7))
            it.add(intArrayOf(1, 2, 3, 4))
            it.add(intArrayOf(1, 1, 1, 1))
        }
    }

}