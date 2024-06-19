package page004

/**
 *
 * 题目: 字符串中的单词数
 *
 * 描述: 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *      请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 限制:
 *
 * 链接: https://leetcode.cn/problems/number-of-segments-in-a-string/description/
 *
 */
class Leetcode434 {

    /**
     * 字符串分割
     * 时间 143ms
     * 内存 35.36MB
     */
    fun countSegments(s: String): Int {
        var sum = 0
        val array = s.split(" ")
        for (i in array) {
            if (i.isNotEmpty()) {
                sum += 1
            }
        }
        return sum
    }

}