package page000

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
object LeetcodeTest069 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode069().mySqrt(it) }
    }


    override fun getExample(): List<Int> {
        val example = ArrayDeque<Int>()
        example.add(2147483647)
        example.add(1)
        return example
    }


}