package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/29/22:09
 * ͳ���Ǻ�
 * ����һ���ַ���s��ÿ������������'|'Ϊ һ��.
 * ����֮����һ���͵ڶ���'|'Ϊһ�ԣ��������͵��ĸ�'|'Ϊһ�ԣ��Դ����ơ�
 * ���㷵�� ���� ���߶�֮�䣬s��'*'����Ŀ��
 * ע�⣬ÿ������'|'���� ǡ������һ���ԡ�
 */
object Leetcode2315 {

    /**
     * ִ����ʱ��144 ms
     * �ڴ����ģ�34 MB
     */
    private fun countAsterisks(s: String): Int {
        //���ڱ�ʾ�Ƿ����Ǻ�֮��
        var boolean = false
        //�Ǻŵ�����
        var sum = 0
        //�ַ�����
        val array = s.toCharArray()
        for (i in array.indices) {
            //�������'|'����ת״̬
            if (array[i] == '|') boolean = !boolean
            //�����'|'֮�� array[i]�ֵ���'*' ������1
            if (!boolean && array[i] == '*') sum++
        }
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = countAsterisks(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<String> {
        val array = ArrayList<String>()
        array.add("l|*e*et|c**o|*de|")
        array.add("iamprogrammer")
        array.add("yo|uar|e**|b|e***au|tifu|l")
        return array
    }

}