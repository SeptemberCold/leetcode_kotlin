package page016

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
object LeetcodeTest1657 : BaseTest<LeetcodeTest1657.Data, Boolean>() {

    data class Data(val word1: String, val word2: String)

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { Leetcode1657().closeStrings(it.word1, it.word2) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("abc", "bca"))
            it.add(Data("a", "aa"))
            it.add(Data("cabbba", "abbccc"))
            it.add(Data("cabbba", "aabbss"))
        }
    }

}