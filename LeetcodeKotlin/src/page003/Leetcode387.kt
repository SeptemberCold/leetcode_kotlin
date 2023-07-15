package page003

/**
 *
 * 题目: 字符串中的第一个唯一字符
 *
 * 描述: 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 * 限制: 1 <= s.length <= 105
 *      s 只包含小写字母
 *
 * 链接: https://leetcode.cn/problems/first-unique-character-in-a-string/
 *
 */
class Leetcode387 {

    /**
     * 哈希表 暴力破解
     * 执行用时：264 ms
     * 内存消耗：36.5 MB
     */
    fun firstUniqChar(s: String): Int {
        val temp = HashMap<Char, Int>()

        for (c in s) {
            temp[c] = (temp[c] ?: 0) + 1
        }

        val only = ArrayList<Char>()

        for (entry in temp) {
            if (entry.value == 1) {
                only.add(entry.key)
            }
        }

        for (i in s.indices) {
            if (only.contains(s[i])) {
                return i
            }
        }

        return -1
    }

    /**
     * 方法一的优化
     *
     * 执行用时：256 ms
     * 内存消耗：36.5 MB
     */
    fun firstUniqChar2(s: String): Int {
        val temp = HashMap<Char, Int>()
        for (c in s) {
            temp[c] = (temp[c] ?: 0) + 1
        }
        for (i in s.indices) {
            if (temp[s[i]] == 1) {
                return i
            }
        }
        return -1
    }

}