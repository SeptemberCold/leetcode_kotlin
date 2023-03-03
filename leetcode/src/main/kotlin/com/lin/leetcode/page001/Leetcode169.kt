package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/03/03/23:44
 * ����Ԫ��
 * ����һ����СΪ n ������nums ���������еĶ���Ԫ�ء�����Ԫ����ָ�������г��ִ�������n/2��Ԫ�ء�
 * ����Լ��������Ƿǿյģ����Ҹ������������Ǵ��ڶ���Ԫ�ء�
 */
object Leetcode169 {

    /**
     * ִ����ʱ��280 ms
     * �ڴ����ģ�42.1 MB
     * ��ϣ��
     */
    private fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        val i = nums.size / 2
        for (num in nums) {
            val sum = map[num] ?: 0
            if (sum + 1 > i) {
                return num
            } else {
                map[num] = sum + 1
            }
        }
        return 0
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val valid = majorityElement(it)
            println("${it}=$valid")
        }
    }

    private fun getTestData(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(3, 2, 3))
        return example
    }


}