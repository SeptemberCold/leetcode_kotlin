package page023

/**
 *
 * ��Ŀ:�����ͬ��ĸ��ľ���
 *
 * ����: ����һ���±�� 0 ��ʼ���ַ��� s �����ַ�������СдӢ����ĸ��ɣ�s �е�ÿ����ĸ�� ǡ�� ���� ���� ��
 *      �����һ���±�� 0 ��ʼ������Ϊ 26 �ĵ��������� distance ��
 *      ��ĸ���е�ÿ����ĸ���� 0 �� 25 ���α�ţ�����'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25����
 *      ��һ�� ���� �ַ����У��� i ����ĸ�����γ���֮�����ĸ������ distance[i] ��
 *      ����� i ����ĸû���� s �г��֣���ô distance[i] ���� ���� ��
 *      ��� s ��һ�� ���� �ַ��������� true �����򣬷��� false ��
 * ����:  2 <= s.length <= 52
 *       s ����СдӢ����ĸ���
 *       s �е�ÿ����ĸǡ�ó�������
 *       distance.length == 26
 *       0 <= distance[i] <= 50
 *
 * ����: https://leetcode.cn/problems/check-distances-between-same-letters/
 *
 */
class Leetcode2399 {

    /**
     * ��ϣ��
     * ִ����ʱ��216 ms
     * �ڴ����ģ�38.3 MB
     */
    fun checkDistances(s: String, distance: IntArray): Boolean {
        val map = HashMap<Char, Int>()
        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                val dis = i - map[s[i]]!! - 1
                if (dis != distance[(s[i] - 'a')]) {
                    return false
                }
            } else {
                map[s[i]] = i
            }
        }
        return true
    }

}