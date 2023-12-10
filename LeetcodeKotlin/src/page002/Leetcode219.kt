package page002

/**
 *
 * 题目: 存在重复元素 II
 *
 * 描述: 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，
 *      满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
 * 限制: 1 <= nums.length <= 105
 *      -109 <= nums[i] <= 109
 *      0 <= k <= 105
 *
 * 链接: https://leetcode.cn/problems/contains-duplicate-ii/description/
 *
 */
class Leetcode219 {

    /**
     * 哈希表
     * 484 ms
     * 51.53 MB
     */
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val hashMap = HashMap<Int, Int>()

        for (i in nums.indices) {
            val value = nums[i]
            val j = hashMap[value]
            if (j != null && j - i <= k) {
                return true
            }
            hashMap[value] = i
        }
        return false
    }

}