package page000

import base.BaseTest


object LeetcodeTest058 : BaseTest<String, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode058().lengthOfLastWord(it) }
        methodTest(example) { return@methodTest Leetcode058().lengthOfLastWord2(it) }
    }

    override fun getExample(): List<String> {
        val example = ArrayList<String>()
        example.add("   fly me   to   the moon  ")
        example.add("Hello World")
        example.add("luffy is still joyboy")
        example.add("a")
        return example
    }
}