package page003

/**
 *
 * ��Ŀ: 4����
 *
 * ����: ����һ��������дһ���������ж����Ƿ��� 4 ���ݴη�������ǣ����� true �����򣬷��� false ��
 *      ���� n �� 4 ���ݴη������㣺�������� x ʹ�� n == 4x
 * ����: -231 <= n <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/power-of-four/description/
 *
 */
class Leetcode342 {

    /**
     * λ����
     * 136 ms
     * 33.01 MB
     */
    fun isPowerOfFour(n: Int): Boolean {
        //����0 ��������ֻ��һ��1 1��ż��λ��
        return n > 0 && (n and n - 1 == 0) && (n and 0xaaaaaaaa.toInt() == 0)
    }

}