package page013

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
object LeetcodeTest1342 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode1342().numberOfSteps(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(14)
            it.add(8)
            it.add(123)
        }
    }


}