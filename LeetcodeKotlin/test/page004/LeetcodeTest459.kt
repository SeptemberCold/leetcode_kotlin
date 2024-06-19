package page004

import base.BaseTest


object LeetcodeTest459 : BaseTest<String, Boolean>() {


    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("abab")
            it.add("aba")
            it.add("abcabcabcabc")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode459().repeatedSubstringPattern(it) }
    }

}