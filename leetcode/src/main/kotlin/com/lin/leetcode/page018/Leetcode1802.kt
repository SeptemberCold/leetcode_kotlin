package com.lin.leetcode.page018


/**
 * 有界数组中指定下标处的最大值
 * 给你三个正整数 n、index 和 maxSum 。你需要构造一个同时满足下述所有条件的数组 nums（下标 从 0 开始 计数）：
 * nums.length == n
 * nums[ i ] 是 正整数 ，其中 0 <= i < n
 * abs(nums[ i ] - nums[i+1]) <= 1 ，其中 0 <= i < n-1
 * nums 中所有元素之和不超过 maxSum
 * nums[ index ] 的值被 最大化 Cannot resolve symbol 'index'
 * 返回你所构造的数组中的 nums [index ]。
 */
object Leetcode1802 {


    /**
     * 0不是正整数
     * 穷举法 结果是算出来了  但在消耗时间上肉眼可见的慢
     * 在力扣上有几个示例出现了错误->超出时间限制 无法完整测试
     */
    private fun maxValue01(n: Int, index: Int, maxSum: Int): Int {
        //取一个平均数
        val ave = maxSum / n
        //从平均数开始穷举
        for (i in ave..maxSum) {
            var sum = 0
            var left = i
            for (leftIndex in 0 until index) {
                if (left >= 2) left--
                sum += left
            }
            var right = i
            for (rightIndex in index until n) {
                sum += right
                if (right >= 2) right--
            }
            if (sum == maxSum) {
                return i
            } else if (sum > maxSum) {
                return i - 1
            }
        }
        return -1
    }



    @JvmStatic
    fun main(args: Array<String>) {
        //方法一测试
        val a = maxValue01(4, 2, 6)
        val b = maxValue01(6, 1, 10)
        println("a=${a}")
        println("b=${b}")
        val c = maxValue01(4, 0, 4)
        println("c=${c}")
        val d = maxValue01(2, 0, 798870804)
        println("d=${d}")
        val e = maxValue01(1, 0, 444029221)
        println("e=${e}")

    }


}