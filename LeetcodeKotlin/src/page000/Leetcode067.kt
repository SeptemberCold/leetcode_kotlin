package page000

/**
 *
 * ��Ŀ: ���������
 *
 * ����: ���������������ַ��� a �� b ���Զ������ַ�������ʽ�������ǵĺ͡�
 * ����: 1 <= a.length, b.length <= 104
 *      a �� b �����ַ� '0' �� '1' ���
 *      �ַ���������� "0" ���Ͳ���ǰ����
 *
 * ����: https://leetcode.cn/problems/add-binary/
 *
 */
class Leetcode067 {

    /**
     * �ַ����ж�
     * ִ����ʱ��152 ms
     * �ڴ����ģ�33.9 MB
     */
    fun addBinary(a: String, b: String): String {
        val s1 = if (a.length > b.length) a else b
        val s2 = if (a.length > b.length) b else a
        val sb = StringBuilder()
        var add = false
        //�������ݽ������
        for (i in s1.length - 1 downTo 0) {
            val s2Index = s2.length - s1.length + i
            //��������0
            if (s1[i] == '0' && s2[s2Index] == '0') {
                sb.append(if (add) '1' else '0')
                add = false
            }
            //��һ����1 ��һ����0
            else if ((s1[i] == '1' && s2[s2Index] == '0') || (s1[i] == '0' && s2[s2Index] == '1')) {
                if (add) {
                    sb.append('0')
                } else {
                    sb.append('1')
                }
            }
            //��������1
            else if ((s1[i] == '1' && s2[s2Index] == '1')) {
                sb.append(if (add) '1' else '0')
                add = true
            }
            if (s2Index == 0) break
        }
        //���ƴ���
        for (i in s1.length - s2.length - 1 downTo 0) {
            if (s1[i] == '0' && add) {
                sb.append('1')
                add = false
            } else if (s1[i] == '1' && add) {
                sb.append('0')
                add = true
            } else if (!add) {
                sb.append(s1[i])
            }
        }
        //ͷ�����
        if (add) sb.append('1')
        //��ת
        val result = StringBuilder()
        for (i in sb.length - 1 downTo 0) {
            result.append(sb[i])
        }
        return result.toString()
    }

}