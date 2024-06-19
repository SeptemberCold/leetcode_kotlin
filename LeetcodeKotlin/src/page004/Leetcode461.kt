package page004

/**
 *
 * 题目: 汉明距离
 *
 * 描述: 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 *      给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 *
 * 限制: 0 <= x, y <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/hamming-distance/description/
 *
 */
class Leetcode461 {

    /**
     * 二进制计算
     * 时间 135ms
     * 内存 32.77MB
     */
    fun hammingDistance(x: Int, y: Int): Int {
        var i = x xor y
        var sum = 0
        while (i != 0) {
            if (i and 1 == 1) sum += 1
            i = i shr 1
        }
        return sum
    }

}