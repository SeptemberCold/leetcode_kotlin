package page000

/**
 *
 * 题目: 搜索插入位置
 *
 * 描述: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 *      如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *      请必须使用时间复杂度为 O(log n) 的算法。
 * 限制: 1 <= nums.length <= 104
 *      -104 <= nums[i] <= 104
 *      nums 为无重复元素的升序排列数组
 *      -104 <= target <= 104
 *
 * 链接: https://leetcode.cn/problems/search-insert-position/
 *
 */
class Leetcode035 {

    /**
     * 二分查找
     * 执行用时：188 ms
     * 内存消耗：37.3 MB
     */
    fun searchInsert(nums: IntArray, target: Int): Int {
        var min = 0
        var max = nums.size - 1
        while (min <= max) {
            val mid = (max + min) / 2
            if (nums[mid] < target) {
                min = mid + 1
            } else {
                max = mid - 1
            }
        }
        return min
    }

}