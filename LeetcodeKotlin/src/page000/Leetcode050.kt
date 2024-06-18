package page000

/**
 *
 * ��Ŀ: Pow(x, n)
 *
 * ����: ʵ�� pow(x, n) �������� x ������ n ���ݺ���������xn ����
 *
 * ����: -100.0 < x < 100.0
 *      -231 <= n <= 231-1
 *      n ��һ������
 *
 * ����: https://leetcode.cn/problems/powx-n/description/
 *
 */
class Leetcode050 {

    /**
     * �ݹ�+����
     * ʱ�� 144ms
     * �ڴ� 34.10MB
     */
    fun myPow(x: Double, n: Int): Double {
        if (n == 0) return 1.0
        if (n == 1) return x
        if (n == -1) return 1 / x
        return if (n and 1 == 0) {
            myPow(x * x, n / 2)
        } else {
            myPow(x * x, (n - 1) / 2) * x
        }
    }

}