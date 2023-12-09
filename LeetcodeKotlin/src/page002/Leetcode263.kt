package page002

/**
 *
 * ��Ŀ: ����
 *
 * ����: ���� ����ֻ���������� 2��3 �� 5 ����������
 *      ����һ������ n �������ж� n �Ƿ�Ϊ ���� ������ǣ����� true �����򣬷��� false ��
 * ����: Int.MIN <= n <= Int.Max
 *
 * ����: https://leetcode.cn/problems/ugly-number/description/
 *
 */
class Leetcode263 {

    /**
     * ��ѧ
     * 148ms
     * 32.78MB
     */
    fun isUgly(n: Int): Boolean {
        if (n == 0) return true
        var temp = n
        while (temp != 1) {
            if (temp % 5 == 0) {
                temp /= 5
                continue
            }
            if (temp % 3 == 0) {
                temp /= 3
                continue
            }
            if (temp % 2 == 0) {
                temp /= 2
                continue
            }
            break
        }
        return temp == 1
    }

}