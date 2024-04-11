package page003

/**
 *
 * 题目: 零钱兑换
 *
 * 描述: 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 *      计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
 *      你可以认为每种硬币的数量是无限的。
 *
 * 限制: 1 <= coins.length <= 12
 *      1 <= coins[i] <= 231 - 1
 *      0 <= amount <= 104
 *
 * 链接: https://leetcode.cn/problems/coin-change/description/
 *
 */
class Leetcode322 {

    /**
     * 动态规划
     * 时间：169ms
     * 内存：35.65MB
     */
    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount == 0) return 0
        //创建dp数组
        val dp = IntArray(amount + 1)
        //记录最小值的数
        for (coin in coins) {
            if (coin < amount) {
                dp[coin] = 1
                continue
            }
            if (coin == amount) {
                return 1
            }
        }
        for (i in 1..amount) {
            if (dp[i] == 1) continue
            var min = Int.MAX_VALUE
            for (coin in coins) {
                if (i - coin > 0) {
                    val count = dp[i - coin]
                    if (count == -1) continue
                    if (count + 1 < min) {
                        min = count + 1
                    }
                }
            }
            dp[i] = if (min == Int.MAX_VALUE) -1 else min
        }

        return dp[amount]
    }


}