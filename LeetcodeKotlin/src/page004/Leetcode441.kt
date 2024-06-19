package page004

/**
 *
 * ��Ŀ: ����Ӳ��
 *
 * ����: ���ܹ��� n öӲ�ң����ƻ������ǰ�����״���С�
 *      ����һ���� k ����ɵĽ��ݣ���� i �б��������� i öӲ�ҡ�
 *      ���ݵ����һ�� ���� �ǲ������ġ�
 *      ����һ������ n �����㲢���ؿ��γ� ���������� ����������
 *
 * ����: 1 <= n <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/arranging-coins/description/
 *
 */
class Leetcode441 {

    /**
     * �����ݼ�
     * ʱ�� 131ms
     * �ڴ� 33.08MB
     */
    fun arrangeCoins(n: Int): Int {
        var sum = 0
        var mn = n
        for (i in 1..Int.MAX_VALUE) {
            mn -= i
            if (mn >= 0) {
                sum += 1
            } else {
                return sum
            }
        }
        return 0
    }


}