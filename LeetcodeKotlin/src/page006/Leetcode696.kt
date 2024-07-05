package page006

/**
 *
 * ��Ŀ: �����������Ӵ�
 *
 * ����: ����һ���ַ��� s��ͳ�Ʋ����ؾ�����ͬ���� 0 �� 1 �ķǿգ����������ַ�����������������Щ���ַ����е����� 0 ������ 1 ���ǳ��������ġ�
 *      �ظ����֣���ͬλ�ã����Ӵ�ҲҪͳ�����ǳ��ֵĴ�����
 *
 * ����: 1 <= s.length <= 105
 *      s[i] Ϊ '0' �� '1'
 *
 * ����: https://leetcode.cn/problems/count-binary-substrings/description/
 *
 */
class Leetcode696 {

    /**
     * ͳ��
     * ʱ�䣺227ms
     * �ڴ棺37.36MB
     */
    fun countBinarySubstrings(s: String): Int {
        var sum = 0
        var char = s[0]
        val array = ArrayList<Int>()

        for (c in s) {
            if (c == char) {
                sum += 1
            } else {
                array.add(sum)
                sum = 1
                char = c
            }
        }
        array.add(sum)
        sum = 0
        for (i in 0 until array.size - 1) {
            sum += if (array[i] > array[i + 1]) array[i + 1] else array[i]
        }

        return sum
    }

}