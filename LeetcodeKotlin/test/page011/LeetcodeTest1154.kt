package page011

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
object LeetcodeTest1154 : BaseTest<String, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode1154().dayOfYear(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("2019-01-09")
        }
    }


}