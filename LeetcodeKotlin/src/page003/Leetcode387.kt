package page003

/**
 *
 * ��Ŀ: �ַ����еĵ�һ��Ψһ�ַ�
 *
 * ����: ����һ���ַ��� s ���ҵ� ���ĵ�һ�����ظ����ַ����������������� ����������ڣ��򷵻� -1 ��
 * ����: 1 <= s.length <= 105
 *      s ֻ����Сд��ĸ
 *
 * ����: https://leetcode.cn/problems/first-unique-character-in-a-string/
 *
 */
class Leetcode387 {

    /**
     * ��ϣ�� �����ƽ�
     * ִ����ʱ��264 ms
     * �ڴ����ģ�36.5 MB
     */
    fun firstUniqChar(s: String): Int {
        val temp = HashMap<Char, Int>()

        for (c in s) {
            temp[c] = (temp[c] ?: 0) + 1
        }

        val only = ArrayList<Char>()

        for (entry in temp) {
            if (entry.value == 1) {
                only.add(entry.key)
            }
        }

        for (i in s.indices) {
            if (only.contains(s[i])) {
                return i
            }
        }

        return -1
    }

    /**
     * ����һ���Ż�
     *
     * ִ����ʱ��256 ms
     * �ڴ����ģ�36.5 MB
     */
    fun firstUniqChar2(s: String): Int {
        val temp = HashMap<Char, Int>()
        for (c in s) {
            temp[c] = (temp[c] ?: 0) + 1
        }
        for (i in s.indices) {
            if (temp[s[i]] == 1) {
                return i
            }
        }
        return -1
    }

}