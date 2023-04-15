package page002

import base.BaseTest


object LeetcodeTest231 : BaseTest<Int, Boolean>() {


    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode231().isPowerOfTwo(it) }
    }

    override fun getExample(): List<Int> {
        val example = ArrayList<Int>()
        example.add(1)
        example.add(16)
        example.add(3)
        example.add(4)
        example.add(5)
        return example
    }
}