package page024

import kotlin.math.min

/**
 *
 * 题目: 公因子的数目
 *
 * 描述: 给你两个正整数 a 和 b ，返回 a 和 b 的 公 因子的数目。
 *      如果 x 可以同时整除 a 和 b ，则认为 x 是 a 和 b 的一个 公因子 。
 * 限制: 1 <= a, b <= 1000
 *
 * 链接: https://leetcode.cn/problems/number-of-common-factors/
 *
 */
object Leetcode2427 {

    fun commonFactors(a: Int, b: Int): Int {
        var result = 0
        for (i in min(a,b) downTo 1) {
            if (a % i == 0 && b % i == 0) {
                result++
            }
        }
        return result
    }

}