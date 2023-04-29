package page000

import base.BaseTest

object LeetcodeTest013 : BaseTest<String, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode013().romanToInt(it) }
    }


    override fun getExample(): List<String> {
        val example = ArrayList<String>()
        example.add("III")
        example.add("IV")
        example.add("IX")
        example.add("LVIII")
        example.add("MCMXCIV")
        example.add("XXVII")
        return example
    }
}