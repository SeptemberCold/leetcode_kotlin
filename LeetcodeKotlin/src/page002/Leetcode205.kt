package page002

/**
 *
 * ��Ŀ: ͬ���ַ���
 *
 * ����: ���������ַ���s��t���ж������Ƿ���ͬ���ġ�
 *      ���s�е��ַ����԰�ĳ��ӳ���ϵ�滻�õ�t����ô�������ַ�����ͬ���ġ�
 *      ÿ�����ֵ��ַ���Ӧ��ӳ�䵽��һ���ַ���ͬʱ���ı��ַ���˳�򡣲�ͬ�ַ�����ӳ�䵽ͬһ���ַ��ϣ���ͬ�ַ�ֻ��ӳ�䵽ͬһ���ַ��ϣ��ַ�����ӳ�䵽�Լ�����
 * ����: 1 <= s.length <= 5 * 104
 *      t.length == s.length
 *      s �� t ��������Ч�� ASCII �ַ����
 *
 * ����: https://leetcode.cn/problems/isomorphic-strings/
 *
 */
class Leetcode205 {


    /**
     * ˫��ϣ��
     * ִ����ʱ��200 ms
     * �ڴ����ģ�35.8 MB
     */
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val map1 = HashMap<Char, Char>()
        val map2 = HashMap<Char, Char>()
        for (i in s.indices) {
            val x = s[i]
            val y = t[i]
            //������ϣ���ǿյ� ��ֵ
            if (map1[x] == null && map2[y] == null) {
                map1[x] = y
                map2[y] = x
            }
            //ֻ��һ����ϣ��ʾ�յ� ӳ��ʧ��
            else if ((map1[x] != null && map2[y] == null) || (map1[x] == null && map2[y] != null)) {
                return false
            }
            //������ϣ��Ϊ�� ӳ���ж�
            else {
                if (map1[x] != y) return false
            }
        }
        return true
    }

}