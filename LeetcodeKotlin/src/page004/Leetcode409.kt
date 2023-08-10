package page004

/**
 *
 * 题目: 最长回文串
 *
 * 描述: 给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
 *      在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。
 * 限制: 1 <= s.length <= 2000
 *      s 只由小写 和/或 大写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/longest-palindrome/description/
 *
 */
class Leetcode409 {

    /**
     * 哈希表
     * 时间 152ms
     * 内存 32.65mb
     */
    fun longestPalindrome(s: String): Int {
        val hash = HashMap<Char, Int>()
        for (c in s) {
            hash[c] = (hash[c] ?: 0) + 1
        }
        var add = 0
        var one = 0
        for (entry in hash) {
            if (entry.value % 2 == 0) {
                add += entry.value
            } else {
                add += entry.value - 1
                one = 1
            }
        }
        return add + one
    }

}