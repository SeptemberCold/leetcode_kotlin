package page000

/**
 *
 * 题目: 寻找两个正序数组的中位数
 *
 * 描述: 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
 *      算法的时间复杂度应该为 O(log (m+n)) 。
 * 限制: nums1.length == m
 *      nums2.length == n
 *      0 <= m <= 1000
 *      0 <= n <= 1000
 *      1 <= m + n <= 2000
 *      -106 <= nums1[i], nums2[i] <= 106
 *
 * 链接: https://leetcode.cn/problems/median-of-two-sorted-arrays/
 *
 */
class Leetcode004 {

    /**
     * 双指针
     * 时间 264ms
     * 内存 46.07MB
     */
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        val m = nums1.size
        val n = nums2.size
        val length = m + n

        //指针位置
        var m1 = 0
        var n1 = 0
        //指针前推
        val count = if (length % 2 == 0) (length - 2) / 2 else (length - 1) / 2
        for (i in 1..count) {
            val temp1 = if (m1 >= m) Int.MAX_VALUE else nums1[m1]
            val temp2 = if (n1 >= n) Int.MAX_VALUE else nums2[n1]
            if (temp1 > temp2) {
                n1 += 1
            } else {
                m1 += 1
            }
        }

        if (length % 2 == 0) {
            //前推完都没有到中位数，表示中位数在另外一个数组中
            if (m1 >= m || m == 0) return (nums2[n1] + nums2[n1 + 1]) / 2.0
            if (n1 >= n || n == 0) return (nums1[m1] + nums1[m1 + 1]) / 2.0
            //如果两边都没有前推完 从4个数字里找最小的哪两个
            return if (nums1[m1] > nums2[n1]) {
                val temp = if (n1 + 1 >= n) Int.MAX_VALUE else nums2[n1 + 1]
                val min = temp.coerceAtMost(nums1[m1])
                (nums2[n1] + min) / 2.0
            } else {
                val temp = if (m1 + 1 >= m) Int.MAX_VALUE else nums1[m1 + 1]
                val min = temp.coerceAtMost(nums2[n1])
                (nums1[m1] + min) / 2.0
            }
        } else {

            //前推完都没有到中位数，表示中位数在另外一个数组中
            if (m1 >= m || m == 0) return nums2[n1].toDouble()
            if (n1 >= n || n == 0) return nums1[m1].toDouble()
            return nums1[m1].coerceAtMost(nums2[n1]).toDouble()
        }
    }

}