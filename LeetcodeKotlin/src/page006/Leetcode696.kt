package page006

/**
 *
 * 题目: 计数二进制子串
 *
 * 描述: 给定一个字符串 s，统计并返回具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串中的所有 0 和所有 1 都是成组连续的。
 *      重复出现（不同位置）的子串也要统计它们出现的次数。
 *
 * 限制: 1 <= s.length <= 105
 *      s[i] 为 '0' 或 '1'
 *
 * 链接: https://leetcode.cn/problems/count-binary-substrings/description/
 *
 */
class Leetcode696 {

    /**
     * 统计
     * 时间：227ms
     * 内存：37.36MB
     */
    fun countBinarySubstrings(s: String): Int {
        var sum = 0
        var char = s[0]
        val array = ArrayList<Int>()

        for (c in s) {
            if (c == char) {
                sum += 1
            } else {
                array.add(sum)
                sum = 1
                char = c
            }
        }
        array.add(sum)
        sum = 0
        for (i in 0 until array.size - 1) {
            sum += if (array[i] > array[i + 1]) array[i + 1] else array[i]
        }

        return sum
    }

}