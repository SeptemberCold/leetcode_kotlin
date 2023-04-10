package page000

/**
 *
 * 题目: 最长公共前缀
 *
 * 描述: 编写一个函数来查找字符串数组中的最长公共前缀。
 *      如果不存在公共前缀，返回空字符串 ""。
 * 限制: 1 <= strs.length <= 200
 *      0 <= strs[i].length <= 200
 *      strs[i] 仅由小写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/longest-common-prefix/
 *
 */
class Leetcode014 {

    /**
     * 模拟
     * 执行用时：192 ms
     * 内存消耗： 35.2 MB
     */
    fun longestCommonPrefix(strs: Array<String>): String {
        val answer = StringBuilder()
        var index = 0
        while (true) {
            var c = ' '
            for (str in strs) {
                //最后一个 返回结果
                if (index >= str.length) return answer.toString()
                if (c == ' ') {
                    c = str[index]
                } else {
                    if (c != str[index]) return answer.toString()
                }
            }
            answer.append(c)
            index++
        }
    }

}