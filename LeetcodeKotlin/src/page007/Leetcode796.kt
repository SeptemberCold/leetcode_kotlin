package page007

/**
 *
 * ��Ŀ: ��ת�ַ���
 *
 * ����: ���������ַ���, s �� goal����������ɴ���ת����֮��s �ܱ�� goal ����ô���� true ��
 *      s �� ��ת���� ���ǽ� s ����ߵ��ַ��ƶ������ұߡ�
 *      ����, �� s = 'abcde'������תһ��֮��������'bcdea' ��
 *
 * ����: 1 <= s.length, goal.length <= 100
 *      s �� goal ��СдӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/rotate-string/description/
 *
 */
class Leetcode796 {

    /**
     * �ַ���ƥ��
     * ʱ�䣺143ms
     * �ڴ棺33.25MB
     */
    fun rotateString(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        val ms = s + s;
        val keys = ArrayList<Int>()
        for (i in 0 until ms.length - goal.length) {
            keys.add(i)
        }
        for (i in goal.indices) {
            val temp = HashSet<Int>()
            for (key in keys) {
                if (ms[key + i] != goal[i]) {
                    temp.add(key)
                }
            }
            keys.removeAll(temp)
        }
        return keys.isNotEmpty()
    }

}