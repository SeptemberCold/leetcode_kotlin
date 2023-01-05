package com.lin.leetcode.page018

/**
 * ͳ�����ֵ�ڷ�Χ�ڵ������ж���
 * ����һ���������� nums ���±� �� 0 ��ʼ �������Լ�����������low �� high ���뷵�� Ư������ ����Ŀ��
 * Ư������ ��һ������ (i, j) �����ԣ����� 0 <= i < j < nums.length �� low <= (nums[ i ] XOR nums[ j ]) <= high
 */
object Leetcode1803 {

    /**
     * �����ƽ�
     * ִ����ʱ: 1188 ms
     * �ڴ�����: 41.8 MB
     */
    private fun countPairs(nums: IntArray, low: Int, high: Int): Int {
        var sum = 0
        //����
        nums.sort()
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                val result = nums[i] xor nums[j]
                if (result in low..high) {
                    sum++
                }
            }
        }
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = countPairs(it.nums, it.low, it.high)
            println("result = $result")
        }
    }


    private fun getTestData(): List<Data> {
        val data = ArrayList<Data>()
        data.add(Data(intArrayOf(1, 4, 2, 7), 2, 6))
        return data
    }


    class Data(val nums: IntArray, val low: Int, val high: Int)


}