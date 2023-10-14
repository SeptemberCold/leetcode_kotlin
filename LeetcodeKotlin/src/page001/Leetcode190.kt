package page001

import kotlin.math.pow

/**
 *
 * 题目: 颠倒二进制位
 *
 * 描述: 颠倒给定的 32 位无符号整数的二进制位。
 *      提示：
 *          请注意，在某些语言（如 Java）中，没有无符号整数类型。
 *          在这种情况下，输入和输出都将被指定为有符号整数类型，
 *          并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 *          在 Java 中，编译器使用二进制补码记法来表示有符号整数。
 *          因此，在 示例 2 中，输入表示有符号整数 -3，输出表示有符号整数 -1073741825。

 * 限制: 输入是一个长度为 32 的二进制字符串
 *
 * 链接: https://leetcode.cn/problems/reverse-bits/description/
 *
 */
class Leetcode190 {

    /**
     * 位运算
     * 时间 120ms
     * 内存 31.62MB
     */
    fun reverseBits(n: Int): Int {
        var temp = n
        var rev = 0
        for (i in 0..31) {
            if (temp == 0) break
            rev = rev or (temp and 1 shl 31 - i)
            temp = temp ushr 1
        }
        return rev
    }

    /**
     * 位运算2
     * 时间 124ms
     * 内存 30.57MB
     */
    fun reverseBits2(n: Int): Int {
        var sum = 0
        for (i in 0 until 31) {
            if ((n ushr 31 - i) and 1 >= 1) {
                sum += 2.0.pow(i).toInt()
            }
        }

        if ((n ushr 0) and 1 >= 1) {
            sum  = sum or (1 shl 31)
        }
        return sum
    }

}