package page002

/**
 *
 * 题目: 有效的字母异位词
 *
 * 描述: 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *      注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
 * 限制: 1 <= s.length, t.length <= 5 * 104
 *      s 和 t 仅包含小写字母
 *
 * 链接: https://leetcode.cn/problems/valid-anagram/
 *
 */
class Leetcode242 {

    /**
     * 哈希表
     * 执行用时：200 ms
     * 内存消耗：36.3 MB
     */
    fun isAnagram(s: String, t: String): Boolean {
        val map = HashMap<Char, Int>()
        val map2 = HashMap<Char, Int>()
        for (c in s) {
            map[c] = (map[c] ?: 0) + 1
        }
        for (c in t) {
            map2[c] = (map2[c] ?: 0) + 1
        }
        for (i in 'a'..'z') {
            val sum = map[i] ?: 0
            val sum2 = map2[i] ?: 0
            if (sum != sum2) return false
        }
        return true
    }

}