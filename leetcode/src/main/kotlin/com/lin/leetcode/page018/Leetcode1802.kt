package com.lin.leetcode.page018


/**
 * �н�������ָ���±괦�����ֵ
 * �������������� n��index �� maxSum ������Ҫ����һ��ͬʱ���������������������� nums���±� �� 0 ��ʼ ��������
 * nums.length == n
 * nums[ i ] �� ������ ������ 0 <= i < n
 * abs(nums[ i ] - nums[i+1]) <= 1 ������ 0 <= i < n-1
 * nums ������Ԫ��֮�Ͳ����� maxSum
 * nums[ index ] ��ֵ�� ��� Cannot resolve symbol 'index'
 * ������������������е� nums [index ]��
 */
object Leetcode1802 {


    /**
     * 0����������
     * ��ٷ� ������������  ��������ʱ�������ۿɼ�����
     * ���������м���ʾ�������˴���->����ʱ������ �޷���������
     */
    private fun maxValue01(n: Int, index: Int, maxSum: Int): Int {
        //ȡһ��ƽ����
        val ave = maxSum / n
        //��ƽ������ʼ���
        for (i in ave..maxSum) {
            var sum = 0
            var left = i
            for (leftIndex in 0 until index) {
                if (left >= 2) left--
                sum += left
            }
            var right = i
            for (rightIndex in index until n) {
                sum += right
                if (right >= 2) right--
            }
            if (sum == maxSum) {
                return i
            } else if (sum > maxSum) {
                return i - 1
            }
        }
        return -1
    }

    /**
     * Ҳ����ٷ� ��ȵ�һ�֣�û������ѭ����Ӽ������ҵ�ֵ
     * ��Ϊ�������ִ������� ѭ�������Ĵ�����ʱ��
     * ����ʹ�����й�ʽֱ�Ӽ������ҵ�ֵ��Ϊ0ʱ��Ҫ��1����ΪҪ��������
     * ִ����ʱ��148 ms
     * �ڴ����ģ�32.5 MB
     */
    private fun maxValue02(n: Int, index: Int, maxSum: Int): Int {
        //ȡһ��ƽ����
        val ave = maxSum / n
        //��ƽ������ʼ���
        for (i in ave..maxSum) {
            //�����ߵ���
            var result: Int = if (i < index + 1) {
                i * (i + 1) / 2 + (index + 1 - i)
            } else {
                (index + 1) * (i + i - index) / 2
            }
            //����ұߵ���
            result += if (i - 1 < n - index - 1) {
                (i - 1) * (i) / 2 + (n - index - i)
            } else {
                (n - index - 1) * (i - 1 + (i - (n - index - 1))) / 2
            }
            //�����ȸոպ�
            if (result == maxSum) {
                return i
            }
            //�������� ��ǰһλ���ǽ��
            if (result > maxSum) {
                return i - 1
            }
        }
        return -1
    }


    @JvmStatic
    fun main(args: Array<String>) {
        //����һ����
        getTestData().forEach {
            val result = maxValue01(it[0], it[1], it[2])
            println("test01 ${it[0]} ${it[1]} ${it[2]} = $result")
        }
        println("=============================")
        //����������
        getTestData().forEach {
            val result = maxValue02(it[0], it[1], it[2])
            println("test02 ${it[0]} ${it[1]} ${it[2]} = $result")
        }
    }


    private fun getTestData(): List<IntArray> {
        val data = ArrayList<IntArray>()
        data.add(intArrayOf(4, 2, 6))
        data.add(intArrayOf(6, 1, 10))
        data.add(intArrayOf(4, 0, 4))
        data.add(intArrayOf(2, 0, 798870804))
        //��������������÷���һ����ǳ���ѭ����
//        data.add(intArrayOf(8257285, 4828516, 850015631))
        data.add(intArrayOf(8, 7, 14))
        data.add(intArrayOf(9, 5, 24))
        return data
    }


}