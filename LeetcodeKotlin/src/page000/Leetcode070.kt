package page000

/**
 *
 * 题目: 爬楼梯
 *
 * 描述: 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *      每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 限制: 1 <= n <= 45
 *
 * 链接: https://leetcode.cn/problems/climbing-stairs/
 */
object Leetcode070 {


    /**
     * 动态规划
     * 经测试，使用数组比使用3个变量的资源消耗多些
     * 但这样写简洁些
     * 执行用时: 140 ms
     * 内存消耗: 32 MB
     */
    fun climbStairs(n: Int): Int {
        //爬到上上一层的方法数
        //爬到上一层的方法数
        //爬到当前层的方法数
        val dp = intArrayOf(0, 0, 1)
        //计算爬到某阶有多少种方法 直到计算到最后，也就是n阶的时候
        for (i in 1..n) {
            dp[0] = dp[1]
            dp[1] = dp[2]
            dp[2] = dp[0] + dp[1]
        }
        return dp[2]
    }

}