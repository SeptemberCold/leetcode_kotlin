package page001

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
object LeetcodeTest171 : BaseTest<String, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode171().titleToNumber(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
//            it.add("A")
//            it.add("AB")
//            it.add("AZ")
//            it.add("ZY")
            it.add("AAAA")
            it.add("FXSHRXW")
        }
    }
}