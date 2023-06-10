package page001

/**
 *
 * ��Ŀ: ��֤���Ĵ�
 *
 * ����: ����ڽ����д�д�ַ�ת��ΪСд�ַ������Ƴ����з���ĸ�����ַ�֮�󣬶������Ŷ��ͷ��Ŷ���һ�����������Ϊ�ö�����һ�� ���Ĵ� ��
 *      ��ĸ�����ֶ�������ĸ�����ַ���
 *      ����һ���ַ��� s��������� ���Ĵ� ������ true �����򣬷��� false ��
 * ����: 1 <= s.length <= 2 * 105
 *      s ���ɿɴ�ӡ�� ASCII �ַ����
 *
 * ����: https://leetcode.cn/problems/valid-palindrome/
 *
 */
class Leetcode125 {

    /**
     * ɸѡ + �ж�
     * ִ����ʱ��200 ms
     * �ڴ����ģ�36 MB
     */
    fun isPalindrome(s: String): Boolean {
        val stringBuilder = StringBuilder()
        for (c in s) {
            //����Сд��ĸ
            if (c in 'a'..'z') {
                stringBuilder.append(c)
            }
            //��дתСд ����
            if (c in 'A'..'Z') {
                stringBuilder.append(c + 32)
            }
            //��������
            if (c in '0'..'9') {
                stringBuilder.append(c)
            }
        }
        val str = stringBuilder.toString()
        println(str)
        //�ղη���ture
        if (str.isEmpty()) return true
        //����ǲ��ǻ���
        val length = str.length
        for (i in 0..length / 2) {
            if (str[i] != str[length - 1 - i]) {
                return false
            }
        }
        return true
    }

}