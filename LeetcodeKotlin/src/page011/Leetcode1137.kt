package page011

/**
 *
 * 题目: 第 N 个泰波那契数
 *
 * 描述: 泰波那契序列 Tn 定义如下：
 *      T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *      给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 *
 * 限制: 0 <= n <= 37
 *      答案保证是一个 32 位整数，即 answer <= 2^31 - 1。
 *
 * 链接: https://leetcode.cn/problems/n-th-tribonacci-number/description/
 *
 */
class Leetcode1137 {

    /**
     * 动态规划
     * 时间：160ms
     * 内存：36.64MB
     */
    fun tribonacci(n: Int): Int {
        if (n == 0) return 0
        val array = intArrayOf(0, 0, 1)
        for (i in 1 until n) {
            val tn = array.sum()
            array[0] = array[1]
            array[1] = array[2]
            array[2] = tn
        }

        return array[2]
    }

}