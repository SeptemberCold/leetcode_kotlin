package page003

/**
 *
 * ��Ŀ: �Ҳ�ͬ
 *
 * ����: ���������ַ��� s �� t ������ֻ����Сд��ĸ��
 *      �ַ��� t ���ַ��� s ������ţ�Ȼ�������λ�����һ����ĸ��
 *      ���ҳ��� t �б���ӵ���ĸ��
 * ����: 0 <= s.length <= 1000
 *      t.length == s.length + 1
 *      s �� t ֻ����Сд��ĸ
 *
 * ����: https://leetcode.cn/problems/find-the-difference/
 *
 */
class Leetcode389 {

    /**
     * ���
     * ������kotlin��û��char.code���� ��Ҫ�ĳ�char.toInt()�ſ���ִ��
     *
     * ִ����ʱ��148 ms
     * �ڴ����ģ�33.7 MB
     */
    fun findTheDifference(s: String, t: String): Char {
        var sum = 0
        for (c in s) {
            sum += c.code
        }
        var sum2 = 0
        for (c in t) {
            sum2 += c.code
        }
        return (sum2 - sum).toChar()
    }

}