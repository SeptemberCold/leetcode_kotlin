package page005


/**
 *
 * ��Ŀ: ������
 *
 * ����: ����һ�� ��������������ͳ������������������ ������ ֮����ȣ����ǳ���Ϊ ������������
 *      ����һ�� ���� n�� ����������������� true�����򷵻� false��
 *
 * ����: 1 <= num <= 108
 *
 * ����: https://leetcode.cn/problems/perfect-number/description/
 *
 */
class Leetcode507 {

    /**
     * ��� 1���ڷ���Ҫ���ֻ��5���� �ٷ�����ⶼ����ˣ�������ƨ
     * ʱ�� 126ms
     * �ڴ� 32.57MB
     */
    fun checkPerfectNumber(num: Int): Boolean {
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336
    }

}