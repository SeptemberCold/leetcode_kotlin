package page026

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
object LeetcodeTest2682 : BaseTest<LeetcodeTest2682.Data, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2682().circularGameLosers(it.n, it.k) }
    }

    data class Data(val n: Int, val k: Int)

    override fun getExample(): List<Data> {
        return getArrayList().also {
//            it.add(Data(5, 2))
//            it.add(Data(4, 4))
            it.add(Data(2, 1))
        }
    }

}