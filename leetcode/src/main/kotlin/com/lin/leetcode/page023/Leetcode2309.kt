package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/27/16:26
 *
 * ��ߴ�Сд�����Ӣ����ĸ
 * ����һ����Ӣ����ĸ��ɵ��ַ��� s �������ҳ������� s �е� ��� Ӣ����ĸ��
 * ���ص���ĸ����Ϊ��д��ʽ��
 * ���������������������ĸ���򷵻�һ�����ַ�����
 * ��� Ӣ����ĸ�Ĵ�д��Сд��ʽ���� �� �� s �г��֡�
 * Ӣ����ĸ b ����һ��Ӣ����ĸa���� ��ǰ���ǣ�Ӣ����ĸ���У�b �� a ֮ �� ���֡�
 */
object Leetcode2309 {

    /**
     * ִ����ʱ��196 ms
     * �ڴ����ģ�34.9 MB
     */
    private fun greatestLetter(s: String): String {
        //��Сд״̬���� ASCll���� ��д��Сд��ĸ����6�������ַ�
        val array = BooleanArray(58)
        //״̬����
        s.forEach { array[it - 'A'] = true }
        //״̬���������д��ĸ��״̬
        for (i in 25 downTo 0) {
            //ͬʱ������д��ĸ Сд��ĸ
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