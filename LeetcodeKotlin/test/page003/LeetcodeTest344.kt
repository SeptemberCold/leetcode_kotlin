package page003

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
object LeetcodeTest344 : BaseTest<CharArray, Unit>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode344().reverseString(it) }
    }

    override fun getExample(): List<CharArray> {
        val example = ArrayList<CharArray>()
        example.add(charArrayOf('h', 'e', 'l', 'l', 'o'))
        return example
    }
}