package page008

/**
 *
 * ��Ŀ: �ȽϺ��˸���ַ���
 *
 * ����: ���� s �� t �����ַ����������Ƿֱ����뵽�հ׵��ı��༭�������������ȣ����� true ��# �����˸��ַ���
 *      ע�⣺����Կ��ı������˸��ַ����ı�����Ϊ�ա�
 *
 * ����: 1 <= s.length, t.length <= 200
 *      s �� t ֻ����Сд��ĸ�Լ��ַ� '#'
 *
 * ����: https://leetcode.cn/problems/backspace-string-compare/description/
 *
 */
class Leetcode844 {

    /**
     * �ع��ַ���
     * ʱ�䣺148ms
     * �ڴ棺33.46MB
     */
    fun backspaceCompare(s: String, t: String): Boolean {
        val sChars = s.toCharArray()
        for (i in sChars.indices) {
            if (sChars[i] == '#') {
                sChars[i] = ' '
                for (j in i - 1 downTo 0) {
                    if (sChars[j] != ' ') {
                        sChars[j] = ' '
                        break
                    }
                }
            }
        }
        val tChars = t.toCharArray()
        for (i in tChars.indices) {
            if (tChars[i] == '#') {
                tChars[i] = ' '
                for (j in i - 1 downTo 0) {
                    if (tChars[j] != ' ') {
                        tChars[j] = ' '
                        break
                    }
                }
            }
        }
        val mS = StringBuilder()
        for (sChar in sChars) {
            if (sChar != ' ') mS.append(sChar)
        }
        val mT = StringBuilder()
        for (tChar in tChars) {
            if (tChar != ' ') mT.append(tChar)
        }
        return mS.toString() == mT.toString()
    }

}