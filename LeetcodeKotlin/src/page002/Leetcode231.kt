package page002

/**
 * ��Ŀ: 2����
 *
 * ����: ����һ������ n�������жϸ������Ƿ��� 2 ���ݴη�������ǣ����� true �����򣬷��� false ��\
 *      �������һ������ x ʹ��n == 2x ������Ϊ n �� 2 ���ݴη���
 * ����: -231 <= n <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/power-of-two/
 */
class Leetcode231 {

    /**
     * �����Ƽ���
     * ִ����ʱ��132 ms
     * �ڴ����ģ�32.5 MB
     */
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && n and n - 1 == 0
    }

}