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
object LeetcodeTest342 : BaseTest<Int, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode342().isPowerOfFour(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(16)
            it.add(1)
            it.add(0)
        }
    }
}