package page001

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
object LeetcodeTest187 : BaseTest<String, List<String>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) {
            return@methodTest Leetcode187().findRepeatedDnaSequences(it)
        }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")
            it.add("AAAAAAAAAAAAA")
        }
    }
}