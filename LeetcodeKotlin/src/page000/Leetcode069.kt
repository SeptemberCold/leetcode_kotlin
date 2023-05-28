package page000

/**
 *
 * 题目: x 的平方根
 *
 * 描述: 给你一个非负整数 x ，计算并返回x的 算术平方根 。
 *      由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 *      注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 * 限制: 0 <= x <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/sqrtx/
 *
 */
class Leetcode069 {

    /**
     * 暴力破解
     * 执行用时：212 ms
     * 内存消耗：32.5 MB
     */
    fun mySqrt(x: Int): Int {
        for (i in 0..x) {
            val add = i.toDouble() * i
            if (add > x) {
                return i - 1
            } else if (add == x.toDouble()) {
                return i
            }
        }
        return 0
    }

}