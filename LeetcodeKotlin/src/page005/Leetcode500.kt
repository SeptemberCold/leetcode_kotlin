package page005

import java.util.*
import kotlin.collections.ArrayList

/**
 *
 * 题目: 键盘行
 *
 * 描述: 给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。
 *      美式键盘 中：
 *          第一行由字符 "qwertyuiop" 组成。
 *          第二行由字符 "asdfghjkl" 组成。
 *          第三行由字符 "zxcvbnm" 组成。
 * 限制: 1 <= words.length <= 20
 *      1 <= words[i].length <= 100
 *      words[i] 由英文字母（小写和大写字母）组成
 *
 * 链接: https://leetcode.cn/problems/keyboard-row/description/
 *
 */
class Leetcode500 {

    /**
     * 遍历
     * 时间 144ms
     * 内存 33.56MB
     */
    fun findWords(words: Array<String>): Array<String> {

        val result = ArrayList<String>()

        for (word in words) {
            if (word.isEmpty()) {
                result.add(word)
            } else {
                //转成小写
                val lowercase = word.lowercase(Locale.getDefault())
                //第一个字符在第几行
                val temp = findWords(lowercase[0])
                //当前字符在第几行
                var temp1 = temp
                for (c in lowercase) {
                    temp1 = findWords(c)
                    if (temp !=temp1) break
                }
                if (temp == temp1) result.add(word)
            }
        }
        return result.toTypedArray()
    }


    private fun findWords(word: Char): Int {
        val first = "qwertyuiop"
        val second = "asdfghjkl"
        val third = "zxcvbnm"
        return when (word) {
            in first -> 1
            in second -> 2
            in third -> 3
            else -> 0
        }
    }


}