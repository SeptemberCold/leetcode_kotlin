package page007

import kotlin.math.min

/**
 *
 * 题目: 使用最小花费爬楼梯
 *
 * 描述: 给你一个整数数组 cost ，其中 cost[ i ] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。
 *      你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
 *      请你计算并返回达到楼梯顶部的最低花费。
 *
 * 限制: 2 <= cost.length <= 1000
 *      0 <= cost[i] <= 999
 *
 * 链接:https://leetcode.cn/problems/min-cost-climbing-stairs/
 *
 */
object Leetcode746 {

    /**
     * 动态规划
     * 执行用时: 188 ms
     * 内存消耗: 35.8 MB
     */
    fun minCostClimbingStairs(cost: IntArray): Int {
        val size = cost.size
        for (index in 2 until cost.size) {
            cost[index] = min(cost[index - 1], cost[index - 2]) + cost[index]
        }
        return min(cost[size - 1], cost[size - 2])
    }

}