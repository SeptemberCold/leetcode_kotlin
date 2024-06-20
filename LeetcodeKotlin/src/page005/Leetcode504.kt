package page005

import java.lang.StringBuilder
import kotlin.math.abs

/**
 *
 * 题目: 七进制数
 *
 * 描述: 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
 *
 * 限制: -107 <= num <= 107
 *
 * 链接: https://leetcode.cn/problems/base-7/description/
 *
 */
class Leetcode504 {

    /**
     * 数学
     * 时间 160ms
     * 内存 35.03MB
     */
    fun convertToBase7(num: Int): String {
        if (num == 0) return "0"
        var temp = abs(num)
        val sb = StringBuilder()
        while (temp != 0) {
            val i = temp % 7
            temp = (temp - i) / 7
            sb.append(i)
        }
        if (num < 0) {
            sb.append("-")
        }
        return sb.toString().reversed()
    }

}