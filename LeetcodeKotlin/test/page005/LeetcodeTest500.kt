package page005

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
object LeetcodeTest500 : BaseTest<Array<String>, Array<String>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode500().findWords(it) }
    }

    override fun getExample(): List<Array<String>> {
        return getArrayList().also {
            it.add(arrayOf("Hello", "Alaska", "Dad", "Peace"))
            it.add(arrayOf("omk"))
            it.add(arrayOf("adsdf", "sfd"))
        }
    }
}