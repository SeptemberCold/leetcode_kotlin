package page018

/**
 *
 * ��Ŀ: ����������
 *
 * ����: һ�� ���� ָ����һ�����еĵ����õ����ո������������ҿ�ͷ�ͽ�βû���κοո�ÿ�����ʶ�ֻ����Сд���дӢ����ĸ��
 *      ���ǿ��Ը�һ��������� �� 1 ��ʼ�ĵ���λ������ �����ҽ����������е��� ����˳�� ��
 *      �ȷ�˵������ "This is a sentence" ���Ա�����˳��õ� "sentence4 a3 is2 This1" ���� "is2 sentence4 This1 a3" ��
 *      ����һ�� ����˳�� �ľ��� s ���������ĵ��ʲ����� 9 �����������¹��첢�õ�ԭ��˳��ľ��ӡ�
 * ����: 2 <= s.length <= 200
 *      s ֻ����Сд�ʹ�дӢ����ĸ���ո��Լ��� 1 �� 9 �����֡�
 *      s �е�����ĿΪ 1 �� 9 ����
 *      s �еĵ����ɵ����ո�ָ���
 *      s �������κ�ǰ�����ߺ�׺�ո�
 *
 * ����: https://leetcode.cn/problems/sorting-the-sentence/description/
 *
 */
class Leetcode1859 {

    /**
     * ��ϣ��
     * ʱ�� 188ms
     * �ڴ� 33.94mb
     */
    fun sortSentence(s: String): String {
        val array = s.split(" ")
        val map = HashMap<Int, String>()
        for (item in array) {
            map[item[item.length - 1].code - 48] = item.substring(0, item.length - 1)
        }
        val sb = StringBuilder()
        for (i in 1..9) {
            if (map[i] != null) {
                sb.append(map[i]).append(" ")
            } else break
        }
        if (sb.isEmpty()) return ""
        return sb.substring(0, sb.length - 1)
    }

}