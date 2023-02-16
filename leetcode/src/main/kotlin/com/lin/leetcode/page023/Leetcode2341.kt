package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/02/16/22:44
 *
 * �������γɶ�������
 *
 * ����һ���±�� 0 ��ʼ���������� nums ����һ�������У������ִ�����²��裺
 * �� nums ѡ�� ���� ��ȵ� ����
 * �� nums ���Ƴ��������������γ�һ�� ����
 * ������ nums �϶��ִ�д˲���ֱ���޷�����ִ�С�
 * ����һ���±�� 0 ��ʼ������Ϊ 2 ���������� answer ��Ϊ�𰸣�
 * ���� answer[0] ���γɵ�������Ŀ��
 * answer[1] �Ƕ� nums ������ִ������������ʣ�µ�������Ŀ��
 */
object Leetcode2341 {

    /**
     * ִ����ʱ��176 ms
     * �ڴ����ģ�35 MB
     */
    private fun numberOfPairs(nums: IntArray): IntArray {
        val auxiliary = IntArray(101)
        var count = 0
        for (num in nums) {
            auxiliary[num] = auxiliary[num] xor 1
            if (auxiliary[num] == 0) count++
        }
        return intArrayOf(count, nums.size - 2 * count)
    }

    /**
     * ִ����ʱ��160 ms
     * �ڴ����ģ�34.8 MB
     */
    private fun numberOfPairs2(nums: IntArray): IntArray {
        val auxiliary = IntArray(101)
        var count = 0
        nums.forEach { auxiliary[it] = auxiliary[it] + 1 }
        auxiliary.forEach { if (it != 0) count += it / 2 }
        return intArrayOf(count, nums.size - 2 * count)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = numberOfPairs(it)
            println("$it = ${answer[0]} ${answer[1]}")
        }
        println("=========================")
        getTestData().forEach {
            val answer = numberOfPairs2(it)
            println("$it = ${answer[0]} ${answer[1]}")
        }
    }

    private fun getTestData(): List<IntArray> {
        val array = ArrayList<IntArray>()
        array.add(intArrayOf(1, 3, 2, 1, 3, 2, 2))
        return array
    }

}