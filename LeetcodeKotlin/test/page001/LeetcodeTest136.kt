package page001

import base.BaseTest

/**
 *
 * ��Ŀ:
 *
 * ����:
 * ����:
 *
 * ����:
 *
 */
object LeetcodeTest136 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode136().singleNumber(it) }
    }

    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(2, 2, 1))
        example.add(intArrayOf(4, 1, 2, 1, 2))
        example.add(intArrayOf(1))
        return example
    }

}