package page001

/**
 *
 * 题目: 只出现一次的数字
 *
 * 描述: 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。
 *      找出那个只出现了一次的元素。
 *      你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 * 限制: 1 <= nums.length <= 3 * 104
 *      -3 * 104 <= nums[i] <= 3 * 104
 *      除了某个元素只出现一次以外，其余每个元素均出现两次。
 *
 * 链接: https://leetcode.cn/problems/single-number/
 *
 */
class Leetcode136 {

    /**
     * 位运算
     * 执行用时：216 ms
     * 内存消耗：37.8 MB
     */
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }

}