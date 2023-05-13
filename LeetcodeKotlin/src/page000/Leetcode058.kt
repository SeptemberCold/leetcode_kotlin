package page000

/**
 *
 * ��Ŀ: ���һ�����ʵĳ���
 *
 * ����: ����һ���ַ��� s�������ɵ�����ɣ�����ǰ����һЩ�ո��ַ�������
 *      �����ַ����� ���һ�� ���ʵĳ��ȡ�
 *      ���� ��ָ������ĸ��ɡ��������κοո��ַ���������ַ�����
 * ����: 1 <= s.length <= 104
 *      s ����Ӣ����ĸ�Ϳո� ' ' ���
 *      s �����ٴ���һ������
 *
 * ����: https://leetcode.cn/problems/length-of-last-word/
 *
 */
class Leetcode058 {

    /**
     * api����
     * ִ����ʱ��188 ms
     * �ڴ����ģ�36.6 MB
     */
    fun lengthOfLastWord(s: String): Int {
        val split = s.split(" ")
        for (i in split.size - 1 downTo 0) {
            if (split[i].isNotEmpty()) {
                return split[i].length
            }
        }
        return 0
    }

    /**
     * �������
     * ִ����ʱ��140 ms
     * �ڴ����ģ�33.9 MB
     */
    fun lengthOfLastWord2(s: String): Int {
        var end = -1
        //�������
        for (i in s.length - 1 downTo 0) {
            //�������һ����ĸ����¼����
            if (end == -1 && s[i] != ' ') end = i
            //�������һ����ĸ���ҵ��ո� ��ʾ������һ������
            if (end != -1 && s[i] == ' ') return end - i
        }
        //������֪���� ���û��ǰ�ÿո� �����ַ�����ֻ��һ������
        return end + 1
    }


}