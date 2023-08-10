package page004

/**
 *
 * ��Ŀ: ����Ĵ�
 *
 * ����: ����һ��������д��ĸ��Сд��ĸ���ַ��� s ������ ͨ����Щ��ĸ����ɵ� ��Ļ��Ĵ� ��
 *      �ڹ�������У���ע�� ���ִ�Сд ������ "Aa" ���ܵ���һ�������ַ�����
 * ����: 1 <= s.length <= 2000
 *      s ֻ��Сд ��/�� ��дӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/longest-palindrome/description/
 *
 */
class Leetcode409 {

    /**
     * ��ϣ��
     * ʱ�� 152ms
     * �ڴ� 32.65mb
     */
    fun longestPalindrome(s: String): Int {
        val hash = HashMap<Char, Int>()
        for (c in s) {
            hash[c] = (hash[c] ?: 0) + 1
        }
        var add = 0
        var one = 0
        for (entry in hash) {
            if (entry.value % 2 == 0) {
                add += entry.value
            } else {
                add += entry.value - 1
                one = 1
            }
        }
        return add + one
    }

}