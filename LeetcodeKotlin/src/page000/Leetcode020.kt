package page000

/**
 *
 * ��Ŀ: ��Ч������
 *
 * ����: ����һ��ֻ���� '('��')'��'{'��'}'��'['��']'���ַ��� s ���ж��ַ����Ƿ���Ч��
 *      ��Ч�ַ��������㣺
 *          �����ű�������ͬ���͵������űպϡ�
 *          �����ű�������ȷ��˳��պϡ�
 *          ÿ�������Ŷ���һ����Ӧ����ͬ���͵������š�
 *
 * ����: 1 <= s.length <= 104
 *      s �������� '()[]{}' ���
 *
 * ����: https://leetcode.cn/problems/valid-parentheses/
 *
 */
class Leetcode020 {

    /**
     * �ַ����滻
     * ִ����ʱ��276 ms
     * �ڴ����ģ�38.6 MB
     */
    fun isValid(s: String): Boolean {
        var temp = s
        while (true) {
            //�����������滻��
            val replace1 = temp.replace("()", "")
            val replace2 = replace1.replace("{}", "")
            val replace3 = replace2.replace("[]", "")
            //�ж���û�б��滻�������� û�оͷ���
            if (replace3.length == temp.length) return temp.isEmpty()
            //���������һ���滻
            temp = replace3
        }
    }

}