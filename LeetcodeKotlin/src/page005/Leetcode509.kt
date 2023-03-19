package page005

/**
 *
 * 题目: 斐波那契数
 *
 * 描述: 斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。
 *      该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 *      给定 n ，请计算 F(n) 。
 * 限制: 0 <= n <= 30
 *
 * 链接: https://leetcode.cn/problems/fibonacci-number/
 *
 */
object Leetcode509 {

    /**
     * 动态规划
     * 执行用时：116 ms
     * 内存消耗：32.1 MB
     */
    fun fib(n: Int): Int {
        val dp = intArrayOf(0, 1, 0)
        for (i in 0..n) {
            dp[2] = dp[2] + dp[0]
            dp[0] = dp[1]
            dp[1] = dp[2]
        }
        return dp[2]
    }


}