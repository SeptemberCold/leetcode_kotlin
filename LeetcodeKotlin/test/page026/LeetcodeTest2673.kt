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
object LeetcodeTest2673 : BaseTest<LeetcodeTest2673.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2673().minIncrements(it.n, it.cost) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(7, intArrayOf(1, 5, 2, 2, 3, 3, 1)))
        }
    }

    data class Data(val n: Int, val cost: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (n != other.n) return false
            if (!cost.contentEquals(other.cost)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = n
            result = 31 * result + cost.contentHashCode()
            return result
        }
    }

}