package page005

/**
 *
 * 题目: 最长和谐子序列
 *
 * 描述: 和谐数组是指一个数组里元素的最大值和最小值之间的差别 正好是 1 。
 *      现在，给你一个整数数组 nums ，请你在所有可能的子序列中找到最长的和谐子序列的长度。
 *      数组的子序列是一个由数组派生出来的序列，它可以通过删除一些元素或不删除元素、且不改变其余元素的顺序而得到。
 * 限制: 1 <= nums.length <= 2 * 104
 *      -109 <= nums[i] <= 109
 *
 * 链接: https://leetcode.cn/problems/longest-harmonious-subsequence/description/
 *
 */
class Leetcode594 {

    /**
     * 排序 哈希
     * 用时：373ms
     * 内存：43.08MB
     */
    fun findLHS(nums: IntArray): Int {
        //记录次数
        val hashMap = HashMap<Int, Int>()
        for (num in nums) {
            hashMap[num] = (hashMap[num] ?: 0) + 1
        }
        //排序去重
        val set = nums.toSortedSet().toIntArray()
        var max = 0
        for (i in 1 until set.size) {
            val gap = set[i] - set[i - 1]
            if (gap == 1) {
                max = max.coerceAtLeast((hashMap[set[i]] ?: 0) + (hashMap[set[i - 1]] ?: 0))
            }
        }
        return max
    }

}