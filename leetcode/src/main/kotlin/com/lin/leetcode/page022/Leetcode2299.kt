package com.lin.leetcode.page022

/**
 *
 * @author lin
 * @date 2023/01/19/22:06
 * ǿ��������� II
 * ���һ���������������������������ǳ�����һ�� ǿ���룺
 * �������� 8���ַ���
 * ���ٰ��� һ��СдӢ����ĸ��
 * ���ٰ��� һ����дӢ����ĸ��
 * ���ٰ��� һ�����֡�
 * ���ٰ��� һ�������ַ��������ַ�Ϊ��"!@#$%^&*()-+"�е�һ����
 * ��������2��������ͬ���ַ����ȷ�˵"aab"�����ϸ�����������"aba"���ϸ���������
 * ����һ���ַ���password���������һ��ǿ���룬����true�����򷵻�false��
 */
object Leetcode2299 {

    /**
     * ִ����ʱ��140 ms
     * �ڴ����ģ�32.9 MB
     */
    private fun strongPasswordCheckerII(password: String): Boolean {
        //���ȼ��
        if (password.length < 8) return false
        var isMajuscule = false
        var isLowercase = false
        var isNumber = false
        var isSpecial = false
        var temp: Char? = null
        for (c in password) {
            if (c == temp) return false
            temp = c
            //�ж��Ƿ��д
            if (!isMajuscule && c >= 'A' && c <= 'Z') isMajuscule = true
            //�ж��Ƿ�Сд
            if (!isLowercase && c >= 'a' && c <= 'z') isLowercase = true
            //�ж��Ƿ�����
            if (!isNumber && c >= '0' && c <= '9') isNumber = true
            //�ж��Ƿ������ַ�
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