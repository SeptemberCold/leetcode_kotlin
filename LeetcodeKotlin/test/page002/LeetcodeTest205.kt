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
object LeetcodeTest205 : BaseTest<LeetcodeTest205.Data, Boolean>() {


    data class Data(
        val s: String, val t: String
    )

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode205().isIsomorphic(it.s, it.t) }
    }

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data("badc", "baba"))
        example.add(Data("egg", "add"))
        example.add(Data("foo", "bar"))
        example.add(Data("paper", "title"))
        return example
    }

}