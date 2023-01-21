package com.lin.leetcode.page018

/**
 *
 * @author lin
 * @date 2023/01/21/20:28
 *
 * ���ٲ�������
 * ����һ������Ϊn��3 �ܵ���·�����ܹ�����n + 1���㣬���Ϊ0��n��
 * һֻ���ܴ�0�ŵ�ڶ����ܵ�����������Ҫ������n����Ȼ����·�Ͽ�����һЩ�ϰ���
 * ����һ������Ϊ n + 1������obstacles������obstacles[ i ]��ȡֵ��Χ�� 0 �� 3����ʾ�ڵ� i����obstacles[ i ]�ܵ�����һ���ϰ���
 * ���obstacles[ i ] == 0����ô��i��û���ϰ����κ�һ����������ܵ��������һ���ϰ���
 * �ȷ�˵�����obstacles[2] == 1����ô˵���ڵ� 2 ���ܵ� 1 ���ϰ���
 * ��ֻ���ܴӵ� i������ i + 1���ܵ������ǰ���ǵ� i + 1��ͬһ�ܵ���û���ϰ���
 * Ϊ�˶���ϰ�����ֻ����Ҳ������ͬһ���㴦������ ����һ���ܵ����������ܵ����Բ����ڣ�����ǰ��������ȥ���ܵ��õ㴦û���ϰ���
 * �ȷ�˵����ֻ���ܿ��Դӵ� 3 �����ܵ� 3 ������ 3 �����ܵ� 1 ��
 * ��ֻ���ܴӵ� 0 ���ܵ� 2���������뵽��� n������һ�ܵ� �����㷵�����ٲ���������
 * ע�⣺�� 0���͵� n������һ�ܵ����������ϰ���
 */
object Leetcode1824 {

    /**
     * ��̬�滮
     * ִ����ʱ��664 ms
     * �ڴ����ģ�127.4 MB
     */
    private fun minSideJumps(obstacles: IntArray): Int {
        val max = Integer.MAX_VALUE / 2
        val dp = intArrayOf(max, 1, 0, 1)
        obstacles.forEach {
            dp[it] = max
            val min = dp[1].coerceAtMost(dp[2].coerceAtMost(dp[3]))
            for (i in 0 until 3) {
                dp[i + 1] = dp[i + 1].coerceAtMost(min + 1)
            }
            dp[it] = max
        }
        return dp[1].coerceAtMost(dp[2].coerceAtMost(dp[3]))
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = minSideJumps(it)
            println("answer=${answer}")
        }
    }

    private fun getTestData(): List<IntArray> {
        val intArray = ArrayList<IntArray>()
        intArray.add(intArrayOf(0, 1, 2, 3, 0))
        intArray.add(intArrayOf(0, 1, 1, 3, 3, 0))
        intArray.add(intArrayOf(0, 2, 1, 0, 3, 0))
        return intArray
    }


}