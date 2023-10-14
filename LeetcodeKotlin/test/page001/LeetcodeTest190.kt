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
object LeetcodeTest190 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode190().reverseBits(it) }
        methodTest(getExample()) { return@methodTest Leetcode190().reverseBits2(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(43261596)
            it.add(4294967293.toInt())
        }
    }
}