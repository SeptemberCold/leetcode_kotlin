package page004

import java.lang.StringBuilder

/**
 *
 * ��Ŀ: ��Կ��ʽ��
 *
 * ����: ����һ�������Կ�ַ��� s��������ĸ�������ַ������ۺ���ɡ��ַ����� n �����ۺŷֳ� n + 1 �顣��Ҳ��õ�һ������ k ��
 *      ������Ҫ���¸�ʽ���ַ��� s��ʹÿһ����� k ���ַ������˵�һ�飬�����Ա� k �̣�
 *      ����Ȼ�����������һ���ַ���
 *      ���⣬����֮�����������ۺţ�����Ӧ�ý�����Сд��ĸת��Ϊ��д��ĸ��
 *      ���� ���¸�ʽ���������Կ ��
 *
 * ����: 1 <= s.length <= 105
 *      s ֻ������ĸ�����ֺ����ۺ� '-'.
 *      1 <= k <= 104
 *
 * ����: https://leetcode.cn/problems/license-key-formatting/description/
 *
 */
class Leetcode482 {

    /**
     * ģ��
     * ʱ�� 213ms
     * �ڴ� 39.01MB
     */
    fun licenseKeyFormatting(s: String, k: Int): String {
        //����ԭ�������ۺ�
        val s1 = s.replace("-", "").uppercase()
        if (s1.isEmpty()) return ""
        //�����һ�����ʵĳ���
        val start = s1.length % k
        val sb = StringBuilder()
        if (start != 0) {
            sb.append(s1.substring(0, start)).append("-")
        }
        for (i in start..<s1.length step k) {
            sb.append(s1.substring(i, i + k)).append("-")
        }
        return sb.substring(0, sb.length - 1)
    }


}