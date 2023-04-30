package page000

import base.BaseTest


object LeetcodeTest020 : BaseTest<String, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode020().isValid(it) }
    }

    override fun getExample(): List<String> {
        val example = ArrayList<String>()
        example.add("()")
        example.add("()[]{}")
        example.add("(]")
        example.add("())")
        return example
    }
}