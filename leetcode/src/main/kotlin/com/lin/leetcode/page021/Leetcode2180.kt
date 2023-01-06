package com.lin.leetcode.page021

/**
 *
 * @author lin
 * @date 2023/01/06/21:54
 *
 * ����һ�������� num ������ͳ�Ʋ����� С�ڻ���� num �Ҹ�λ����֮��Ϊ ż�� ������������Ŀ��
 * �������� ��λ����֮�� ��������λ�ϵĶ�Ӧ������ӵĽ����
 *
 */
object Leetcode2180 {

    /**
     * �����ƽⷨ
     * ���������� 1<=num<=1000
     * ����ֱ�ӱ����ƽ�
     * ִ����ʱ��152 ms
     * �ڴ����ģ�32 MB
     */
    private fun countEven(num: Int): Int {
        var count = 0
        for (i in 1..num) {
            var x = i
            var sum = 0
            while (x > 0) {
                sum += x % 10
                x /= 10
            }
            if (sum % 2 == 0) {
                count++
            }
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val countEven = countEven(it)
            println("${it}->result=${countEven}")
        }
    }


    private fun getTestData(): List<Int> {
        val intArray = ArrayList<Int>()
        intArray.add(15)
        return intArray
    }

}