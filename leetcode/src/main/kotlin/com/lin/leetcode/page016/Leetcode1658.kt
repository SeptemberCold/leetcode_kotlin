package com.lin.leetcode.page016


/**
 *
 * @author lin
 * @date 2023/01/07/19:35
 *
 * 将 x 减到 0 的最小操作数
 * 给你一个整数数组 nums 和一个整数 x 。
 * 每一次操作时，你应当移除数组 nums 最左边或最右边的元素，
 * 然后从 x 中减去该元素的值。请注意，需要 修改 数组以供接下来的操作使用。
 * 如果可以将 x恰好 减到0 ，返回 最小操作数 ；否则，返回 -1 。
 *
 */
object Leetcode1658 {

    /**
     * 执行用时：496 ms
     * 内存消耗：52.6 MB
     */
    private fun minOperations(nums: IntArray, x: Int): Int {
        val n = nums.size
        val sum = nums.sum()
        if (sum < x) {
            return -1
        }
        var right = 0
        var lsum = 0
        var rsum = sum
        var ans = n + 1
        for (left in -1 until n) {
            if (left != -1) {
                lsum += nums[left]
            }
            while (right < n && lsum + rsum > x) {
                rsum -= nums[right]
                ++right
            }
            if (lsum + rsum == x) {
                ans = ans.coerceAtMost(left + 1 + (n - right))
            }
        }
        return if (ans > n) -1 else ans
    }

    @JvmStatic
    fun main(args: Array<String>) {
        minOperations(intArrayOf(3, 2, 20, 1, 1, 3), 10)
        minOperations(intArrayOf(1, 1, 4, 2, 3), 5)
    }

}