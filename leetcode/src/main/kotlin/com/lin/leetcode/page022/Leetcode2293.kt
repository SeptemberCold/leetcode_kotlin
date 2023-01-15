package com.lin.leetcode.page022

import kotlin.math.max
import kotlin.math.min

/**
 *
 * @author lin
 * @date 2023/01/15/22:44
 *
 *
 * ����С��Ϸ
 * ����һ���±�� 0 ��ʼ���������� nums ���䳤���� 2 ���ݡ�
 * �� nums ִ�������㷨��
 * �� n ���� nums �ĳ��ȣ���� n == 1 ����ֹ �㷨���̡����򣬴��� һ���µ���������newNums �������鳤��Ϊ n / 2 ���±�� 0 ��ʼ��
 * ��������0 <= i < n / 2 ��ÿ�� ż�� �±� i ���� newNums[ i ] ��ֵ Ϊ min(nums[2 * i], nums[2 * i + 1]) ��
 * ��������0 <= i < n / 2 ��ÿ�� ���� �±� i ���� newNums[ i ] ��ֵ Ϊ max(nums[2 * i], nums[2 * i + 1]) ��
 * �� newNums �滻 nums ��
 * �Ӳ��� 1 ��ʼ �ظ� �������̡�
 * ִ���㷨�󣬷��� nums ��ʣ�µ��Ǹ����֡�
 *
 */
object Leetcode2293 {

    /**
     * ��ͨ�㷨
     */
    private fun minMaxGame(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            map[i] = nums[i]
        }
        while (map.size > 1) {
            var newIndex = 0
            for (i in 0 until map.size) {
                if (i % 2 != 0) continue
                val i1 = map[i] ?: 0
                val i2 = map[i + 1] ?: 0
                map.remove(i)
                map.remove(i + 1)
                if (newIndex % 2 == 0) {
                    val min = min(i1, i2)
                    map[newIndex] = min
                } else {
                    val max = max(i1, i2)
                    map[newIndex] = max
                }
                newIndex += 1
            }
        }
        return map[0]!!
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val minMaxGame = minMaxGame(it)
            println(minMaxGame)
        }
    }


    private fun getTestData(): List<IntArray> {
        val data = ArrayList<IntArray>()
        data.add(intArrayOf(1, 3, 5, 2, 4, 8, 2, 2))
        data.add(intArrayOf(3))
        return data
    }

}