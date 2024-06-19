package page004

/**
 *
 * 题目: 排列硬币
 *
 * 描述: 你总共有 n 枚硬币，并计划将它们按阶梯状排列。
 *      对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。
 *      阶梯的最后一行 可能 是不完整的。
 *      给你一个数字 n ，计算并返回可形成 完整阶梯行 的总行数。
 *
 * 限制: 1 <= n <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/arranging-coins/description/
 *
 */
class Leetcode441 {

    /**
     * 迭代递减
     * 时间 131ms
     * 内存 33.08MB
     */
    fun arrangeCoins(n: Int): Int {
        var sum = 0
        var mn = n
        for (i in 1..Int.MAX_VALUE) {
            mn -= i
            if (mn >= 0) {
                sum += 1
            } else {
                return sum
            }
        }
        return 0
    }


}