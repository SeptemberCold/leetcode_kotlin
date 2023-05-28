package page000

/**
 *
 * ��Ŀ: x ��ƽ����
 *
 * ����: ����һ���Ǹ����� x �����㲢����x�� ����ƽ���� ��
 *      ���ڷ������������������ֻ���� �������� ��С�����ֽ��� ��ȥ ��
 *      ע�⣺������ʹ���κ�����ָ����������������� pow(x, 0.5) ���� x ** 0.5 ��
 * ����: 0 <= x <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/sqrtx/
 *
 */
class Leetcode069 {

    /**
     * �����ƽ�
     * ִ����ʱ��212 ms
     * �ڴ����ģ�32.5 MB
     */
    fun mySqrt(x: Int): Int {
        for (i in 0..x) {
            val add = i.toDouble() * i
            if (add > x) {
                return i - 1
            } else if (add == x.toDouble()) {
                return i
            }
        }
        return 0
    }

}