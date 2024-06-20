package page005

/**
 *
 * ��Ŀ: ��������� ��
 *
 * ����: ���������ַ��� a �� b���뷵�� �������ַ����� �����������  �ĳ��ȡ���������ڣ��򷵻� -1 ��
 *      ����������С� �������£�������Ϊ ĳ�ַ������е��
 *      ������
 *      ���������������ַ����������У� ��
 *      �ַ��� s �����������ڴ� s ��ɾ�������������ַ�����Ի�õ��ַ�����
 *      ���磬"abc" �� "aebdc" �������У���Ϊɾ�� "aebdc" ��б��Ӵֵ��ַ����Եõ� "abc" ��
 *      "aebdc" �������л����� "aebdc" �� "aeb" �� "" (���ַ���)��
 *
 * ����: 1 <= a.length, b.length <= 100
 *      a �� b ��СдӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/longest-uncommon-subsequence-i/description/
 *
 */
class Leetcode521 {

    /**
     * ���������� �Խת��
     * ִ����ʱ��133 ms
     * �ڴ����ģ�32.92 MB
     */
    fun findLUSlength(a: String, b: String): Int {
        if (a == b) return -1
        return if (a.length > b.length) a.length else b.length
    }

}