package page002

/**
 *
 * 题目: 丑数
 *
 * 描述: 丑数 就是只包含质因数 2、3 和 5 的正整数。
 *      给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
 * 限制: Int.MIN <= n <= Int.Max
 *
 * 链接: https://leetcode.cn/problems/ugly-number/description/
 *
 */
class Leetcode263 {

    /**
     * 数学
     * 148ms
     * 32.78MB
     */
    fun isUgly(n: Int): Boolean {
        if (n == 0) return true
        var temp = n
        while (temp != 1) {
            if (temp % 5 == 0) {
                temp /= 5
                continue
            }
            if (temp % 3 == 0) {
                temp /= 3
                continue
            }
            if (temp % 2 == 0) {
                temp /= 2
                continue
            }
            break
        }
        return temp == 1
    }

}