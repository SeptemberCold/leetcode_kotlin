package page000

import base.BaseTest


object LeetcodeTest047 : BaseTest<IntArray, List<List<Int>>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode047().permuteUnique(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(1, 1, 2))
            it.add(intArrayOf(1, 2, 3))
            it.add(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8))
        }
    }

}