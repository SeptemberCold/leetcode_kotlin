package page002

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
object LeetcodeTest258 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode258().addDigits(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(38)
            it.add(10)
        }
    }
}