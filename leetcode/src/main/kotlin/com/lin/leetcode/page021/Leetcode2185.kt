package com.lin.leetcode.page021


/**
 *
 * @author lin
 * @date 2023/01/08/14:13
 *
 * 统计包含给定前缀的字符串
 * 给你一个字符串数组 words 和一个字符串 pref 。
 * 返回 words 中以 pref 作为 前缀 的字符串的数目。
 * 字符串 s 的 前缀 就是 s 的任一前导连续字符串。
 */
object Leetcode2185 {

    /**
     * 执行用时：184 ms
     * 内存消耗：35.6 MB
     */
    private fun prefixCount01(words: Array<String>, pref: String): Int {
        var result = 0
        words.forEach {
            if (it.startsWith(pref)) {
                result += 1
            }
        }
        return result
    }

    /**
     * 先预处理 性能也没好到那里
     * 执行用时：188 ms
     * 内存消耗：35.4 MB
     */
    private fun prefixCount02(words: Array<String>, pref: String): Int {
        var result = 0
        for (word in words) {
            if (word < pref) continue
            if (word.startsWith(pref)) {
                result += 1
            }
        }
        return result
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val prefixCount = prefixCount01(it.value, it.key)
            println("${it.key} = $prefixCount")
        }
        println("======================")
        getTestData().forEach {
            val prefixCount = prefixCount02(it.value, it.key)
            println("${it.key} = $prefixCount")
        }
    }


    private fun getTestData(): Map<String, Array<String>> {
        val map = HashMap<String, Array<String>>()
        map["at"] = arrayOf("pay", "attention", "practice", "attend")
        return map
    }

}