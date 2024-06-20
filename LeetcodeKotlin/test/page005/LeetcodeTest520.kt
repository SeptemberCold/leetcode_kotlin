package page005

import base.BaseTest


object LeetcodeTest520 : BaseTest<String, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode520().detectCapitalUse(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("FlaG")
        }
    }


}