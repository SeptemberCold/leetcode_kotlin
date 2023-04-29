package page024

import kotlin.math.abs

/**
 *
 * 题目: 删除字符使频率相同
 *
 * 描述: 给你一个下标从 0开始的字符串word，字符串只包含小写英文字母。
 *      你需要选择 一个下标并 删除下标处的字符，使得 word中剩余每个字母出现 频率相同。
 *      如果删除一个字母后，word中剩余所有字母的出现频率都相同，那么返回 true，否则返回 false。
 *      注意：
 *      字母 x 的 频率 是这个字母在字符串中出现的次数。
 *      你 必须 恰好删除一个字母，不能一个字母都不删除。
 *
 * 链接: 2 <= word.length <= 100
 *      word 只包含小写英文字母。
 *
 */
class Leetcode2423 {

    /**
     * 暴力枚举
     * 执行用时：128 ms
     * 内存消耗：32.2 MB
     */
    fun equalFrequency(word: String): Boolean {
        val map = HashMap<Char, Int>()
        //算出频率
        for (c in word) {
            map[c] = (map[c] ?: 0) + 1
        }
        //字符出现的频率
        var temp1 = -1
        var temp2 = -1
        //出现的次数
        var temp1Sum = 0
        var temp2Sum = 0
        for (entry in map) {
            val value = entry.value
            //找到第一个频率
            if (temp1 == -1 || temp1 == value) {
                temp1 = value
                temp1Sum += 1
            }
            //找到第二个频率
            else if (temp2 == -1 || temp2 == value) {
                temp2 = entry.value
                temp2Sum += 1
            }
            //出现第三种频率
            else {
                return false
            }
        }
        //如果只有一种元素 直接返回true
        if (map.size == 1) return true
        //只出现过一种频率 且频率是1 可以直接返回true
        if (temp2Sum == 0 && temp1 == 1) return true
        //只出现一次的频率 且频率是1 可以直接返回true
        if (temp2Sum == 1 && temp2 == 1) return true
        if (temp1Sum == 1 && temp1 == 1) return true
        //如果两种频率都多次出现 返回false
        if (temp1Sum != 1 && temp2Sum != 1) return false
        //如果两种频的差值不等于1 返回false
        if (abs(temp1 - temp2) != 1) return false
        //出现少的那种频率一定需要比多的那种频率大1
        if (temp1Sum > temp2Sum) return ((temp2 - temp1) == 1)
        if (temp2Sum > temp1Sum) return ((temp1 - temp2) == 1)
        //减1可以频率相同
        return true
    }

}