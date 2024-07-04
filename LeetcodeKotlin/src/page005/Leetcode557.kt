package page005


/**
 *
 * ��Ŀ: ��ת�ַ����еĵ��� III
 *
 * ����: ����һ���ַ��� s ������Ҫ��ת�ַ�����ÿ�����ʵ��ַ�˳��ͬʱ�Ա����ո�͵��ʵĳ�ʼ˳��
 *
 * ����: 1 <= s.length <= 5 * 104
 *      s �����ɴ�ӡ�� ASCII �ַ���
 *      s �������κο�ͷ���β�ո�
 *      s �� ���� ��һ���ʡ�
 *      s �е����е��ʶ���һ���ո������
 *
 * ����: https://leetcode.cn/problems/reverse-words-in-a-string-iii/description/
 *
 */
class Leetcode557 {

    /**
     * ��ջ
     * ʱ�䣺264ms
     * �ڴ棺39.71MB
     */
    fun reverseWords(s: String): String {
        val deque = ArrayDeque<Char>()
        val sb = StringBuilder()
        for (str in s) {
            if (str != ' ') {
                deque.add(str)
            } else {
                while (deque.isNotEmpty()) {
                    val char = deque.removeLast()
                    sb.append(char)
                }
                sb.append(' ')
            }
        }
        while (deque.isNotEmpty()) {
            val char = deque.removeLast()
            sb.append(char)
        }
        return sb.toString()
    }

}