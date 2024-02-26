package page004

import base.BaseTest

object LeetcodeTest485 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode485().findMaxConsecutiveOnes(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(1, 1, 0, 1, 1, 1))
            it.add(intArrayOf(1, 0, 1, 1, 0, 1))
        }
    }

}