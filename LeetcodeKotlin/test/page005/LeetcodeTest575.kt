package page005

import base.BaseTest

object LeetcodeTest575 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode575().distributeCandies(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(1, 1, 2, 2, 3, 3))
        }
    }

}