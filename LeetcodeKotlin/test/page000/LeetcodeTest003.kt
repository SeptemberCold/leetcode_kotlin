package page000

import base.BaseTest

object LeetcodeTest003 : BaseTest<String, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode003().lengthOfLongestSubstring(it) }
    }

    override fun getExample(): List<String> {
        val example = ArrayList<String>()
        example.add("abcabcbb")
        example.add("bbbbb")
        example.add("pwwkew")
        example.add("b")
        example.add("ashdgajhsgdhkajhsghdkjahgsjkdhakjshdkjahsdjkghjkfgashjfgajhsgd")
        return example
    }


}