package page025

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
object LeetcodeTest2544 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2544().alternateDigitSum(it) }
    }

    override fun getExample(): List<Int> {
        val example = ArrayList<Int>()
        example.add(521)
        example.add(111)
        example.add(886996)
        return example
    }
}