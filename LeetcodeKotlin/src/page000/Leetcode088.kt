package page000

/**
 *
 * 题目: 合并两个有序数组
 *
 * 描述: 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *      请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *      注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
 *      为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 * 限制: nums1.length == m + n
 *      nums2.length == n
 *      0 <= m, n <= 200
 *      1 <= m + n <= 200
 *      -109 <= nums1[i], nums2[j] <= 109
 *
 * 链接: https://leetcode.cn/problems/merge-sorted-array/description/
 *
 */
class Leetcode088 {

    /**
     * 排序
     * 时间 164ms
     * 内存 33.16mb
     */
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        for (i in 0 until n) {
            nums1[m + i] = nums2[i]
        }
        //排序
        for (i in nums1.indices) {
            for (j in i until nums1.size) {
                if (nums1[i] > nums1[j]) {
                    val temp = nums1[j]
                    nums1[j] = nums1[i]
                    nums1[i] = temp
                }
            }
        }
    }

}