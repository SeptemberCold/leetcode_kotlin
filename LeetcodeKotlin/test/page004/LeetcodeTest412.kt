package page004

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
object LeetcodeTest412 : BaseTest<Int, List<String>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode412().fizzBuzz(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(3)
            it.add(5)
            it.add(15)
        }
    }
}