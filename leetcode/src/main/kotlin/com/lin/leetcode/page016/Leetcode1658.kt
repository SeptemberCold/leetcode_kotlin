package com.lin.leetcode.page016


/**
 *
 * @author lin
 * @date 2023/01/07/19:35
 *
 * �� x ���� 0 ����С������
 * ����һ���������� nums ��һ������ x ��
 * ÿһ�β���ʱ����Ӧ���Ƴ����� nums ����߻����ұߵ�Ԫ�أ�
 * Ȼ��� x �м�ȥ��Ԫ�ص�ֵ����ע�⣬��Ҫ �޸� �����Թ��������Ĳ���ʹ�á�
 * ������Խ� xǡ�� ����0 ������ ��С������ �����򣬷��� -1 ��
 *
 */
object Leetcode1658 {

    /**
     * ִ����ʱ��496 ms
     * �ڴ����ģ�52.6 MB
     */
    private fun minOperations(nums: IntArray, x: Int): Int {
        val n = nums.size
        val sum = nums.sum()
        if (sum < x) {
            return -1
        }
        var right = 0
        var lsum = 0
        var rsum = sum
        var ans = n + 1
        for (left in -1 until n) {
            if (left != -1) {
                lsum += nums[left]
            }
            while (right < n && lsum + rsum > x) {
                rsum -= nums[right]
                ++right
            }
            if (lsum + rsum == x) {
                ans = ans.coerceAtMost(left + 1 + (n - right))
            }
        }
        return if (ans > n) -1 else ans
    }

    @JvmStatic
    fun main(args: Array<String>) {
        minOperations(intArrayOf(3, 2, 20, 1, 1, 3), 10)
        minOperations(intArrayOf(1, 1, 4, 2, 3), 5)
    }

}