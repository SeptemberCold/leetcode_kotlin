package page011

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
object LeetcodeTest1154 : BaseTest<String, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode1154().dayOfYear(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("2019-01-09")
        }
    }


}