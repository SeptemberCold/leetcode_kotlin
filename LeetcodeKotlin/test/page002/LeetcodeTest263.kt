package page002

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
object LeetcodeTest263 : BaseTest<Int, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode263().isUgly(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(6)
            it.add(1)
            it.add(14)
        }
    }
}