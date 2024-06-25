package page004

/**
 *
 * ��Ŀ: �����ַ�����Ƶ������
 *
 * ����: ����һ���ַ��� s �������ַ����ֵ� Ƶ�� ������� �������� ��
 *      һ���ַ����ֵ� Ƶ�� �����������ַ����еĴ�����
 *      ���� ��������ַ��� ������ж���𰸣����������κ�һ����
 *
 * ����: 1 <= s.length <= 5 * 105
 *      s �ɴ�СдӢ����ĸ���������
 *
 * ����: https://leetcode.cn/problems/sort-characters-by-frequency/description/
 *
 */
class Leetcode451 {

    /**
     * ģ��
     * ʱ�� 246ms
     * �ڴ� 38.44MB
     */
    fun frequencySort(s: String): String {
        val hashMap = HashMap<Char, Int>()
        val sb = StringBuilder()
        //����
        for (c in s) {
            hashMap[c] = (hashMap[c] ?: 0) + 1
        }
        val charList = ArrayList<Char>()
        for ((key, _) in hashMap) {
            charList.add(key)
        }
        //����
        charList.sortWith { a, b ->
            if (hashMap[a] == hashMap[b]) return@sortWith 0
            if (hashMap[a]!! > hashMap[b]!!) return@sortWith -1
            return@sortWith 1
        }
        //���
        for (c in charList) {
            for (i in 0 until hashMap[c]!!) {
                sb.append(c)
            }
        }
        return sb.toString()
    }

}