package page000

/**
 *
 * ��Ŀ: ��������ת����
 *
 * ����: �������ְ������������ַ�: I�� V�� X�� L��C��D �� M��
 *      ���磬 �������� 2 д��II����Ϊ�������е� 1 ��12 д��XII����ΪX+II�� 27 д��XXVII, ��ΪXX+V+II��
 *      ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д��IIII������IV��
 *      ���� 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��
 *      ͬ���أ����� 9 ��ʾΪIX���������Ĺ���ֻ�������������������
 *
 *      I���Է���V(5) ��X(10) ����ߣ�����ʾ 4 �� 9��
 *      X���Է���L(50) ��C(100) ����ߣ�����ʾ 40 ��90��
 *      C���Է���D(500) ��M(1000) ����ߣ�����ʾ400 ��900��
 *
 *      ����һ���������֣�����ת����������
 *
 *      �ַ�          ��ֵ
 *      I             1
 *      V             5
 *      X             10
 *      L             50
 *      C             100
 *      D             500
 *      M             1000
 *
 * ����: 1 <= s.length <= 15s
 *      �����ַ� ('I', 'V', 'X', 'L', 'C', 'D', 'M')
 *      ��Ŀ���ݱ�֤ s ��һ����Ч���������֣��ұ�ʾ�����ڷ�Χ [1, 3999] ��
 *      ��Ŀ�������������Է�������������д���򣬲�����ֿ�λ�������
 *      IL �� IM ���������Ӳ���������ĿҪ��49 Ӧ��д�� XLIX��999 Ӧ��д�� CMXCIX ��
 *      �����������ֵ��꾡��д���򣬿��Բο� �������� - Mathematics ��
 *
 * ����: https://leetcode.cn/problems/roman-to-integer/
 *
 */
class Leetcode013 {

    /**
     * ö��
     * ִ����ʱ��300 ms
     * �ڴ����ģ�38.8 MB
     */
    fun romanToInt(s: String): Int {
        var answer = 0
        //���ҵ�6��������ַ�
        //�ҵ�4
        val replace1 = s.replace("IV", "")
        if (replace1.length != s.length) answer += 4
        //�ҵ�9
        val replace2 = replace1.replace("IX", "")
        if (replace2.length != replace1.length) answer += 9
        //�ҵ�40
        val replace3 = replace2.replace("XL", "")
        if (replace2.length != replace3.length) answer += 40
        //�ҵ�90
        val replace4 = replace3.replace("XC", "")
        if (replace4.length != replace3.length) answer += 90
        //�ҵ�400
        val replace5 = replace4.replace("CD", "")
        if (replace4.length != replace5.length) answer += 400
        //�ҵ�900
        val replace6 = replace5.replace("CM", "")
        if (replace6.length != replace5.length) answer += 900

        //���������ֵ
        for (c in replace6) {
            answer += when (c) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
        }

        //���ؽ��
        return answer
    }


}