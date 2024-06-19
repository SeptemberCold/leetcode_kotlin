package page004

import kotlin.math.pow

/**
 *
 * 题目: 数字的补数
 *
 * 描述: 对整数的二进制表示取反（0 变 1 ，1 变 0）后，再转换为十进制表示，可以得到这个整数的补数。
 *      例如，整数 5 的二进制表示是 "101" ，取反后得到 "010" ，再转回十进制表示得到补数 2 。
 *      给你一个整数 num ，输出它的补数。
 *
 * 限制: 1 <= num < 231
 *
 * 链接: https://leetcode.cn/problems/number-complement/description/
 *
 */
class Leetcode476 {

    /**
     * 二进制运算
     * 时间 129ms
     * 内存 32.71MB
     */
    fun findComplement(num: Int): Int {
        var i = 0
        var temp = num
        while (temp != 0){
            temp  = temp shr 1
            i += 1
        }
        val sum = (2.0.pow(i) - 1).toInt()
        return num xor sum
    }

}