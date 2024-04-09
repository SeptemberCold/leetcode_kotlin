package page025

import kotlin.math.max

/**
 *
 * 题目: 正整数和负整数的最大计数
 *
 * 描述: 给你一个按 非递减顺序 排列的数组 nums ，返回正整数数目和负整数数目中的最大值。
 *      换句话讲，如果 nums 中正整数的数目是 pos ，而负整数的数目是 neg ，返回 pos 和 neg二者中的最大值。
 *      注意：0 既不是正整数也不是负整数。
 *
 * 限制: 1 <= nums.length <= 2000
 *      -2000 <= nums[i] <= 2000
 *      nums 按 非递减顺序 排列。
 *
 * 链接: https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer/description/?envType=daily-question&envId=2024-04-09
 *
 */
class Leetcode2529 {

    /**
     * 数组遍历
     * 时间：204ms
     * 内存：37.52MB
     */
    fun maximumCount(nums: IntArray): Int {
        var pos = 0
        var neg = 0
        for (num in nums) {
            if (num > 0) {
                pos += 1
                continue
            }
            if (num < 0) {
                neg += 1
                continue
            }
        }
        return max(pos, neg)
    }

}