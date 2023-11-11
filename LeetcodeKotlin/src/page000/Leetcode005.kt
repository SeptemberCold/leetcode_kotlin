package page000

/**
 *
 * ��Ŀ: ������Ӵ�
 *
 * ����: ����һ���ַ��� s���ҵ� s ����Ļ����Ӵ���
 *      ����ַ����ķ�����ԭʼ�ַ�����ͬ������ַ�����Ϊ�����ַ�����
 * ����: 1 <= s.length <= 1000
 *      s �������ֺ�Ӣ����ĸ���
 *
 * ����: https://leetcode.cn/problems/longest-palindromic-substring/description/
 *
 */
class Leetcode005 {

    /**
     * �����ƽ�
     * ʱ�� 236ms
     * �ڴ� 35.63MB
     */
    fun longestPalindrome(s: String): String {
        var len = s.length
        val chars = s.toCharArray()
        while (len != 0) {
            for (i in 0..(s.length - len)) {
                var result = true
                for (j in i..(len / 2) + i) {
                    val j2 = len + i - 1 - j + i
                    if (chars[j] != chars[j2]) {
                        result = false
                        break
                    }
                }
                if (result) return s.substring(i, len + i)
            }
            len -= 1
        }
        return s[0].toString()
    }

}