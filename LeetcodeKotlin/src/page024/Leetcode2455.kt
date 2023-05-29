package page024

/**
 *
 * 题目: 可被三整除的偶数的平均值
 *
 * 描述: 给你一个由正整数组成的整数数组 nums ，返回其中可被 3 整除的所有偶数的平均值。
 *      注意：n 个元素的平均值等于 n 个元素 求和 再除以 n ，结果 向下取整 到最接近的整数。
 * 限制: 1 <= nums.length <= 1000
 *      1 <= nums[i] <= 1000
 *
 * 链接: https://leetcode.cn/problems/average-value-of-even-numbers-that-are-divisible-by-three/
 *
 */
class Leetcode2455 {

    /**
     * 暴力破解
     * 执行用时：196 ms
     * 内存消耗：38.6 MB
     */
    fun averageValue(nums: IntArray): Int {
        var add = 0.0
        var num = 0.0
        for (i in nums) {
            if (i % 2 == 0 && i % 3 == 0) {
                add += i
                num += 1
            }
        }
        return (add / num).toInt()
    }

}