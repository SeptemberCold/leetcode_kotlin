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
object LeetcodeTest006 : BaseTest<LeetcodeTest006.Data, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode006().convert(it.s, it.numRows) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("ABCDE", 2))
            it.add(Data("ABCD", 2))
            it.add(Data("PAYPALISHIRING", 3))
        }
    }

    data class Data(val s: String, val numRows: Int)

}