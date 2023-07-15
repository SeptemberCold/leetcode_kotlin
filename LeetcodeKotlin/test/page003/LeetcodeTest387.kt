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
object LeetcodeTest387 : BaseTest<String, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode387().firstUniqChar(it) }
    }

    override fun getExample(): List<String> {
        val example = ArrayList<String>()
        example.add("leetcode")
        example.add("loveleetcode")
        example.add("aabb")
        return example
    }


}