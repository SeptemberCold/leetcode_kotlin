package page004

/**
 *
 * ��Ŀ: �ַ�����
 *
 * ����: ��������һλ�ܰ��ļҳ�����Ҫ����ĺ�����һЩС���ɡ����ǣ�ÿ���������ֻ�ܸ�һ����ɡ�
 *      ��ÿ������ i������һ��θ��ֵ g[i]���������ú���������θ�ڵı��ɵ���С�ߴ磻����ÿ����� j��
 *      ����һ���ߴ� s[j] ����� s[j] >= g[i]��
 *      ���ǿ��Խ�������� j ��������� i ��������ӻ�õ����㡣
 *      ���Ŀ���Ǿ���������Խ�������ĺ��ӣ��������������ֵ��
 *
 * ����: 1 <= g.length <= 3 * 104
 *      0 <= s.length <= 3 * 104
 *      1 <= g[i], s[j] <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/assign-cookies/description/
 *
 */
class Leetcode455 {

    /**
     * ���� ˫ָ��
     * ʱ�� 245ms
     * �ڴ� 40.01MB
     */
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        //��������
        g.sort()
        s.sort()
        var sum = 0
        var j = 0
        for (children in g) {
            if (j >= s.size) {
                return sum
            }
            while (j < s.size) {
                if (s[j] >= children) {
                    sum += 1
                    j += 1
                    break
                }
                j += 1
            }

        }
        return sum
    }

}