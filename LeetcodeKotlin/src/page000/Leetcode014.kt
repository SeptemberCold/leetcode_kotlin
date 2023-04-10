package page000

/**
 *
 * ��Ŀ: �����ǰ׺
 *
 * ����: ��дһ�������������ַ��������е������ǰ׺��
 *      ��������ڹ���ǰ׺�����ؿ��ַ��� ""��
 * ����: 1 <= strs.length <= 200
 *      0 <= strs[i].length <= 200
 *      strs[i] ����СдӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/longest-common-prefix/
 *
 */
class Leetcode014 {

    /**
     * ģ��
     * ִ����ʱ��192 ms
     * �ڴ����ģ� 35.2 MB
     */
    fun longestCommonPrefix(strs: Array<String>): String {
        val answer = StringBuilder()
        var index = 0
        while (true) {
            var c = ' '
            for (str in strs) {
                //���һ�� ���ؽ��
                if (index >= str.length) return answer.toString()
                if (c == ' ') {
                    c = str[index]
                } else {
                    if (c != str[index]) return answer.toString()
                }
            }
            answer.append(c)
            index++
        }
    }

}