package page000

/**
 *
 * 题目: 最长回文子串
 *
 * 描述: 给你一个字符串 s，找到 s 中最长的回文子串。
 *      如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 * 限制: 1 <= s.length <= 1000
 *      s 仅由数字和英文字母组成
 *
 * 链接: https://leetcode.cn/problems/longest-palindromic-substring/description/
 *
 */
class Leetcode005 {

    /**
     * 暴力破解
     * 时间 236ms
     * 内存 35.63MB
     */
    fun longestPalindrome(s: String): String {
        var len = s.length
        val chars = s.toCharArray()
        while (len != 0) {
            for (i in 0..(s.length - len)) {
                var result = true
                for (j in i..(len / 2) + i) {
                    val j2 = len + i - 1 - j + i
                    if (chars[j] != chars[j2]) {
                        result = false
                        break
                    }
                }
                if (result) return s.substring(i, len + i)
            }
            len -= 1
        }
        return s[0].toString()
    }

}