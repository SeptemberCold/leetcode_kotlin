package page008

import kotlin.math.min

/**
 *
 * 题目: 字符的最短距离
 *
 * 描述: 给你一个字符串 s 和一个字符 c ，且 c 是 s 中出现过的字符。
 *      返回一个整数数组 answer ，其中 answer.length == s.length 且 answer[i] 是 s 中从下标 i 到离它 最近 的字符 c 的 距离 。
 *      两个下标 i 和 j 之间的 距离 为 abs(i - j) ，其中 abs 是绝对值函数。
 *
 * 限制: 1 <= s.length <= 104
 *      s[i] 和 c 均为小写英文字母
 *      题目数据保证 c 在 s 中至少出现一次
 *
 * 链接: https://leetcode.cn/problems/shortest-distance-to-a-character/description/
 *
 */
class Leetcode821 {

    /**
     * 遍历
     * 时间 183ms
     * 内存 35.44MB
     */
    fun shortestToChar(s: String, c: Char): IntArray {
        val answer = IntArray(s.length) { return@IntArray s.length + 2 }
        //前往后扫一次
        var temp = 0
        for (i in s.indices) {
            if (s[i] == c) {
                for (j in temp..i) {
                    answer[j] = i - j
                }
                temp = i + 1
            }
        }
        //后往前扫一次
        temp = s.length - 1
        for (i in s.length - 1 downTo 0) {
            if (s[i] == c) {
                for (j in temp downTo i) {
                    val value = answer[j]
                    answer[j] = min(value, j - i)
                }
            }
        }
        return answer
    }

}