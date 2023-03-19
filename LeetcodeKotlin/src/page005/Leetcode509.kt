package page005

/**
 *
 * ��Ŀ: 쳲�������
 *
 * ����: 쳲������� ��ͨ���� F(n) ��ʾ���γɵ����г�Ϊ 쳲��������� ��
 *      �������� 0 �� 1 ��ʼ�������ÿһ�����ֶ���ǰ���������ֵĺ͡�
 *      ���� n ������� F(n) ��
 * ����: 0 <= n <= 30
 *
 * ����: https://leetcode.cn/problems/fibonacci-number/
 *
 */
object Leetcode509 {

    /**
     * ��̬�滮
     * ִ����ʱ��116 ms
     * �ڴ����ģ�32.1 MB
     */
    fun fib(n: Int): Int {
        val dp = intArrayOf(0, 1, 0)
        for (i in 0..n) {
            dp[2] = dp[2] + dp[0]
            dp[0] = dp[1]
            dp[1] = dp[2]
        }
        return dp[2]
    }


}