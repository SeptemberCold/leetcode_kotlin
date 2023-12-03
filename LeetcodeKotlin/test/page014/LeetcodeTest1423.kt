package page014

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
object LeetcodeTest1423 : BaseTest<LeetcodeTest1423.Data, Int>() {


    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode1423().maxScore(it.cardPoints, it.k) }
    }


    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(1, 2, 3, 4, 5, 6, 1), 3))
            it.add(Data(intArrayOf(9, 7, 7, 9, 7, 7, 9), 7))
            it.add(Data(intArrayOf(1, 1000, 1), 1))
            it.add(Data(intArrayOf(1, 79, 80, 1, 1, 1, 200, 1), 3))
            it.add(Data(intArrayOf(2, 2, 2), 2))
            it.add(Data(intArrayOf(2, 2, 2), 3))
        }
    }


    data class Data(val cardPoints: IntArray, val k: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!cardPoints.contentEquals(other.cardPoints)) return false
            if (k != other.k) return false

            return true
        }

        override fun hashCode(): Int {
            var result = cardPoints.contentHashCode()
            result = 31 * result + k
            return result
        }
    }

}