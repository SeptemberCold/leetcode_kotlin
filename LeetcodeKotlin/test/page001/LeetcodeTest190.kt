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
object LeetcodeTest190 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode190().reverseBits(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(43261596)
        }
    }
}