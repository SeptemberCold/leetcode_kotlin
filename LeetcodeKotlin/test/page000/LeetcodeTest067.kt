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
object LeetcodeTest067 : BaseTest<LeetcodeTest067.Data, String>() {

    data class Data(val a: String, val b: String)

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode067().addBinary(it.a, it.b) }
    }

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data("11", "1"))
        example.add(Data("1010", "1011"))
        example.add(Data("100", "110010"))
        example.add(Data("101111", "10"))
        return example
    }

}