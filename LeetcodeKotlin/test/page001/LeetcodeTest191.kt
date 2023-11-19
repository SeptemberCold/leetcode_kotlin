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
object LeetcodeTest191 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode191().hammingWeight(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(11)
        }
    }


}