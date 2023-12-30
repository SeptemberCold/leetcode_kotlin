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
object LeetcodeTest1185 : BaseTest<LeetcodeTest1185.Data, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode1185().dayOfTheWeek(it.day, it.month, it.year) }
    }

    data class Data(val day: Int, val month: Int, val year: Int)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(1, 1, 1970))
            it.add(Data(31, 8, 2019))
            it.add(Data(18, 7, 1999))
            it.add(Data(15, 8, 1993))
        }
    }

}