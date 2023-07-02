package page002

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
object LeetcodeTest290 : BaseTest<LeetcodeTest290.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode290().wordPattern(it.pattern, it.s) }
    }

    data class Data(val pattern: String, val s: String)

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data("abba", "dog cat cat dog"))
        example.add(Data("aaa", "aa aa aa aa"))
        example.add(Data("abba", "dog cat cat fish"))
        example.add(Data("aaaa", "dog cat cat dog"))
        return example
    }


}