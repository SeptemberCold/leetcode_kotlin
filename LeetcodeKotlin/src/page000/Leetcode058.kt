package page000

/**
 *
 * 题目: 最后一个单词的长度
 *
 * 描述: 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
 *      返回字符串中 最后一个 单词的长度。
 *      单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 * 限制: 1 <= s.length <= 104
 *      s 仅有英文字母和空格 ' ' 组成
 *      s 中至少存在一个单词
 *
 * 链接: https://leetcode.cn/problems/length-of-last-word/
 *
 */
class Leetcode058 {

    /**
     * api运用
     * 执行用时：188 ms
     * 内存消耗：36.6 MB
     */
    fun lengthOfLastWord(s: String): Int {
        val split = s.split(" ")
        for (i in split.size - 1 downTo 0) {
            if (split[i].isNotEmpty()) {
                return split[i].length
            }
        }
        return 0
    }

    /**
     * 倒序遍历
     * 执行用时：140 ms
     * 内存消耗：33.9 MB
     */
    fun lengthOfLastWord2(s: String): Int {
        var end = -1
        //倒序遍历
        for (i in s.length - 1 downTo 0) {
            //遇到最后一个字母，记录索引
            if (end == -1 && s[i] != ' ') end = i
            //遇到最后一个字母再找到空格 表示遍历完一个单词
            if (end != -1 && s[i] == ' ') return end - i
        }
        //根据已知条件 如果没有前置空格 可能字符串里只有一个单词
        return end + 1
    }


}