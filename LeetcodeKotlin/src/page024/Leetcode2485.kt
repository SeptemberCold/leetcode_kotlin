package page024

/**
 *
 * ��Ŀ: �ҳ���������
 *
 * ����: ����һ�������� n ���ҳ��������������� �������� x ��
 *          1 �� x ֮�������Ԫ��֮�͵��� x �� n ֮������Ԫ��֮�͡�
 *      ������������ x ����������������������򷵻� -1 ����Ŀ��֤���ڸ��������룬�������һ������������
 * ����: 1 <= n <= 1000
 *
 * ����: https://leetcode.cn/problems/find-the-pivot-integer/
 *
 */
class Leetcode2485 {

    /**
     * ˫ָ��
     * ִ����ʱ��144 ms
     * �ڴ����ģ�32.4 MB
     */
    fun pivotInteger(n: Int): Int {
        //���֮��
        var sum = if (n % 2 == 0) {
            (n + 1) * (n / 2)
        } else {
            (n + 1) * (n / 2) + ((n + 1) / 2)
        }
        //�ұ�֮��
        var temp = 0
        //����
        for (i in n downTo 1) {
            temp += i
            //������ȷ��ؽ��
            if (sum == temp) {
                return i
            }
            //��ǰ����
            else if (sum < temp) {
                return -1
            }
            //Ϊ��һ��ѭ����׼��
            else {
                sum -= i
            }
        }
        return -1
    }

}