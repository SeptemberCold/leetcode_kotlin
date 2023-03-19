package page007

import base.LeetcodeBaseTest2


object LeetcodeTest746 : LeetcodeBaseTest2<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode746.minCostClimbingStairs(it) }
    }


    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(10, 15, 20))
        example.add(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1))
        return example
    }
}