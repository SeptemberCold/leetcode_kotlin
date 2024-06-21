package page005

import java.lang.StringBuilder

/**
 *
 * 题目: 反转字符串 II
 *
 * 描述: 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 *      如果剩余字符少于 k 个，则将剩余字符全部反转。
 *      如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *
 * 限制: 1 <= s.length <= 104
 *      s 仅由小写英文组成
 *      1 <= k <= 104
 *
 * 链接: https://leetcode.cn/problems/reverse-string-ii/description/
 *
 */
class Leetcode541 {

    /**
     * 模拟
     * 执行用时：186 ms
     * 内存消耗：38.02 MB
     */
    fun reverseStr(s: String, k: Int): String {
        val sb = StringBuilder()

        for (i in s.indices step k) {
            val end = (i + k).coerceAtMost(s.length)
            val str = s.substring(i, end)
            if (i / k and 1 == 0) {
                sb.append(str.reversed())
            } else {
                sb.append(str)
            }
        }
        return sb.toString()
    }

}