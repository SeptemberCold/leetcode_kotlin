package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/02/21/23:43
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
object Leetcode020 {


    /**
     * 执行用时：148 ms
     * 内存消耗：33 MB
     */
    private fun isValid(s: String?): Boolean {
        if (s == null || s.isEmpty()) return true
        val answer = ArrayList<Char>()
        for (i in s.indices) {
            if (i != 0 && answer.size != 0) {
                if ((s[i] == ')' && answer[answer.size - 1] == '(') || (s[i] == ']' && answer[answer.size - 1] == '[') || (s[i] == '}' && answer[answer.size - 1] == '{')) {
                    answer.removeAt(answer.size - 1)
                    continue
                }
            }
            answer.add(s[i])
        }
        return answer.size == 0
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val valid = isValid(it)
            println("${it}=$valid")
        }
    }

    private fun getTestData(): List<String> {
        val example = ArrayList<String>()
        example.add("()")
        example.add("(){}}{")
        return example
    }

}