package page001

/**
 *
 * 题目: 验证回文串
 *
 * 描述: 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
 *      字母和数字都属于字母数字字符。
 *      给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
 * 限制: 1 <= s.length <= 2 * 105
 *      s 仅由可打印的 ASCII 字符组成
 *
 * 链接: https://leetcode.cn/problems/valid-palindrome/
 *
 */
class Leetcode125 {

    /**
     * 筛选 + 判断
     * 执行用时：200 ms
     * 内存消耗：36 MB
     */
    fun isPalindrome(s: String): Boolean {
        val stringBuilder = StringBuilder()
        for (c in s) {
            //挑出小写字母
            if (c in 'a'..'z') {
                stringBuilder.append(c)
            }
            //大写转小写 挑出
            if (c in 'A'..'Z') {
                stringBuilder.append(c + 32)
            }
            //挑出数字
            if (c in '0'..'9') {
                stringBuilder.append(c)
            }
        }
        val str = stringBuilder.toString()
        println(str)
        //空参返回ture
        if (str.isEmpty()) return true
        //检查是不是回文
        val length = str.length
        for (i in 0..length / 2) {
            if (str[i] != str[length - 1 - i]) {
                return false
            }
        }
        return true
    }

}