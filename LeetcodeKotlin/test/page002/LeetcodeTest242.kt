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
object LeetcodeTest242 : BaseTest<LeetcodeTest242.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode242().isAnagram(it.s, it.t) }
    }

    data class Data(val s: String, val t: String)

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data("anagram", "nagaram"))
        example.add(Data("rat", "car"))
        return example
    }

}