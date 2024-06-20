package page004

/**
 *
 * 题目: 下一个更大元素 I
 *
 * 描述: nums1 中数字 x 的 下一个更大元素 是指 x 在 nums2 中对应位置 右侧 的 第一个 比 x 大的元素。
 *      给你两个 没有重复元素 的数组 nums1 和 nums2 ，下标从 0 开始计数，其中nums1 是 nums2 的子集。
 *      对于每个 0 <= i < nums1.length ，找出满足 nums1[i] == nums2[j] 的下标 j ，
 *      并且在 nums2 确定 nums2[j] 的 下一个更大元素 。如果不存在下一个更大元素，那么本次查询的答案是 -1 。
 *      返回一个长度为 nums1.length 的数组 ans 作为答案，满足 ans[i] 是如上所述的 下一个更大元素 。
 *
 * 限制: 1 <= nums1.length <= nums2.length <= 1000
 *      0 <= nums1[i], nums2[i] <= 104
 *      nums1和nums2中所有整数 互不相同
 *      nums1 中的所有整数同样出现在 nums2 中
 *
 * 链接: https://leetcode.cn/problems/next-greater-element-i/description/
 *
 */
class Leetcode496 {

    /**
     * 哈希
     * 时间 172ms
     * 内存 36.48MB
     */
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        //未排序索引
        val hashMap1 = HashMap<Int, Int>()
        for (i in nums2.indices) {
            hashMap1[nums2[i]] = i
        }
        for (i in nums1.indices) {
            val num = nums1[i]
            nums1[i] = -1
            val start = hashMap1[num]!!
            for (j in start + 1 until nums2.size) {
                if (nums2[j] > num) {
                    nums1[i] = nums2[j]
                    break
                }
            }
        }
        return nums1
    }

}