package page006

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
object LeetcodeTest605 : BaseTest<LeetcodeTest605.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode605().canPlaceFlowers(it.flowerbed, it.n) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(1, 0, 0, 0, 1), 1))
            it.add(Data(intArrayOf(1, 0, 0, 0, 1), 2))
            it.add(Data(intArrayOf(0), 1))
        }
    }

    data class Data(val flowerbed: IntArray, val n: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!flowerbed.contentEquals(other.flowerbed)) return false
            if (n != other.n) return false

            return true
        }

        override fun hashCode(): Int {
            var result = flowerbed.contentHashCode()
            result = 31 * result + n
            return result
        }
    }


}