package page001

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
object LeetcodeTest168 : BaseTest<Int, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode168().convertToTitle(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
//            it.add(1)
//            it.add(26)
//            it.add(27)
            it.add(28)
            it.add(52)
            it.add(701)
            it.add(2147483647)
        }
    }
}