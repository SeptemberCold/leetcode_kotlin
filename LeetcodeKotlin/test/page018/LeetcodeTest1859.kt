package page018

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
object LeetcodeTest1859 : BaseTest<String, String>() {


    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode1859().sortSentence(it) }
    }


    override fun getExample(): List<String> {
        val example = ArrayList<String>()
        example.add("is2 sentence4 This1 a3")
        example.add("Myself2 Me1 I4 and3")
        return example
    }


}