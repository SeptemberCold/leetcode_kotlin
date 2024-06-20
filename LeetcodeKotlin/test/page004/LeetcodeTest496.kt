package page004

import base.BaseTest


object LeetcodeTest496 : BaseTest<LeetcodeTest496.Data, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getArrayList()) { return@methodTest Leetcode496().nextGreaterElement(it.nums1, it.nums2) }
    }

    data class Data(val nums1: IntArray, val nums2: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!nums1.contentEquals(other.nums1)) return false
            return nums2.contentEquals(other.nums2)
        }

        override fun hashCode(): Int {
            var result = nums1.contentHashCode()
            result = 31 * result + nums2.contentHashCode()
            return result
        }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2)))
        }
    }

}