package page000

/**
 *
 * 题目: 删除有序数组中的重复项
 *
 * 描述: 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 *      元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 *      考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 *          更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums的其余元素与 nums 的大小不重要。
 *          返回 k。
 * 
 * 限制: 1 <= nums.length <= 3 * 104
 *      -104 <= nums[i] <= 104
 *       nums 已按 升序 排列
 *
 * 链接: https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 *
 */
class Leetcode026 {

    /**
     * 双指针
     * 执行用时：228 ms
     * 内存消耗：40.1 MB
     */
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 1) return nums.size
        var sum = 0
        for (i in 1 until nums.size) {
            if (nums[i] != nums[sum]) {
                nums[sum + 1] = nums[i]
                sum += 1
            }
        }
        return sum + 1
    }

}