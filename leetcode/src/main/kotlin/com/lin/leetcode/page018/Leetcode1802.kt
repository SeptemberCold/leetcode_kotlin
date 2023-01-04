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



    @JvmStatic
    fun main(args: Array<String>) {
        //����һ����
        val a = maxValue01(4, 2, 6)
        val b = maxValue01(6, 1, 10)
        println("a=${a}")
        println("b=${b}")
        val c = maxValue01(4, 0, 4)
        println("c=${c}")
        val d = maxValue01(2, 0, 798870804)
        println("d=${d}")
        val e = maxValue01(1, 0, 444029221)
        println("e=${e}")

    }


}