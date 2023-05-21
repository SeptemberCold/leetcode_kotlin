package page000

import base.BaseTest

object LeetcodeTest066 : BaseTest<IntArray, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode066().plusOne(it.clone()) }
    }

    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(1, 2, 3))
        example.add(intArrayOf(4, 3, 2, 1))
        example.add(intArrayOf(0))
        return example
    }

}