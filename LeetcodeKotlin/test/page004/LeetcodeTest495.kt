package page004

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
object LeetcodeTest495 : BaseTest<LeetcodeTest495.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode495().findPoisonedDuration(it.timeSeries, it.duration) }
    }

    data class Data(val timeSeries: IntArray, val duration: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!timeSeries.contentEquals(other.timeSeries)) return false
            if (duration != other.duration) return false

            return true
        }

        override fun hashCode(): Int {
            var result = timeSeries.contentHashCode()
            result = 31 * result + duration
            return result
        }

    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(1, 4), 2))
            it.add(Data(intArrayOf(1, 2), 2))
        }
    }

}