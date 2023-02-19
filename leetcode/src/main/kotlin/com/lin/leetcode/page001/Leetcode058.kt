package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/02/19/23:20
 * 最后一个单词的长度
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
 * 返回字符串中 最后一个 单词的长度。
 * 单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
object Leetcode058 {

    /**
     * 问题模拟
     * 执行用时：200 ms
     * 内存消耗：35.1 MB
     */
    private fun lengthOfLastWord(s: String): Int {
        val split = s.split(" ")
        if (split.isEmpty()) return 0
        for (i in split.size - 1 downTo 0) {
            if (split[i].isNotEmpty()) {
                return split[i].length
            }
        }
        return 0
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = lengthOfLastWord(it)
            println("answer=$answer")
        }
    }

    private fun getTestData(): List<String> {
        val example = ArrayList<String>()
        example.add("   fly me   to   the moon  ")
        return example
    }

}