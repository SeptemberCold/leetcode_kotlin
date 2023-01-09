package com.lin.leetcode.page018

/**
 *
 * @author lin
 * @date 2023/01/09/23:13
 *
 * ��ԭ���е����ٲ�������
 * ����һ��ż�� n����֪����һ������Ϊ n ������ perm ��
 * ���� perm[ i ] == i���±� �� 0 ��ʼ ��������
 * һ�������У��㽫����һ�������� arr ������ÿ�� i ��
 * ��� i % 2 == 0 ����ô arr[ i ] = perm[i / 2]
 * ��� i % 2 == 1 ����ô arr[ i ] = perm[n / 2 + (i - 1) / 2]
 * Ȼ�� arr ��ֵ�� perm ��
 * Ҫ��ʹ perm �ص����г�ʼֵ��������Ҫִ�ж��ٲ�������������С�� ���� ����������
 *
 */
object Leetcode1806 {

    /**
     * �����ƽ⣬����ѧ�ⷨ
     * ���������е��Ѷ� ���ѵĵط�Ӧ���Ƕ�����Ŀ
     * ִ����ʱ��156 ms
     * �ڴ����ģ�34.3 MB
     */
    private fun reinitializePermutation(n: Int): Int {
        //3������ һ�����ڻ������������� һ�����ڲ��������� һ�����ڱȶԽ��������
        var perm = IntArray(n)
        val arr = IntArray(n)
        val temp = IntArray(n)
        //�������
        for (i in perm.indices) {
            perm[i] = i
            arr[i] = i
            temp[i] = i
        }
        //���ڼ���
        var sum = 0
        //��ѭ��������ⲻ�����ͻῨ������
        while (true) {
            //��������
            for (index in arr.indices) {
                if (index % 2 == 0) {
                    arr[index] = perm[index / 2]
                } else {
                    arr[index] = perm[n / 2 + (index - 1) / 2]
                }
            }
            //���Ƹ�ֵ
            perm = arr.copyOf()
            //����
            sum++
            //����ȶ�
            if (temp.contentEquals(arr)) {
                break
            }
        }
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = reinitializePermutation(it)
            println("${it}->result=${result}")
        }
    }

    private fun getTestData(): List<Int> {
        val data = ArrayList<Int>()
        data.add(4)
        data.add(6)
        data.add(8)
        data.add(10)
        return data
    }


}