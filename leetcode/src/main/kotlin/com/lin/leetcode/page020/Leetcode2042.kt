package com.lin.leetcode.page020


object Leetcode2042 {


    private fun areNumbersAscending(s: String): Boolean {
        //ÿ���ַ�������
        val split = s.split(" ")
        //�ҳ���������
        val temp = ArrayList<String>()
        split.forEach {
            if (it < "a") {
                temp.add(it)
            }
        }
        //��Լ��temp��С��2 �Ͳ���sizeֵ�����
        for (i in 0..temp.size - 2) {
            //�ַ������
            if (temp[i].length == temp[i + 1].length) {
                //�жϴ�С ǰһ��С�ں�һ���ͼ���ѭ��
                if (temp[i] >= temp[i + 1]) {
                    return false
                }
            } else if (temp[i].length > temp[i + 1].length) {
                //����ַ���ǰһ���ַ������ȴ��ں�һ���ַ��� ֱ���и�
                return false
            }
            //ʣ���ַ���ǰһ���ַ�������С�ں�һ���ַ��� �����������ѭ��
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val b = areNumbersAscending("1 box has 1 blue 4 red 6 green and 12 yellow marbles")
        val c = areNumbersAscending("1 box has 20 blue 4 red 6 green and 12 yellow marbles")
        println(b)
        println(c)
    }

}