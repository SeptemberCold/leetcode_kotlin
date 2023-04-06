package page000

/**
 *
 * ��Ŀ:���ظ��ַ�����Ӵ�
 *
 * ����: ����һ���ַ���s,�����ҳ����в������ظ��ַ�����Ӵ��ĳ��ȡ�
 * ����: 0 <= s.length <= 5 * 104
 *      s��Ӣ����ĸ�����֡����źͿո����
 *
 * ����: https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 *
 */
class Leetcode003 {

    /**
     * �������ڼӹ�ϣ��
     * ִ����ʱ��204 ms
     * �ڴ����ģ�34.6 MB
     */
    fun lengthOfLongestSubstring(s: String): Int {
        //key��ʾ���ֹ����ַ� value��ʾ�ַ��Ƿ�����ظ�
        val hashMap = HashMap<Char, Int>()
        //��
        var answer = 0
        var i = 0
        for (j in s.indices) {
            val index = hashMap[s[j]]
            //���»�������ǰ����
            if (index != null && i <= index) {
                i = index + 1
            }
            //�жϻ������ڳ���
            if (j - i + 1 > answer) {
                answer = j - i + 1
            }
            //��ϣ�洢
            hashMap[s[j]] = j
        }
        return answer
    }

}