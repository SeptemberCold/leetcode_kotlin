package page000

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
object LeetcodeTest005 : BaseTest<String, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode005().longestPalindrome(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("babad")
            it.add("abc")
            it.add("cbbd")
            it.add("aacabdkacaa")
            it.add("cabdkac")
        }
    }


}