package page007

/**
 *
 * ��Ŀ: ת����Сд��ĸ
 *
 * ����: ����һ���ַ��� s �������ַ����еĴ�д��ĸת������ͬ��Сд��ĸ�������µ��ַ�����
 *
 * ����: 1 <= s.length <= 100
 *      s �� ASCII �ַ����еĿɴ�ӡ�ַ����
 *
 * ����: https://leetcode.cn/problems/to-lower-case/description/
 *
 */
class Leetcode709 {

    /**
     * �ַ����Ӽ�
     * ʱ�䣺139ms
     * �ڴ棺33.79MB
     */
    fun toLowerCase(s: String): String {

        val array = s.toCharArray()
        val gap = 'A' - 'a'
        for (i in array.indices) {
            if (array[i] in 'A'..'Z') {
                array[i] = array[i] - gap
            }
        }
        return String(array)
    }


}