package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/02/11/23:33
 *
 * װ��������Ҫ�������ʱ��
 * ����һ̨��ˮ���������Ʊ���ˮ����ˮ����ˮ��
 * ÿ���ӣ�����װ�� 2 �� ��ͬ ���͵�ˮ���� 1 ���������͵�ˮ��
 * ����һ���±�� 0 ��ʼ������Ϊ 3 ���������� amount ��
 * ���� amount[0]��amount[1] �� amount[2] �ֱ��ʾ��Ҫװ����ˮ����ˮ����ˮ�ı���������
 * ����װ�����б�������� ���� ������
 */
object Leetcode2335 {

    /**
     * ����ģ�⣬ÿ��װ��������
     * ִ����ʱ��144 ms
     * �ڴ����ģ�33.1 MB
     */
    private fun fillCups(amount: IntArray): Int {
        var answer = 0
        while (true) {
            val i0 = amount[0]
            val i1 = amount[1]
            val i2 = amount[2]
            if (i0 != 0 || i1 != 0 || i2 != 0) {
                answer += 1
                if (i0 != 0 && i0 >= i1 && i0 >= i2) {
                    amount[0] = amount[0] - 1
                    if (i1 != 0 && i1 >= i2) amount[1] = amount[1] - 1
                    if (i2 != 0 && i2 > i1) amount[2] = amount[2] - 1
                    continue
                }
                if (i1 != 0 && i1 >= i0 && i1 >= i2) {
                    amount[1] = amount[1] - 1
                    if (i0 != 0 && i0 >= i2) amount[0] = amount[0] - 1
                    if (i2 != 0 && i2 > i0) amount[2] = amount[2] - 1
                    continue
                }
                if (i2 != 0 && i2 >= i1 && i2 >= i0) {
                    amount[2] = amount[2] - 1
                    if (i1 != 0 && i1 >= i0) amount[1] = amount[1] - 1
                    if (i0 != 0 && i0 > i1) amount[0] = amount[0] - 1
                    continue
                }
            } else {
                break
            }
        }
        return answer
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = fillCups(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<IntArray> {
        val array = ArrayList<IntArray>()
        array.add(intArrayOf(0, 2, 2))
        return array
    }

}