package page001

import kotlin.math.max

/**
 *
 * 题目: 打家劫舍
 *
 * 描述: 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 *      影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 *      如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *      给定一个代表每个房屋存放金额的非负整数数组，
 *      计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * 限制: 1 <= nums.length <= 100
 *      0 <= nums[i] <= 400
 *
 * 链接: https://leetcode.cn/problems/house-robber/description/
 *
 */
class Leetcode198 {


    /**
     * 动态规划
     * 时间：128ms
     * 内存：33.33MB
     */
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]

        val dp = IntArray(2)
        dp[0] = 0
        dp[1] = nums[0]

        for (i in 1 until nums.size) {
            //偷当前屋子的收获
            val money = nums[i] + dp[0]
            //不偷当前屋子的收获
            val money2 = dp[1]
            //其中最大值就是最大的收获
            val max = max(money, money2)
            dp[0] = dp[1]
            dp[1] = max
        }
        return dp[1]
    }

}