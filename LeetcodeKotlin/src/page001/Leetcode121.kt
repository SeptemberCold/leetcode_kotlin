package page001

/**
 *
 * 题目: 买卖股票的最佳时机
 *
 * 描述: 给定一个数组prices,它的第i个元素prices[ i ]表示一支给定股票第 i 天的价格。
 *      你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *      返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * 限制: 1 <= prices.length <= 105
 *      0 <= prices[i] <= 104
 *
 * 链接: https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
 *
 */
object Leetcode121 {


    /**
     * 动态规划
     *
     * 执行用时：608 ms
     * 内存消耗：56.3 MB
     */
    fun maxProfit(prices: IntArray): Int {
        //0位是股票最低谷 1位是获取的最大利益
        val dp = intArrayOf(prices[0], 0)
        for (price in prices) {
            //当天价格大于最低价格 计算当天最低价格买入，今天卖出的价格
            if (price > dp[0]) {
                val profit = price - dp[0]
                if (profit > dp[1]) {
                    dp[1] = profit
                }
            }
            //当天价格小于等于最低价格
            else {
                dp[0] = price
            }
        }
        return dp[1]
    }


}