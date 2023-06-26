package page024

import base.BaseTest

/**
 *
 * 题目:
 *
 * 描述:
 * 限制:
 *
 * 链接:
 *
 */
object LeetcodeTest2485 : BaseTest<Int, Int>() {


    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2485().pivotInteger(it) }
    }


    override fun getExample(): List<Int> {
        val example = ArrayList<Int>()
        example.add(8)
        example.add(1)
        example.add(3)
        example.add(4)
        return example
    }
}