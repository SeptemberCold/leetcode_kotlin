package page004

import java.lang.StringBuilder

/**
 *
 * ��Ŀ: �ַ������
 *
 * ����: ���������ַ�����ʽ�ķǸ����� num1 ��num2 ���������ǵĺͲ�ͬ�����ַ�����ʽ���ء�
 *      �㲻��ʹ���κ΃Ƚ������ڴ���������Ŀ⣨���� BigInteger���� Ҳ����ֱ�ӽ�������ַ���ת��Ϊ������ʽ��
 *
 * ����: 1 <= num1.length, num2.length <= 104
 *      num1 ��num2 ��ֻ�������� 0-9
 *      num1 ��num2 ���������κ�ǰ����
 *
 * ����: https://leetcode.cn/problems/add-strings/description/
 *
 */
class Leetcode415 {

    /**
     * ģ��
     * ʱ�� 174ms
     * �ڴ� 36.28MB
     */
    fun addStrings(num1: String, num2: String): String {
        var add = 0
        val aLength = num1.length
        val bLength = num2.length
        val sb = StringBuilder()
        for (i in 1..num1.length.coerceAtLeast(num2.length)) {
            val a = if (aLength >= i) num1[aLength - i] else '0'
            val b = if (bLength >= i) num2[bLength - i] else '0'
            val sum = a.code + b.code - 2 * '0'.code + add
            add = sum / 10
            sb.insert(0, sum % 10)
        }
        if (add == 1) {
            sb.insert(0, 1)
        }
        return sb.toString()
    }

}