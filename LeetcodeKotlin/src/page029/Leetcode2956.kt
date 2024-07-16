package page029

/**
 *
 * 题目: 找到两个数组中的公共元素
 *
 * 描述: 给你两个下标从 0 开始的整数数组 nums1 和 nums2 ，它们分别含有 n 和 m 个元素。
 *      请你计算以下两个数值：
 *          统计 0 <= i < n 中的下标 i ，满足 nums1[i] 在 nums2 中 至少 出现了一次。
 *          统计 0 <= i < m 中的下标 i ，满足 nums2[i] 在 nums1 中 至少 出现了一次。
 *      请你返回一个长度为 2 的整数数组 answer ，按顺序 分别为以上两个数值。
 *
 * 限制: n == nums1.length
 *      m == nums2.length
 *      1 <= n, m <= 100
 *      1 <= nums1[i], nums2[i] <= 100
 *
 * 链接: https://leetcode.cn/problems/find-common-elements-between-two-arrays/description/?envType=daily-question&envId=2024-07-16
 *
 */
class Leetcode2956 {

    /**
     * 哈希
     * 时间：285ms
     * 内存：47.16MB
     */
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap1 = HashMap<Int, Int>()
        val hashMap2 = HashMap<Int, Int>()
        for (i in nums1) {
            hashMap1[i] = 1
        }
        var sum2 = 0
        for (i in nums2) {
            hashMap2[i] = 1
            if (hashMap1[i] != null) sum2 += 1
        }
        var sum1 = 0
        for (i in nums1) {
            if (hashMap2[i] != null) sum1 += 1
        }
        return intArrayOf(sum1, sum2)
    }

}