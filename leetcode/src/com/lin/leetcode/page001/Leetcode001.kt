package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/01/01/19:
 *
 * ����һ���������� nums��һ������Ŀ��ֵ target�������ڸ��������ҳ� ��ΪĿ��ֵ target �����������������������ǵ������±ꡣ
 * ����Լ���ÿ������ֻ���Ӧһ���𰸡�
 * ���ǣ�������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡�����԰�����˳�򷵻ش𰸡�
 * ��Ŀ����
 * https://leetcode.cn/problems/two-sum/https://leetcode.cn/problems/two-sum/
 */
object Leetcode001 {

    /**
     * ִ����ʱ��336 ms
     * �ڴ����ģ�36.4 MB
     */
    fun twoSum01(nums: IntArray, target: Int): IntArray? {
        for (first in nums.indices) {
            for (second in nums.indices) {
                if (first != second) {
                    if (nums[first] + nums[second] == target) {
                        return intArrayOf(first, second)
                    }
                }
            }
        }
        return null
    }

    /**
     * ִ����ʱ��244 ms
     * �ڴ����ģ�37.1 MB
     */
    fun twoSum02(nums: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for (index in nums.indices) {
            val key = target - nums[index]
            val result = map.containsKey(key)
            if (result) {
                return map[key]?.let { intArrayOf(it, index) }
            } else {
                map[nums[index]] = index
            }
        }
        return null
    }

    /**
     * ִ����ʱ��240 ms
     * �ڴ����ģ�36.9 MB
     *
     * ���ַ�ʽjavaִ����ʱֻ��2ms �ڴ�����41.4 MB
     */
    fun twoSum03(nums: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for (index in nums.indices) {
            if (map.containsKey(nums[index])) {
                return map[nums[index]]?.let { intArrayOf(it, index) }
            }
            map[target - nums[index]] = index
        }
        return null
    }

    @JvmStatic
    fun main(args: Array<String>) {
        twoSum01(intArrayOf(), 0)
        twoSum02(intArrayOf(), 0)
        twoSum03(intArrayOf(), 0)
    }

}
