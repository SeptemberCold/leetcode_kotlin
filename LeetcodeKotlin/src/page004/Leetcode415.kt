package page004

import java.lang.StringBuilder

/**
 *
 * 题目: 字符串相加
 *
 * 描述: 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
 *      你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
 *
 * 限制: 1 <= num1.length, num2.length <= 104
 *      num1 和num2 都只包含数字 0-9
 *      num1 和num2 都不包含任何前导零
 *
 * 链接: https://leetcode.cn/problems/add-strings/description/
 *
 */
class Leetcode415 {

    /**
     * 模拟
     * 时间 174ms
     * 内存 36.28MB
     */
    fun addStrings(num1: String, num2: String): String {
        var add = 0
        val aLength = num1.length
        val bLength = num2.length
        val sb = StringBuilder()
        for (i in 1..num1.length.coerceAtLeast(num2.length)) {
            val a = if (aLength >= i) num1[aLength - i] else '0'
            val b = if (bLength >= i) num2[bLength - i] else '0'
            val sum = a.code + b.code - 2 * '0'.code + add
            add = sum / 10
            sb.insert(0, sum % 10)
        }
        if (add == 1) {
            sb.insert(0, 1)
        }
        return sb.toString()
    }

}