package page005


/**
 *
 * 题目: 完美数
 *
 * 描述: 对于一个 正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。
 *      给定一个 整数 n， 如果是完美数，返回 true；否则返回 false。
 *
 * 限制: 1 <= num <= 108
 *
 * 链接: https://leetcode.cn/problems/perfect-number/description/
 *
 */
class Leetcode507 {

    /**
     * 打表 1亿内符合要求的只有5个数 官方的题解都打表了，还做个屁
     * 时间 126ms
     * 内存 32.57MB
     */
    fun checkPerfectNumber(num: Int): Boolean {
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336
    }

}