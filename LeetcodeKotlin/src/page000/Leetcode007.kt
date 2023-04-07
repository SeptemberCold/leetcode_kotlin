package page000

/**
 *
 * 题目:  整数反转
 *
 * 描述: 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *      如果反转后整数超过 32 位的有符号整数的范围[Int.MIN_VALUE, Int.MAX_VALUE] ，
 *      就返回 0。假设环境不允许存储 64 位整数（有符号或无符号）。
 * 限制: Int.MIN_VALUE <= x <= Int.MAX_VALUE
 *
 * 链接: https://leetcode.cn/problems/reverse-integer/
 *
 */
class Leetcode007 {


    /**
     * 数学模拟
     * 执行用时：128 ms
     * 内存消耗：32.4 MB
     */
    fun reverse(x: Int): Int {
        //转成Long类型计算
        var temp: Long = x.toLong()
        //存储翻转结果
        var result = 0L
        //x的翻转
        while (temp != 0L) {
            val l = temp % 10
            result = result * 10 + l
            temp /= 10
        }
        //判断翻转后的result是否在Int的范围，如果不在返回0
        if (result > Int.MAX_VALUE || result < Int.MIN_VALUE) {
            return 0
        }
        return result.toInt()
    }


}