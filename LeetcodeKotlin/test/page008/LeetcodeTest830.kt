package page008

import base.BaseTest


object LeetcodeTest830 : BaseTest<String, List<List<Int>>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode830().largeGroupPositions(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("abbxxxxzzy")
            it.add("abc")
            it.add("abcdddeeeeaabbbcd")
            it.add("abcdddeeeeaabbbcddd")
        }
    }

}