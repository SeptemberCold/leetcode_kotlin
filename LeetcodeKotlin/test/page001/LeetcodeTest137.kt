package page001

import base.BaseTest


object LeetcodeTest137 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode137().singleNumber(it) }
    }

    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(2, 2, 3, 2))
        example.add(intArrayOf(0, 1, 0, 1, 0, 1, 99))
        return example
    }
}