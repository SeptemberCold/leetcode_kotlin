package page026

import base.BaseTest

/**
 *
 * 题目:
 *
 * 描述:
 * 限制:
 *
 * 链接:
 *
 */
object LeetcodeTest2651 : BaseTest<LeetcodeTest2651.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) {
            return@methodTest Leetcode2651().findDelayedArrivalTime(
                it.arrivalTime, it.delayedTime
            )
        }
    }

    data class Data(val arrivalTime: Int, val delayedTime: Int)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(15, 5))
            it.add(Data(13, 11))
        }
    }

}