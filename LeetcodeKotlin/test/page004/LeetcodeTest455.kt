package page004

import base.BaseTest

object LeetcodeTest455 : BaseTest<LeetcodeTest455.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode455().findContentChildren(it.g, it.s) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(1, 2, 3), intArrayOf(1, 1)))
            it.add(Data(intArrayOf(1, 2), intArrayOf(1, 2, 3)))
        }
    }

    data class Data(val g: IntArray, val s: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!g.contentEquals(other.g)) return false
            return s.contentEquals(other.s)
        }

        override fun hashCode(): Int {
            var result = g.contentHashCode()
            result = 31 * result + s.contentHashCode()
            return result
        }
    }

}