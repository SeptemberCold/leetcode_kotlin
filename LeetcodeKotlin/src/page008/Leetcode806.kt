package page008

/**
 *
 * ��Ŀ: д�ַ�����Ҫ������
 *
 * ����: ����Ҫ�Ѹ������ַ��� S ������д��ÿһ���ϣ�ÿһ�е������Ϊ100����λ��
 *      ���������дĳ����ĸ��ʱ���ʹ���г�����100 ����λ����ô����Ӧ�ð������ĸд����һ�С�
 *      ���Ǹ�����һ������ widths ��������� widths[0] ���� 'a' ��Ҫ�ĵ�λ��
 *      widths[1] ���� 'b' ��Ҫ�ĵ�λ��...�� widths[25] ���� 'z' ��Ҫ�ĵ�λ��
 *      ���ڻش��������⣺���ٶ������ܷ���S���Լ����һ��ʹ�õĿ���Ƕ��ٸ���λ������Ĵ���Ϊ����Ϊ2�������б��ء�
 *
 * ����: �ַ��� S �ĳ����� [1, 1000] �ķ�Χ��
 *      S ֻ����Сд��ĸ��
 *      widths �ǳ���Ϊ 26�����顣
 *      widths[i] ֵ�ķ�Χ�� [2, 10]��
 *
 * ����: https://leetcode.cn/problems/number-of-lines-to-write-string/description/
 *
 */
class Leetcode806 {

    /**
     * ģ��
     * ʱ�䣺159ms
     * �ڴ棺34MB
     */
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        var row = 1
        var sum = 0
        for (c in s) {
            val width = widths[c - 'a']
            sum += width
            if (sum > 100) {
                row += 1
                sum = width
            }
        }
        return intArrayOf(row, sum)
    }

}