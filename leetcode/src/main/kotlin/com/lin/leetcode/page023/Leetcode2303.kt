package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/23/18:37
 * ����Ӧ��˰���ܶ�
 * ����һ���±�� 0 ��ʼ�Ķ�ά�������� brackets ��
 * ���� brackets[ i ] = [upperi, percenti] ����ʾ�� i ��˰���������� upperi �����յ�˰��Ϊ percenti ��
 * ˰�������� �ӵ͵������������� 0 < i < brackets.length ��ǰ���£�upperi-1 < upperi����
 * ˰����㷽ʽ���£�
 * ������ upper0 �����밴˰�� percent0 ����
 * ���� upper1 - upper0 �Ĳ��ְ�˰�� percent1 ����
 * Ȼ�� upper2 - upper1 �Ĳ��ְ�˰�� percent2 ����
 * �Դ�����
 * ����һ������ income ��ʾ��������롣��������Ҫ���ɵ�˰���ܶ���׼������ 10-5 �Ľ������������ȷ�𰸡�
 */
object Leetcode2303 {

    /**
     * ִ����ʱ��232 ms
     * �ڴ����ģ�41.9 MB
     * ����ģ��
     */
    private fun calculateTax(brackets: Array<IntArray>, income: Int): Double {
        //��Ҫ�ɵ�˰
        var tax: Double
        //���ֻ���ϵ�һ��˰���ı�׼ ֱ�ӷ��ؽ�� ����ѭ�����ж�
        if (income <= brackets[0][0]) {
            return 0.01 * brackets[0][1] * income
        } else {
            tax = 0.01 * brackets[0][1] * brackets[0][0]
        }

        for (i in 1 until brackets.size) {
            //˰��
            val upper = brackets[i][0]
            //˰��
            val percent = brackets[i][1]
            //��һ��˰��
            val upperUp = brackets[i - 1][0]
            if (upper < income) {
                tax += 0.01 * percent * (upper - upperUp)
            } else {
                tax += 0.01 * percent * (income - upperUp)
                break
            }
        }
        return tax
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = calculateTax(it.value, it.key)
            println("${it.key} = $answer")
        }
    }

    private fun getTestData(): Map<Int, Array<IntArray>> {
        val map = HashMap<Int, Array<IntArray>>()
        map[10] = arrayOf(intArrayOf(3, 50), intArrayOf(7, 10), intArrayOf(12, 25))
        map[2] = arrayOf(intArrayOf(1, 0), intArrayOf(4, 25), intArrayOf(5, 20))
        map[0] = arrayOf(intArrayOf(2, 50))
        return map
    }


}