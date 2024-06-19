package page004

import base.BaseTest


object LeetcodeTest463 : BaseTest<Array<IntArray>, Int>() {


    override fun getExample(): List<Array<IntArray>> {
        return getArrayList().also {
            it.add(arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(1, 1, 1, 0), intArrayOf(0, 1, 0, 0), intArrayOf(1, 1, 0, 0)))
            it.add(arrayOf(intArrayOf(1)))
            it.add(arrayOf(intArrayOf(1, 0)))
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode463().islandPerimeter(it) }
    }


}