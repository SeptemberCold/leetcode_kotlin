package page025

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
object LeetcodeTest2525 : BaseTest<LeetcodeTest2525.Data, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) {
            return@methodTest Leetcode2525().categorizeBox(
                it.length,
                it.width,
                it.height,
                it.mass
            )
        }
    }

    data class Data(val length: Int, val width: Int, val height: Int, val mass: Int)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(1000, 35, 700, 300))
        }
    }

}