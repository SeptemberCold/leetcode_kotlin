package page003

/**
 *
 * 题目: 找不同
 *
 * 描述: 给定两个字符串 s 和 t ，它们只包含小写字母。
 *      字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *      请找出在 t 中被添加的字母。
 * 限制: 0 <= s.length <= 1000
 *      t.length == s.length + 1
 *      s 和 t 只包含小写字母
 *
 * 链接: https://leetcode.cn/problems/find-the-difference/
 *
 */
class Leetcode389 {

    /**
     * 求和
     * 力扣上kotlin的没有char.code方法 需要改成char.toInt()才可以执行
     *
     * 执行用时：148 ms
     * 内存消耗：33.7 MB
     */
    fun findTheDifference(s: String, t: String): Char {
        var sum = 0
        for (c in s) {
            sum += c.code
        }
        var sum2 = 0
        for (c in t) {
            sum2 += c.code
        }
        return (sum2 - sum).toChar()
    }

}