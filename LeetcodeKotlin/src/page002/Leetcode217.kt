package page002

/**
 *
 * 题目: 存在重复元素
 *
 * 描述: 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 * 限制: 1 <= nums.length <= 105
 *      -109 <= nums[i] <= 109
 *
 * 链接: https://leetcode.cn/problems/contains-duplicate/
 *
 */
class Leetcode217 {

    /**
     * 哈希表存储
     * 执行用时：444 ms
     * 内存消耗：49.9 MB
     */
    fun containsDuplicate(nums: IntArray): Boolean {
        val temp = HashMap<Int, Boolean>()
        for (num in nums) {
            if ((temp[num] == true)) {
                return true
            } else {
                temp[num] = true
            }
        }
        return false
    }

}