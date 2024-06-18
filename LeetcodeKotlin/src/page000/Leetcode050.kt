package page000

/**
 *
 * 题目: Pow(x, n)
 *
 * 描述: 实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）。
 *
 * 限制: -100.0 < x < 100.0
 *      -231 <= n <= 231-1
 *      n 是一个整数
 *
 * 链接: https://leetcode.cn/problems/powx-n/description/
 *
 */
class Leetcode050 {

    /**
     * 递归+二分
     * 时间 144ms
     * 内存 34.10MB
     */
    fun myPow(x: Double, n: Int): Double {
        if (n == 0) return 1.0
        if (n == 1) return x
        if (n == -1) return 1 / x
        return if (n and 1 == 0) {
            myPow(x * x, n / 2)
        } else {
            myPow(x * x, (n - 1) / 2) * x
        }
    }

}