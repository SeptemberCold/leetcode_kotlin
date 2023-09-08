package page026

/**
 *
 * ��Ŀ: �����г���վʱ��
 *
 * ����: ����һ�������� arrivalTime ��ʾ�г����㵽վ��ʱ�䣨��λ��Сʱ���������һ�������� delayedTime ��ʾ�г������Сʱ����
 *      �����г�ʵ�ʵ�վ��ʱ�䡣
 *      ע�⣬�������е�ʱ����� 24 Сʱ�ơ�
 * ����: 1 <= arrivaltime < 24
 *      1 <= delayedTime <= 24
 *
 * ����: https://leetcode.cn/problems/calculate-delayed-arrival-time/description/?envType=daily-question&envId=2023-09-07
 *
 */
class Leetcode2651 {

    /**
     * ��֪����ô���������
     * ʱ�� 132ms
     * �ڴ� 32.02MB
     */
    fun findDelayedArrivalTime(arrivalTime: Int, delayedTime: Int): Int {
        return (arrivalTime + delayedTime) % 24
    }

}