package page003

import base.BaseTest

/**
 *
 * ��Ŀ:
 *
 * ����:
 * ����:
 *
 * ����:
 *
 */
object LeetcodeTest389 : BaseTest<LeetcodeTest389.Data, Char>() {

    data class Data(val s: String, val t: String)

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode389().findTheDifference(it.s, it.t) }
    }

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data("abcd", "abcde"))
        example.add(Data("", "y"))
        return example
    }

}