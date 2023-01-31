package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/31/20:35
 *
 * ��һ���������ε���ĸ
 * ����һ����СдӢ����ĸ��ɵ��ַ��� s �������ҳ������ص�һ������ ���� ����ĸ��
 * ע�⣺
 * ��� a �� �ڶ��� ���ֱ� b �� �ڶ��� �������ַ����е�λ�ø���ǰ������Ϊ��ĸ a ����ĸ b ֮ǰ�������Ρ�
 * s ��������һ���������ε���ĸ��
 */
object Leetcode2351 {

    /**
     * ִ����ʱ��152 ms
     * �ڴ����ģ�32.9 MB
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