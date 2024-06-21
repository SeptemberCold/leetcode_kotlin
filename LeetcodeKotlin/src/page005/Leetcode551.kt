package page005

/**
 *
 * ��Ŀ: ѧ�����ڼ�¼ I
 *
 * ����: ����һ���ַ��� s ��ʾһ��ѧ���ĳ��ڼ�¼�����е�ÿ���ַ�������ǵ���ĳ��������ȱ�ڡ��ٵ�������������¼��ֻ�����������ַ���
 *      'A'��Absent��ȱ��
 *      'L'��Late���ٵ�
 *      'P'��Present������
 *      ���ѧ���ܹ� ͬʱ ����������������������Ի�ó��ڽ�����
 *      �� �ܳ��� �ƣ�ѧ��ȱ�ڣ�'A'���ϸ� �������졣
 *      ѧ�� ���� ���� ���� 3 ��� ���� 3 �����ϵĳٵ���'L'����¼��
 *      ���ѧ�����Ի�ó��ڽ��������� true �����򣬷��� false ��
 *
 * ����: 1 <= s.length <= 1000
 *      s[i] Ϊ 'A'��'L' �� 'P'
 *
 * ����: https://leetcode.cn/problems/student-attendance-record-i/description/
 *
 */
class Leetcode551 {

    /**
     * ģ��
     * ִ����ʱ��152 ms
     * �ڴ����ģ�33.33 MB
     */
    fun checkRecord(s: String): Boolean {
        var late = false
        var absent = 0
        for (i in s.indices) {
            if (s[i] == 'A') {
                absent += 1
            } else if (s[i] == 'L' && i > 1) {
                if (s[i - 1] == 'L' && s[i - 2] == 'L') {
                    late = true
                }
            }
        }
        return absent < 2 && !late
    }

}