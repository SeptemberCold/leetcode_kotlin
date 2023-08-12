package page003

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
object LeetcodeTest383 : BaseTest<LeetcodeTest383.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode383().canConstruct(it.ransomNote, it.magazine) }
    }

    data class Data(val ransomNote: String, val magazine: String)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("a", "b"))
            it.add(Data("aa", "ab"))
            it.add(Data("aa", "aab"))
        }
    }

}