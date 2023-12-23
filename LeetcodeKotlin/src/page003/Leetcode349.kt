package page003

/**
 *
 * 题目: 两个数组的交集
 *
 * 描述: 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * 限制: 1 <= nums1.length, nums2.length <= 1000
 *      0 <= nums1[i], nums2[i] <= 1000
 *
 * 链接: https://leetcode.cn/problems/intersection-of-two-arrays/description/
 *
 */
class Leetcode349 {

    /**
     * 哈希算法
     * 192 ms
     * 38.02 MB
     */
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap = HashMap<Int, Int>()
        val result = HashSet<Int>()

        for (num in nums1) {
            hashMap[num] = 1
        }
        for (num in nums2) {
            val i = hashMap[num] ?: 0
            if (i != 0) {
                result.add(num)
            }
        }
        return result.toIntArray()
    }

}