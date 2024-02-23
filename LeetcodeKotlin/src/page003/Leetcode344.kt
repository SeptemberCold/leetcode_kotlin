package page003

/**
 *
 * ��Ŀ: ��ת�ַ���
 *
 * ����: ��дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� s ����ʽ������
 *      ��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣
 * ����: 1 <= s.length <= 105
 *      s[i] ���� ASCII ����еĿɴ�ӡ�ַ�
 *
 * ����: https://leetcode.cn/problems/reverse-string/
 *
 */
class Leetcode344 {

    /**
     * �ַ�������
     * ִ����ʱ��316 ms
     * �ڴ����ģ�42.1 MB
     */
    fun reverseString(s: CharArray) {
        val sb = StringBuilder()
        for (c in s.size - 1 downTo 0) {
            sb.append(s[c])
        }
        val str = sb.toString()

        for (i in str.indices) {
            s[i] = str[i]
        }
    }

    /**
     * ԭ�ط�ת
     * ��ʱ��226ms
     * �ڴ棺50.07MB
     */
    fun reverseString2(s: CharArray){
        //i����ָ�� s.length-1-i����ָ��
        for (i in 0 until s.size / 2) {
            //��һ�� s[i]����洢��������  ����s[i]=a^b    s[s.length-1-i]=b
            s[i] = (s[i].code xor s[s.size - 1 - i].code).toChar()
            //�ڶ��� ����s[s.length-1-i]�����ݽ�����a,��ʽ:a^b^b=a   ����s[i]=a^b    s[s.length-1-i]=a
            s[s.size - 1 - i] = (s[i].code xor s[s.size - 1 - i].code).toChar()
            //����������ѽ�����������ݰ���һ�����ݽ�������,��ʽ:a^b^a=b  ����s[i]=b   s[s.length-1-i]=a
            s[i] = (s[i].code xor s[s.size - 1 - i].code).toChar()
        }
    }

}