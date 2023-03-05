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

    /**
     * int��ת�Ƚ�
     *
     * ִ����ʱ��228 ms
     * �ڴ����ģ�34.2 MB
     */
    fun isPalindrome2(x: Int): Boolean {
        //����ֱ���ж�
        if (x < 0) return false
        //������ ��1234Ϊ�� temp = 1234
        var temp = x
        //��ת��
        var turnOver = 0
        while (temp != 0) {
            //������� remainder = 4 3 2 1
            val remainder = temp % 10
            //�����ܺ� turnOver = 4 43 432 4321
            turnOver = turnOver * 10 + remainder
            //ʣ�෭ת���� temp = 123 12 1 0
            temp /= 10
        }
        return turnOver == x
    }


}