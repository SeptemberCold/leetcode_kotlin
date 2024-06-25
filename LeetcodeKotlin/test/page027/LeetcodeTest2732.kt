package page027

import base.BaseTest

object LeetcodeTest2732 : BaseTest<Array<IntArray>, List<Int>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2732().goodSubsetofBinaryMatrix(it) }
    }

    override fun getExample(): List<Array<IntArray>> {
        return getArrayList().also {
//            it.add(arrayOf(intArrayOf(0, 1, 1, 0), intArrayOf(0, 0, 0, 1), intArrayOf(1, 1, 1, 1)))
//            it.add(arrayOf(intArrayOf(0)))
            it.add(arrayOf(intArrayOf(0, 1, 0, 1, 0), intArrayOf(0, 1, 1, 1, 0), intArrayOf(1, 0, 1, 1, 1), intArrayOf(0, 0, 1, 1, 1), intArrayOf(0, 0, 0, 1, 1), intArrayOf(1, 1, 1, 0, 0)))
        }
    }

}