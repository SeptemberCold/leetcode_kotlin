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
object LeetcodeTest028 : BaseTest<LeetcodeTest028.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode028().strStr(it.haystack, it.needle) }
    }

    data class Data(val haystack: String, val needle: String)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("sadbutsad", "sad"))
            it.add(Data("leetcode", "leeto"))
        }
    }

}