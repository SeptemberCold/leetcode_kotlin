package page024

/**
 *
 * 题目: 数组中字符串的最大值
 *
 * 描述: 一个由字母和数字组成的字符串的 值定义如下：
 *      如果字符串 只 包含数字，那么值为该字符串在 10进制下的所表示的数字。
 *      否则，值为字符串的 长度。
 *      给你一个字符串数组strs，每个字符串都只由字母和数字组成，请你返回 strs中字符串的 最大值。
 * 限制: 1 <= strs.length <= 100
 *      1 <= strs[i].length <= 9
 *      strs[i] 只包含小写英文字母和数字。
 *
 * 链接: https://leetcode.cn/problems/maximum-value-of-a-string-in-an-array/
 *
 */
class Leetcode2496 {

    /**
     * 字符串遍历
     * 执行用时：140 ms
     * 内存消耗：32.7 MB
     */
    fun maximumValue(strs: Array<String>): Int {
        var result = 0
        for (str in strs) {
            var tag = false
            for (c in str) {
                if (c in 'a'..'z' || c in 'A'..'Z') {
                    if (str.length > result) {
                        result = str.length
                    }
                    tag = true
                    break
                }
            }
            if (!tag) {
                if (str.toInt() > result) {
                    result = str.toInt()
                }
            }
        }
        return result
    }

}