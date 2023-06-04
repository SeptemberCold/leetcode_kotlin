package page024

import base.BaseTest

object LeetcodeTest2465 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2465().distinctAverages(it) }
    }

    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(4, 1, 4, 0, 3, 5))
        example.add(intArrayOf(1, 100))
        return example
    }

}