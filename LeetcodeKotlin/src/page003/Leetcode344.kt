package page003

/**
 *
 * ��Ŀ: ��ת�ַ���
 *
 * ����: ��дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� s ����ʽ������
 *      ��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣
 * ����: 1 <= s.length <= 105
 *      s[i] ���� ASCII ����еĿɴ�ӡ�ַ�
 *
 * ����: https://leetcode.cn/problems/reverse-string/
 *
 */
class Leetcode344 {

    /**
     * �ַ�������
     * ִ����ʱ��316 ms
     * �ڴ����ģ�42.1 MB
     */
    fun reverseString(s: CharArray) {
        val sb = StringBuilder()
        for (c in s.size - 1 downTo 0) {
            sb.append(s[c])
        }
        val str = sb.toString()

        for (i in str.indices) {
            s[i] = str[i]
        }
    }

}