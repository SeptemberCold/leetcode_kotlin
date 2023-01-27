package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/27/16:26
 *
 * 兼具大小写的最好英文字母
 * 给你一个由英文字母组成的字符串 s ，请你找出并返回 s 中的 最好 英文字母。
 * 返回的字母必须为大写形式。
 * 如果不存在满足条件的字母，则返回一个空字符串。
 * 最好 英文字母的大写和小写形式必须 都 在 s 中出现。
 * 英文字母 b 比另一个英文字母a更好 的前提是：英文字母表中，b 在 a 之 后 出现。
 */
object Leetcode2309 {

    /**
     * 执行用时：196 ms
     * 内存消耗：34.9 MB
     */
    private fun greatestLetter(s: String): String {
        //大小写状态数组 ASCll码中 大写和小写字母间有6个特殊字符
        val array = BooleanArray(58)
        //状态导入
        s.forEach { array[it - 'A'] = true }
        //状态倒序检索大写字母的状态
        for (i in 25 downTo 0) {
            //同时包含大写字母 小写字母
            if (array[i] && array[i + 26 + 6]) return "${'A' + i}"
        }
        return ""
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = greatestLetter(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<String> {
        val array = ArrayList<String>()
        array.add("lEeTcOdE")
        array.add("arRAzFif")
        array.add("AbCdEfGhIjK")
        return array
    }


}