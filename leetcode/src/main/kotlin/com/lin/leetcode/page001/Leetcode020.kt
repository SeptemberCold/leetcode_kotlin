package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/02/21/23:43
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
            if (i != 0 && answer.size!=0) {
                if ((s[i] == ')' && answer[answer.size - 1]=='(')||
                    (s[i] == ']' && answer[answer.size - 1]=='[')||
                    (s[i] == '}' && answer[answer.size - 1]=='{')) {
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
        isValid("(){}}{")
    }

}