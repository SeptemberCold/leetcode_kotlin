package page004

/**
 *
 * ��Ŀ: ��������
 *
 * ����: ��������֮��� �������� ָ�������������ֶ�Ӧ������λ��ͬ��λ�õ���Ŀ��
 *      ������������ x �� y�����㲢��������֮��ĺ������롣
 *
 * ����: 0 <= x, y <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/hamming-distance/description/
 *
 */
class Leetcode461 {

    /**
     * �����Ƽ���
     * ʱ�� 135ms
     * �ڴ� 32.77MB
     */
    fun hammingDistance(x: Int, y: Int): Int {
        var i = x xor y
        var sum = 0
        while (i != 0) {
            if (i and 1 == 1) sum += 1
            i = i shr 1
        }
        return sum
    }

}