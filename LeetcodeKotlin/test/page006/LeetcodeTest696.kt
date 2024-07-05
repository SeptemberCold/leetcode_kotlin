package page006

import base.BaseTest

object LeetcodeTest696 : BaseTest<String, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode696().countBinarySubstrings(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("00110011")
            it.add("10101")
        }
    }

}