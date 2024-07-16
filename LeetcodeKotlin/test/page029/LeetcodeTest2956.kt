package page029

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest2956 : BaseTest<LeetcodeTest2956.Data, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode2956().findIntersectionValues(it.nums1, it.nums2) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(2, 3, 2), intArrayOf(1, 2)))
        }
    }

    class Data(val nums1: IntArray, val nums2: IntArray)

}