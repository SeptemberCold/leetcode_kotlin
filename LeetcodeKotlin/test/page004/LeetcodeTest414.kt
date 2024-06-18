package page004

import base.BaseTest


object LeetcodeTest414 : BaseTest<IntArray, Int>() {

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(3, 2, 1))
            it.add(intArrayOf(1, 2))
            it.add(intArrayOf(2, 2, 3, 1))
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode414().thirdMax(it) }
    }

}