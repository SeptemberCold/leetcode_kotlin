package page000

import base.BaseTest

object LeetcodeTest014 : BaseTest<Array<String>, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode014().longestCommonPrefix(it) }
    }

    override fun getExample(): List<Array<String>> {
        val example = ArrayList<Array<String>>()
        example.add(arrayOf("flower", "flow", "flight"))
        example.add(arrayOf("dog", "racecar", "car"))
        return example
    }


}