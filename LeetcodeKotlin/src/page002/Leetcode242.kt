package page002

/**
 *
 * ��Ŀ: ��Ч����ĸ��λ��
 *
 * ����: ���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ����ĸ��λ�ʡ�
 *      ע�⣺��s �� t��ÿ���ַ����ֵĴ�������ͬ�����s �� t��Ϊ��ĸ��λ�ʡ�
 * ����: 1 <= s.length, t.length <= 5 * 104
 *      s �� t ������Сд��ĸ
 *
 * ����: https://leetcode.cn/problems/valid-anagram/
 *
 */
class Leetcode242 {

    /**
     * ��ϣ��
     * ִ����ʱ��200 ms
     * �ڴ����ģ�36.3 MB
     */
    fun isAnagram(s: String, t: String): Boolean {
        val map = HashMap<Char, Int>()
        val map2 = HashMap<Char, Int>()
        for (c in s) {
            map[c] = (map[c] ?: 0) + 1
        }
        for (c in t) {
            map2[c] = (map2[c] ?: 0) + 1
        }
        for (i in 'a'..'z') {
            val sum = map[i] ?: 0
            val sum2 = map2[i] ?: 0
            if (sum != sum2) return false
        }
        return true
    }

}