package page005

/**
 *
 * 题目: 检测大写字母
 *
 * 描述: 我们定义，在以下情况时，单词的大写用法是正确的：
 *      全部字母都是大写，比如 "USA" 。
 *      单词中所有字母都不是大写，比如 "leetcode" 。
 *      如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
 *      给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。
 *
 * 限制: 1 <= word.length <= 100
 *      word 由小写和大写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/detect-capital/description/
 *
 */
class Leetcode520 {

    /**
     * 统计
     * 执行用时：141 ms
     * 内存消耗：36.61 MB
     */
    fun detectCapitalUse(word: String): Boolean {
        var count = 0
        for (i in word) {
            if (i < 'a') count += 1
        }
        //都是大写
        if (count == word.length) return true
        //都是小写
        if (count == 0) return true
        //首字母大写
        return count == 1 && word[0] < 'a'
    }

}