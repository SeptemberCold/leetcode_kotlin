package page000

/**
 *
 * 题目: 找出字符串中第一个匹配项的下标
 *
 * 描述: 给你两个字符串 haystack 和 needle ，
 *      请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
 *      如果 needle 不是 haystack 的一部分，则返回  -1 。
 * 限制: 1 <= haystack.length, needle.length <= 104
 *      haystack 和 needle 仅由小写英文字符组成
 *
 * 链接: https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 *
 */
class Leetcode028 {

    /**
     * 字符分隔
     * 时间 168ms
     * 内存 33.72mb
     */
    fun strStr(haystack: String, needle: String): Int {
        val array = haystack.split(needle)
        return if (array.size == 1) {
            -1
        } else {
            array[0].length
        }
    }

}