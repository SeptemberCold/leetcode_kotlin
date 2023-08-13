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
object LeetcodeTest088 : BaseTest<LeetcodeTest088.Data, Unit>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode088().merge(it.nums1, it.m, it.nums2, it.n) }
    }

    data class Data(val nums1: IntArray, val m: Int, val nums2: IntArray, val n: Int) {
        override fun equals(other: Any?) = true
        override fun hashCode() = nums1.contentHashCode()
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3))
            it.add(Data(intArrayOf(1), 1, intArrayOf(), 0))
            it.add(Data(intArrayOf(0), 0, intArrayOf(1), 1))
        }
    }


}