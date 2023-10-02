package page001

/**
 *
 * 题目: 买卖股票的最佳时机 II
 *
 * 描述: 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
 *      在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。
 *      你也可以先购买，然后在 同一天 出售。
 *      返回 你能获得的 最大 利润 。
 * 限制: 1 <= prices.length <= 3 * 104
 *      0 <= prices[i] <= 104
 *
 * 链接: https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=daily-question&envId=2023-10-02
 *
 */
class Leetcode122 {

    /**
     * 贪心
     * 时间 184ms
     * 内存 35.69MB
     */
    fun maxProfit(prices: IntArray): Int {

        var sum = 0

        for (i in 1 until prices.size) {
            val pr = prices[i] - prices[i - 1]
            if (pr > 0) sum += pr
        }
        return sum

    }

}