package com.lin.leetcode.page020


object Leetcode2042 {


    /**
     * ִ����ʱ��156 ms
     * �ڴ����ģ�34.6 MB
     */
    private fun areNumbersAscending01(s: String): Boolean {
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

    /**
     * ִ����ʱ��152 ms
     * �ڴ����ģ�34.7 MB
     * �Ż���һ�� ���ü��ϴ洢����Ч����������
     */
    private fun areNumbersAscending02(s: String): Boolean {
        //ÿ���ַ�������
        val split = s.split(" ")
        var temp = ""
        split.forEach {
            //�ҳ���������
            if (it < "a") {
                //��鳤�����ʱ����Ƿ�С�ڵ���temp ���Ȳ��ȵ�ʱ�����temp
                if (temp.length == it.length && temp >= it || temp.length > it.length) {
                    return false
                } else {
                    temp = it
                }
            }
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = areNumbersAscending01("1 box has 1 blue 4 red 6 green and 12 yellow marbles")
        val b = areNumbersAscending01("1 box has 3 blue 4 red 6 green and 12 yellow marbles")
        val c = areNumbersAscending02("1 box has 1 blue 4 red 6 green and 12 yellow marbles")
        val d = areNumbersAscending02("1 box has 3 blue 4 red 6 green and 12 yellow marbles")
        println(a)
        println(b)
        println(c)
        println(d)
    }

}