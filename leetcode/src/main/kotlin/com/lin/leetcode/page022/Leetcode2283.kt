package com.lin.leetcode.page022

/**
 * �ж�һ���������ּ����Ƿ������λ��ֵ
 * ����һ���±�� 0��ʼ����Ϊ n���ַ���num����ֻ�������֡�
 * ������� ÿ��0 <= i < n���±�i��
 * ��������λi�� num�г�����num[ i ]�Σ�
 * ��ô���㷵��true�����򷵻�false.
 */
object Leetcode2283 {

    /**
     * ���۵�kotlin֧�����
     * ��֧��char���͵�digitToInt����
     * �ɽ�char����ת��string������תint����
     * ִ����ʱ��148 ms
     * �ڴ����ģ�34.4 MB
     */
    private fun digitCount(num: String): Boolean {
        val charArray = num.toCharArray()
        //����map
        val map = HashMap<Int, Int>()
        //ͳ��û�����ֳ��ֵĴ���
        for (char in charArray) {
            //��ȡ����
            val toInt = char.digitToInt()
            //�������
            if (map.containsKey(toInt)) {
                map[toInt]?.apply {
                    map[toInt] = this + 1
                }
            } else {
                map[toInt] = 1
            }
        }
        //�����һ�����Բ��� ����false
        for (i in charArray.indices) {
            //��ȡ����
            val toInt = charArray[i].digitToInt()
            if (map.containsKey(i)) {
                map[i]?.apply { if (this != toInt) return false }
            } else {
                if (toInt != 0) return false
            }
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = digitCount(it)
            println("${it}=${result}")
        }
    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): List<String> {
        val data = ArrayList<String>()
        data.add("123456")
        data.add("1210")
        data.add("11315")
        data.add("88458")
        data.add("66872")
        return data
    }

}