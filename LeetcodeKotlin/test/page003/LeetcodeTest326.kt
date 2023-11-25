package page003

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
object LeetcodeTest326 : BaseTest<Int, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode326().isPowerOfThree(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(27)
            it.add(0)
            it.add(9)
            it.add(45)
        }
    }
}