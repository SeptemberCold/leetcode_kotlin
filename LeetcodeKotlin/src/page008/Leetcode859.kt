package page008

/**
 *
 * ��Ŀ: �����ַ���
 *
 * ����: ���������ַ��� s �� goal ��ֻҪ���ǿ���ͨ������ s �е�������ĸ�õ��� goal ��ȵĽ�����ͷ��� true �����򷵻� false ��
 *      ������ĸ�Ķ����ǣ�ȡ�����±� i �� j ���±�� 0 ��ʼ�������� i != j �����Ž��� s[i] �� s[j] �����ַ���
 *      ���磬�� "abcd" �н����±� 0 ���±� 2 ��Ԫ�ؿ������� "cbad" ��
 *
 * ����: 1 <= s.length, goal.length <= 2 * 104
 *      s �� goal ��СдӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/buddy-strings/description/
 *
 */
class Leetcode859 {

    /**
     * ͳ��
     * ʱ�䣺161ms
     * �ڴ棺36.27MB
     */
    fun buddyStrings(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        //ͬ�����ַ���
        if (s == goal) {
            val hashMap = HashMap<Char, Int>()
            //�����û������һ�����ַ�
            for (i in s) {
                if (hashMap.containsKey(i)) {
                    return true
                } else {
                    hashMap[i] = 1
                }
            }
            //û�оͲ��������ַ���
            return false
        }
        //��¼��һ��������
        val list = ArrayList<Int>()
        for (i in s.indices) {
            if (s[i] != goal[i]) list.add(i)
        }
        if (list.size != 2) {
            return false
        }
        return s[list[0]] == goal[list[1]] && s[list[1]] == goal[list[0]]
    }

}