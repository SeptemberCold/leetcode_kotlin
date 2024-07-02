package page031

import base.BaseTest

object LeetcodeTest3115 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode3115().maximumPrimeDifference(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(4, 2, 9, 5, 3))
        }
    }

}