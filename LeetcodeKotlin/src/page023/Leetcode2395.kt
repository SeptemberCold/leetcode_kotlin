package page023

/**
 *
 * 题目: 和相等的子数组
 *
 * 描述: 给你一个下标从 0开始的整数数组nums，判断是否存在两个长度为2的子数组且它们的和相等。注意，这两个子数组起始位置的下标必须不相同。
 *      如果这样的子数组存在，请返回true，否则返回false。
 *      子数组 是一个数组中一段连续非空的元素组成的序列。
 * 限制: 2 <= nums.length <= 1000
 *      -109 <= nums[i] <= 109
 *
 * 链接:https://leetcode.cn/problems/find-subarrays-with-equal-sum/
 *
 */
object Leetcode2395 {

    /**
     * 哈希表
     * 执行用时：156 ms
     * 内存消耗：34.9 MB
     */
    fun findSubarrays(nums: IntArray): Boolean {
        if (nums.size <= 2) return false
        val hash = HashSet<Int>()
        for (i in 1 until nums.size) {
            val value = nums[i] + nums[i - 1]
            val contains = hash.contains(value)
            if (contains) {
                return true
            } else {
                hash.add(value)
            }
        }
        return false
    }

}