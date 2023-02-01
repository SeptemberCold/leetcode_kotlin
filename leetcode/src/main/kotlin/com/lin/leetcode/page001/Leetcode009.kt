package com.lin.leetcode.page001

/**
 * ������
 * ����һ������ x ����� x ��һ���������������� true �����򣬷��� false ��
 * ��������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 * ���磬121 �ǻ��ģ��� 123 ���ǡ�
 */
object Leetcode009 {

    /**
     * ִ����ʱ��204 ms
     * �ڴ����ģ�34.3 MB
     */
    private fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var sum = 0
        var temp = x
        while (true) {
            sum = sum * 10 + temp % 10
            temp /= 10
            if (temp == 0) break
        }
        return sum == x
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val testData = getTestData()
        testData.forEach {
            val result = isPalindrome(it)
            println("���Խ��->${it}=${result}")
        }
    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): List<Int> {
        val data = ArrayList<Int>()
        data.add(1234567)
        return data
    }


}