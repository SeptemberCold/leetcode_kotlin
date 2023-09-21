package page002

/**
 *
 * ��Ŀ: ��λ���
 *
 * ����: ����һ���Ǹ����� num������������λ�ϵ�������ӣ�ֱ�����Ϊһλ����������������
 * ����: ��λ���
 *
 * ����: https://leetcode.cn/problems/add-digits/
 *
 */
class Leetcode258 {

    /**
     * ģ��
     * ʱ�� 144ms
     * �ڴ� 32.21MB
     */
    fun addDigits(num: Int): Int {
        var result = num
        while (result >= 10) {
            var temp = 0
            while (result > 0) {
                temp += result % 10
                result /= 10
            }
            result = temp
        }
        return result
    }

}