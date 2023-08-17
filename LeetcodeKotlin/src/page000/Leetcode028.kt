package page000

/**
 *
 * ��Ŀ: �ҳ��ַ����е�һ��ƥ������±�
 *
 * ����: ���������ַ��� haystack �� needle ��
 *      ������ haystack �ַ������ҳ� needle �ַ����ĵ�һ��ƥ������±꣨�±�� 0 ��ʼ����
 *      ��� needle ���� haystack ��һ���֣��򷵻�  -1 ��
 * ����: 1 <= haystack.length, needle.length <= 104
 *      haystack �� needle ����СдӢ���ַ����
 *
 * ����: https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 *
 */
class Leetcode028 {

    /**
     * �ַ��ָ�
     * ʱ�� 168ms
     * �ڴ� 33.72mb
     */
    fun strStr(haystack: String, needle: String): Int {
        val array = haystack.split(needle)
        return if (array.size == 1) {
            -1
        } else {
            array[0].length
        }
    }

}