package page022

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
object LeetcodeTest2235 : BaseTest<LeetcodeTest2235.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2235().sum(it.num1, it.num2) }
    }

    data class Data(val num1: Int, val num2: Int)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(12, 5))
            it.add(Data(-10, 4))
        }
    }
}