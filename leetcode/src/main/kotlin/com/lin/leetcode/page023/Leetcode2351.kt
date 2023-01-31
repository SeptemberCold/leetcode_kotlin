package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/31/20:35
 *
 * 第一个出现两次的字母
 * 给你一个由小写英文字母组成的字符串 s ，请你找出并返回第一个出现 两次 的字母。
 * 注意：
 * 如果 a 的 第二次 出现比 b 的 第二次 出现在字符串中的位置更靠前，则认为字母 a 在字母 b 之前出现两次。
 * s 包含至少一个出现两次的字母。
 */
object Leetcode2351 {

    /**
     * 执行用时：152 ms
     * 内存消耗：32.9 MB
     */
    private fun repeatedCharacter(s: String): Char {
        val hash = HashMap<Char, Int>()
        for (c in s) {
            if (hash.containsKey(c)) {
                return c
            } else {
                hash[c] = 0
            }
        }
        return 'a'
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = repeatedCharacter(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<String> {
        val array = ArrayList<String>()
        array.add("abccbaacz")
        array.add("abcdd")
        return array
    }


}