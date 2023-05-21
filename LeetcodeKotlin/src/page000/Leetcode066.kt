package page000

/**
 *
 * ��Ŀ: ��һ
 *
 * ����: ����һ���� ���� ��ɵ� �ǿ� ��������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
 *      ���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢�������֡�
 *      ����Լ���������� 0 ֮�⣬��������������㿪ͷ��
 * ����: 1 <= digits.length <= 100
 *      0 <= digits[i] <= 9
 *
 * ����: https://leetcode.cn/problems/plus-one/
 *
 */
class Leetcode066 {


    /**
     * �������
     * ִ����ʱ��160 ms
     * �ڴ����ģ�33.4 MB
     */
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            val j = digits[i] + 1
            //���������� ֱ�ӷ���
            if (j < 10) {
                digits[i] = digits[i] + 1
                return digits
            } else {
                digits[i] = 0
            }
        }
        //�������� �������λ������λ ���涼��0 ����999+1=1000
        val result = IntArray(digits.size + 1) { 0 }
        result[0] = 1
        return result
    }

}