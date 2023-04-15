package page002

/**
 * 题目: 2的幂
 *
 * 描述: 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。\
 *      如果存在一个整数 x 使得n == 2x ，则认为 n 是 2 的幂次方。
 * 限制: -231 <= n <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/power-of-two/
 */
class Leetcode231 {

    /**
     * 二进制计算
     * 执行用时：132 ms
     * 内存消耗：32.5 MB
     */
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && n and n - 1 == 0
    }

}