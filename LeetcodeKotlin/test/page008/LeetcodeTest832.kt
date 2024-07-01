package page008

import base.BaseTest

object LeetcodeTest832 : BaseTest<Array<IntArray>, Array<IntArray>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode832().flipAndInvertImage(it) }
    }

    override fun getExample(): List<Array<IntArray>> {
        return getArrayList().also {
            it.add(arrayOf(intArrayOf(1, 1, 0, 0), intArrayOf(1, 0, 0, 1), intArrayOf(0, 1, 1, 1), intArrayOf(1, 0, 1, 0)))
        }
    }

}