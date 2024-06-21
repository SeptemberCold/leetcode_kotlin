package page005

import java.lang.StringBuilder

/**
 *
 * ��Ŀ: ��ת�ַ��� II
 *
 * ����: ����һ���ַ��� s ��һ������ k�����ַ�����ͷ����ÿ������ 2k ���ַ����ͷ�ת�� 2k �ַ��е�ǰ k ���ַ���
 *      ���ʣ���ַ����� k ������ʣ���ַ�ȫ����ת��
 *      ���ʣ���ַ�С�� 2k �����ڻ���� k ������תǰ k ���ַ��������ַ�����ԭ����
 *
 * ����: 1 <= s.length <= 104
 *      s ����СдӢ�����
 *      1 <= k <= 104
 *
 * ����: https://leetcode.cn/problems/reverse-string-ii/description/
 *
 */
class Leetcode541 {

    /**
     * ģ��
     * ִ����ʱ��186 ms
     * �ڴ����ģ�38.02 MB
     */
    fun reverseStr(s: String, k: Int): String {
        val sb = StringBuilder()

        for (i in s.indices step k) {
            val end = (i + k).coerceAtMost(s.length)
            val str = s.substring(i, end)
            if (i / k and 1 == 0) {
                sb.append(str.reversed())
            } else {
                sb.append(str)
            }
        }
        return sb.toString()
    }

}