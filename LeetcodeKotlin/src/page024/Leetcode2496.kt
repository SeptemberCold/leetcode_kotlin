package page024

/**
 *
 * ��Ŀ: �������ַ��������ֵ
 *
 * ����: һ������ĸ��������ɵ��ַ����� ֵ�������£�
 *      ����ַ��� ֻ �������֣���ôֵΪ���ַ����� 10�����µ�����ʾ�����֡�
 *      ����ֵΪ�ַ����� ���ȡ�
 *      ����һ���ַ�������strs��ÿ���ַ�����ֻ����ĸ��������ɣ����㷵�� strs���ַ����� ���ֵ��
 * ����: 1 <= strs.length <= 100
 *      1 <= strs[i].length <= 9
 *      strs[i] ֻ����СдӢ����ĸ�����֡�
 *
 * ����: https://leetcode.cn/problems/maximum-value-of-a-string-in-an-array/
 *
 */
class Leetcode2496 {

    /**
     * �ַ�������
     * ִ����ʱ��140 ms
     * �ڴ����ģ�32.7 MB
     */
    fun maximumValue(strs: Array<String>): Int {
        var result = 0
        for (str in strs) {
            var tag = false
            for (c in str) {
                if (c in 'a'..'z' || c in 'A'..'Z') {
                    if (str.length > result) {
                        result = str.length
                    }
                    tag = true
                    break
                }
            }
            if (!tag) {
                if (str.toInt() > result) {
                    result = str.toInt()
                }
            }
        }
        return result
    }

}