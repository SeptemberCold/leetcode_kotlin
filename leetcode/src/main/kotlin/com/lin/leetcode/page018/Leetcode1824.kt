package com.lin.leetcode.page018

/**
 *
 * @author lin
 * @date 2023/01/21/20:28
 *
 * 最少侧跳次数
 * 给你一个长度为n的3 跑道道路，它总共包含n + 1个点，编号为0到n。
 * 一只青蛙从0号点第二条跑道出发，它想要跳到点n处。然而道路上可能有一些障碍。
 * 给你一个长度为 n + 1的数组obstacles，其中obstacles[ i ]（取值范围从 0 到 3）表示在点 i处的obstacles[ i ]跑道上有一个障碍。
 * 如果obstacles[ i ] == 0，那么点i处没有障碍。任何一个点的三条跑道中最多有一个障碍。
 * 比方说，如果obstacles[2] == 1，那么说明在点 2 处跑道 1 有障碍。
 * 这只青蛙从点 i跳到点 i + 1且跑道不变的前提是点 i + 1的同一跑道上没有障碍。
 * 为了躲避障碍，这只青蛙也可以在同一个点处侧跳到 另外一条跑道（这两条跑道可以不相邻），但前提是跳过去的跑道该点处没有障碍。
 * 比方说，这只青蛙可以从点 3 处的跑道 3 跳到点 3 处的跑道 1 。
 * 这只青蛙从点 0 处跑道 2出发，并想到达点 n处的任一跑道 ，请你返回最少侧跳次数。
 * 注意：点 0处和点 n处的任一跑道都不会有障碍。
 */
object Leetcode1824 {

    /**
     * 动态规划
     * 执行用时：664 ms
     * 内存消耗：127.4 MB
     */
    private fun minSideJumps(obstacles: IntArray): Int {
        val max = Integer.MAX_VALUE / 2
        val dp = intArrayOf(max, 1, 0, 1)
        obstacles.forEach {
            dp[it] = max
            val min = dp[1].coerceAtMost(dp[2].coerceAtMost(dp[3]))
            for (i in 0 until 3) {
                dp[i + 1] = dp[i + 1].coerceAtMost(min + 1)
            }
            dp[it] = max
        }
        return dp[1].coerceAtMost(dp[2].coerceAtMost(dp[3]))
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = minSideJumps(it)
            println("answer=${answer}")
        }
    }

    private fun getTestData(): List<IntArray> {
        val intArray = ArrayList<IntArray>()
        intArray.add(intArrayOf(0, 1, 2, 3, 0))
        intArray.add(intArrayOf(0, 1, 1, 3, 3, 0))
        intArray.add(intArrayOf(0, 2, 1, 0, 3, 0))
        return intArray
    }


}