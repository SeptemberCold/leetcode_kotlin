package page018

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