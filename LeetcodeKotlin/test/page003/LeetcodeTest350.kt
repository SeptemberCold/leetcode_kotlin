package page003

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
object LeetcodeTest350 : BaseTest<LeetcodeTest350.Data, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode350().intersect(it.nums1, it.nums2) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)))
        }
    }

    data class Data(val nums1: IntArray, val nums2: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!nums1.contentEquals(other.nums1)) return false
            if (!nums2.contentEquals(other.nums2)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = nums1.contentHashCode()
            result = 31 * result + nums2.contentHashCode()
            return result
        }

    }

}