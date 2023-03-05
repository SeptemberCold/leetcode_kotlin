package page000

/**
 *
 * ��Ŀ: ������
 *
 * ����: ����һ������ x ����� x ��һ���������������� true �����򣬷��� false ��
 *      ��������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 * ����: -231 <= x <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/palindrome-number/
 */
object Leetcode009 {

    /**
     * ת���ַ�����Ȼ����ǰһ����ַ��ͺ�һ����ַ���Ƚ�
     *
     * ִ����ʱ��196 ms
     * �ڴ����ģ�34.3 MB
     */
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        val loopLength = str.length / 2
        //���ǰһ����ַ����ͺ���ıȽ� ����ͬ��ʱ�򷵻�false
        for (i in 0..loopLength) {
            if (str[i] != str[str.length - 1 - i]) {
                return false
            }
        }
        return true
    }

}