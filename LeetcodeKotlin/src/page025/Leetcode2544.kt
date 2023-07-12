package page025

/**
 *
 * ��Ŀ: �������ֺ�
 *
 * ����: ����һ�������� n ��n �е�ÿһλ���ֶ��ᰴ�����������һ�����ţ�
 *          �����Чλ �ϵ����ַ��䵽 �� �š�
 *          ʣ��ÿλ�����ֵķ��Ŷ��������������෴��
 *      �����������ּ����Ӧ���ŵĺ͡�
 * ����: 1 <= n <= 109
 *
 * ����: https://leetcode.cn/problems/alternating-digit-sum/
 *
 */
class Leetcode2544 {

    /**
     * ��ѧ
     * ִ����ʱ��124 ms
     * �ڴ����ģ�31.9 MB
     */
    fun alternateDigitSum(n: Int): Int {
        //�����滻
        var temp = n
        //����
        var sum = 0
        //�������λ
        var tag = 1
        //��Ӵ��� n��λ��
        var num = 0

        //�������
        while (temp != 0) {
            sum += temp % 10 * tag
            temp /= 10
            tag *= -1
            num++
        }
        //���λ����˫ ���������� ����
        if (num % 2 == 0) {
            sum *= -1
        }
        return sum
    }

}