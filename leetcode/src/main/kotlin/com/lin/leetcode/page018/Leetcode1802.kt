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

    /**
     * 也是穷举法 相比第一种，没有利用循环相加计算左右的值
     * 因为参数过分大的情况下 循环会消耗大量的时间
     * 所以使用排列公式直接计算左右的值，为0时还要补1，因为要求正整数
     * 执行用时：148 ms
     * 内存消耗：32.5 MB
     */
    private fun maxValue02(n: Int, index: Int, maxSum: Int): Int {
        //取一个平均数
        val ave = maxSum / n
        //从平均数开始穷举
        for (i in ave..maxSum) {
            //算出左边的数
            var result: Int = if (i < index + 1) {
                i * (i + 1) / 2 + (index + 1 - i)
            } else {
                (index + 1) * (i + i - index) / 2
            }
            //算出右边的数
            result += if (i - 1 < n - index - 1) {
                (i - 1) * (i) / 2 + (n - index - i)
            } else {
                (n - index - 1) * (i - 1 + (i - (n - index - 1))) / 2
            }
            //如果相等刚刚好
            if (result == maxSum) {
                return i
            }
            //如果变大了 就前一位就是结果
            if (result > maxSum) {
                return i - 1
            }
        }
        return -1
    }


    @JvmStatic
    fun main(args: Array<String>) {
        //方法一测试
        getTestData().forEach {
            val result = maxValue01(it[0], it[1], it[2])
            println("test01 ${it[0]} ${it[1]} ${it[2]} = $result")
        }
        println("=============================")
        //方法二测试
        getTestData().forEach {
            val result = maxValue02(it[0], it[1], it[2])
            println("test02 ${it[0]} ${it[1]} ${it[2]} = $result")
        }
    }


    private fun getTestData(): List<IntArray> {
        val data = ArrayList<IntArray>()
        data.add(intArrayOf(4, 2, 6))
        data.add(intArrayOf(6, 1, 10))
        data.add(intArrayOf(4, 0, 4))
        data.add(intArrayOf(2, 0, 798870804))
        //这个测试用例会让方法一陷入非常深循环中
//        data.add(intArrayOf(8257285, 4828516, 850015631))
        data.add(intArrayOf(8, 7, 14))
        data.add(intArrayOf(9, 5, 24))
        return data
    }


}