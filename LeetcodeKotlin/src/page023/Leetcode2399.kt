package page023

/**
 *
 * 题目:检查相同字母间的距离
 *
 * 描述: 给你一个下标从 0 开始的字符串 s ，该字符串仅由小写英文字母组成，s 中的每个字母都 恰好 出现 两次 。
 *      另给你一个下标从 0 开始、长度为 26 的的整数数组 distance 。
 *      字母表中的每个字母按从 0 到 25 依次编号（即，'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25）。
 *      在一个 匀整 字符串中，第 i 个字母的两次出现之间的字母数量是 distance[i] 。
 *      如果第 i 个字母没有在 s 中出现，那么 distance[i] 可以 忽略 。
 *      如果 s 是一个 匀整 字符串，返回 true ；否则，返回 false 。
 * 限制:  2 <= s.length <= 52
 *       s 仅由小写英文字母组成
 *       s 中的每个字母恰好出现两次
 *       distance.length == 26
 *       0 <= distance[i] <= 50
 *
 * 链接: https://leetcode.cn/problems/check-distances-between-same-letters/
 *
 */
class Leetcode2399 {

    /**
     * 哈希表
     * 执行用时：216 ms
     * 内存消耗：38.3 MB
     */
    fun checkDistances(s: String, distance: IntArray): Boolean {
        val map = HashMap<Char, Int>()
        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                val dis = i - map[s[i]]!! - 1
                if (dis != distance[(s[i] - 'a')]) {
                    return false
                }
            } else {
                map[s[i]] = i
            }
        }
        return true
    }

}