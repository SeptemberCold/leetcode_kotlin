package page003

/**
 *
 * 题目: 4的幂
 *
 * 描述: 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 *      整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
 * 限制: -231 <= n <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/power-of-four/description/
 *
 */
class Leetcode342 {

    /**
     * 位运算
     * 136 ms
     * 33.01 MB
     */
    fun isPowerOfFour(n: Int): Boolean {
        //大于0 二进制上只有一个1 1在偶数位上
        return n > 0 && (n and n - 1 == 0) && (n and 0xaaaaaaaa.toInt() == 0)
    }

}