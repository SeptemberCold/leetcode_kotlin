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
object LeetcodeTest125 : BaseTest<String, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode125().isPalindrome(it) }
    }

    override fun getExample(): List<String> {
        val example = ArrayList<String>()
        example.add("A man, a plan, a canal: Panama")
        example.add("race a car")
        example.add(" ")
        example.add("0P")
        return example
    }
}