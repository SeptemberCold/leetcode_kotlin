package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/02/05/23:19
 *
 * �����ǰ׺
 * ��дһ�������������ַ��������е������ǰ׺��
 * ��������ڹ���ǰ׺�����ؿ��ַ��� ""��
 *
 */
object Leetcode014 {

    /**
     * ִ����ʱ��180 ms
     * �ڴ����ģ�34.8 M
     */
    private fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        val answer = StringBuilder()
        var index = 0
        while (true) {
            try {
                val s = strs[0][index]
                for (str in strs) {
                    if (str[index] != s) {
                        return answer.toString()
                    }
                }
                answer.append(s)
                index++
            } catch (e: IndexOutOfBoundsException) {
                break
            }
        }
        return answer.toString()
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = longestCommonPrefix(it)
            println("answer=$answer")
        }
    }

    private fun getTestData(): List<Array<String>> {
        val example = ArrayList<Array<String>>()
        example.add(arrayOf("flower", "flow", "flight"))
        example.add(arrayOf("dog", "racecar", "car"))
        return example
    }

}