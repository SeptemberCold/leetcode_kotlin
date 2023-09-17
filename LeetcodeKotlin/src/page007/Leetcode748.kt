package page007

import java.util.*

/**
 *
 * 题目: 最短补全词
 *
 * 描述: 给你一个字符串 licensePlate 和一个字符串数组 words ，请你找出 words 中的 最短补全词 。
 *      补全词 是一个包含 licensePlate 中所有字母的单词。忽略 licensePlate 中的 数字和空格 。
 *      不区分大小写。如果某个字母在 licensePlate 中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。
 *      例如：licensePlate = "aBc 12c"，那么它的补全词应当包含字母 'a'、'b' （忽略大写）和两个 'c' 。可能的 补全词 有 "abccdef"、"caaacab" 以及 "cbca" 。
 *      请返回 words 中的 最短补全词 。题目数据保证一定存在一个最短补全词。
 *      当有多个单词都符合最短补全词的匹配条件时取 words 中 第一个 出现的那个。
 * 限制: 1 <= licensePlate.length <= 7
 *      licensePlate 由数字、大小写字母或空格 ' ' 组成
 *      1 <= words.length <= 1000
 *      1 <= words[i].length <= 15
 *      words[i] 由小写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/shortest-completing-word/description/
 *
 */
class Leetcode748 {

    /**
     * 统计
     * 时间 200ms
     * 内存 35.99MB
     */
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        var result = ""
        //建立用于统计的数组
        val array = getArray(licensePlate)

        //检查每个字符出现的次数
        for (word in words) {
            val wordArray = getArray(word)
            var isCompletingWord = true
            for (i in 0 until 26) {
                //不是补全词跳出循环
                if (wordArray[i] < array[i]) {
                    isCompletingWord = false
                    break
                }
            }
            //是补全词的话检查一下是否需要替换返回结果
            if (isCompletingWord){
                if (result.isEmpty() || result.length > word.length ){
                    result = word
                }
            }
        }
        return result
    }

    private fun getArray(word: String): Array<Int> {
        val array = Array(26) { return@Array 0 }
        val lowercase = word.lowercase(Locale.getDefault())
        for (c in lowercase) {
            if (c in 'a'..'z') {
                val i = c - 'a'
                array[i] = array[i] + 1
            }
        }
        return array
    }

}