package page011

/**
 *
 * ��Ŀ: �� N ��̩��������
 *
 * ����: ̩���������� Tn �������£�
 *      T0 = 0, T1 = 1, T2 = 1, ���� n >= 0 �������� Tn+3 = Tn + Tn+1 + Tn+2
 *      �������� n���뷵�ص� n ��̩�������� Tn ��ֵ��
 *
 * ����: 0 <= n <= 37
 *      �𰸱�֤��һ�� 32 λ�������� answer <= 2^31 - 1��
 *
 * ����: https://leetcode.cn/problems/n-th-tribonacci-number/description/
 *
 */
class Leetcode1137 {

    /**
     * ��̬�滮
     * ʱ�䣺160ms
     * �ڴ棺36.64MB
     */
    fun tribonacci(n: Int): Int {
        if (n == 0) return 0
        val array = intArrayOf(0, 0, 1)
        for (i in 1 until n) {
            val tn = array.sum()
            array[0] = array[1]
            array[1] = array[2]
            array[2] = tn
        }

        return array[2]
    }

}