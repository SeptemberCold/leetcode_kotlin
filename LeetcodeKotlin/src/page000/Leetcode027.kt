package page000

/**
 *
 * 题目: 移除元素
 *
 * 描述: 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 *      不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *      元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 限制: 0 <= nums.length <= 100
 *      0 <= nums[i] <= 50
 *      0 <= val <= 100
 *
 * 链接: https://leetcode.cn/problems/remove-element/
 *
 */
class Leetcode027 {

    /**
     * 双指针
     * 执行用时：172 ms
     * 内存消耗：33.9 MB
     */
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) return 0
        var sum = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[sum] = nums[i]
                sum++
            }
        }
        return sum
    }

}