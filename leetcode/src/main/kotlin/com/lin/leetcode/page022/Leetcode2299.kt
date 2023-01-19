package com.lin.leetcode.page022

/**
 *
 * @author lin
 * @date 2023/01/19/22:06
 * 强密码检验器 II
 * 如果一个密码满足以下所有条件，我们称它是一个 强密码：
 * 它有至少 8个字符。
 * 至少包含 一个小写英文字母。
 * 至少包含 一个大写英文字母。
 * 至少包含 一个数字。
 * 至少包含 一个特殊字符。特殊字符为："!@#$%^&*()-+"中的一个。
 * 它不包含2个连续相同的字符（比方说"aab"不符合该条件，但是"aba"符合该条件）。
 * 给你一个字符串password，如果它是一个强密码，返回true，否则返回false。
 */
object Leetcode2299 {

    /**
     * 执行用时：140 ms
     * 内存消耗：32.9 MB
     */
    private fun strongPasswordCheckerII(password: String): Boolean {
        //长度检查
        if (password.length < 8) return false
        var isMajuscule = false
        var isLowercase = false
        var isNumber = false
        var isSpecial = false
        var temp: Char? = null
        for (c in password) {
            if (c == temp) return false
            temp = c
            //判断是否大写
            if (!isMajuscule && c >= 'A' && c <= 'Z') isMajuscule = true
            //判断是否小写
            if (!isLowercase && c >= 'a' && c <= 'z') isLowercase = true
            //判断是否数字
            if (!isNumber && c >= '0' && c <= '9') isNumber = true
            //判断是否特殊字符
            if (!isSpecial) {
                if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*' || c == '(' || c == ')' || c == '-' || c == '+') {
                    isSpecial = true
                }
            }
        }
        return isMajuscule && isLowercase && isNumber && isSpecial
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = strongPasswordCheckerII(it)
            println("$it = $result")
        }
    }


    private fun getTestData(): List<String> {
        val data = ArrayList<String>()
        data.add("IloveLe3tcode!")
        data.add("Me+You--IsMyDream")
        data.add("1aB!")
        data.add("a1A!A!A!")
        return data
    }


}