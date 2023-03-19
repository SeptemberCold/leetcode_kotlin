package page007

import kotlin.math.min

/**
 *
 * ��Ŀ: ʹ����С������¥��
 *
 * ����: ����һ���������� cost ������ cost[ i ] �Ǵ�¥�ݵ� i ��̨����������Ҫ֧���ķ��á�һ����֧���˷��ã�����ѡ��������һ����������̨�ס�
 *      �����ѡ����±�Ϊ 0 ���±�Ϊ 1 ��̨�׿�ʼ��¥�ݡ�
 *      ������㲢���شﵽ¥�ݶ�������ͻ��ѡ�
 *
 * ����: 2 <= cost.length <= 1000
 *      0 <= cost[i] <= 999
 *
 * ����:https://leetcode.cn/problems/min-cost-climbing-stairs/
 *
 */
object Leetcode746 {

    /**
     * ��̬�滮
     * ִ����ʱ: 188 ms
     * �ڴ�����: 35.8 MB
     */
    fun minCostClimbingStairs(cost: IntArray): Int {
        val size = cost.size
        for (index in 2 until cost.size) {
            cost[index] = min(cost[index - 1], cost[index - 2]) + cost[index]
        }
        return min(cost[size - 1], cost[size - 2])
    }

}