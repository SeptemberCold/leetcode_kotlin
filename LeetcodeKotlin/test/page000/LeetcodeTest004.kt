package page000

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
object LeetcodeTest004 : BaseTest<LeetcodeTest004.Data, Double>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode004().findMedianSortedArrays(it.num1, it.num2) }
    }

    data class Data(val num1: IntArray, val num2: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!num1.contentEquals(other.num1)) return false
            if (!num2.contentEquals(other.num2)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = num1.contentHashCode()
            result = 31 * result + num2.contentHashCode()
            return result
        }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(3, 4), intArrayOf()))
//            it.add(Data(intArrayOf(1, 2, 8), intArrayOf(3, 4, 5, 6)))
        }
    }

}