package page026

import kotlin.math.abs
import kotlin.math.max

/**
 *
 * ��Ŀ: ʹ����������·��ֵ��ȵ���С����
 *
 * ����: ����һ������ n ��ʾһ�� �������� ����ڵ����Ŀ���ڵ��Ŵ� 1 �� n �����ڵ���Ϊ 1 ��
 *      ����ÿ����Ҷ�ӽڵ� i �����������ӣ��ֱ������� 2 * i ���Һ��� 2 * i + 1 ��
 *      ����ÿ���ڵ㶼��һ��ֵ�����±�� 0 ��ʼ������Ϊ n ���������� cost ��ʾ������ cost[i] �ǵ� i + 1 ���ڵ��ֵ��
 *      ÿ�β���������Խ����� ���� �ڵ��ֵ ���� 1 �������ִ�в��� ���� �Ρ�
 *      ���Ŀ�����ø���ÿһ�� Ҷ�ӽ�� ��·��ֵ��ȡ����㷵�� ���� ��Ҫִ�����Ӳ������ٴΡ�
 *      ע�⣺
 *          �������� ָ����һ���������������г���Ҷ�ӽڵ���ÿ���ڵ㶼ǡ���� 2 ���ӽڵ㣬������Ҷ�ӽڵ������ڵ������ͬ��
 *          ·��ֵ ָ����·�������нڵ��ֵ֮�͡�
 *
 * ����: 3 <= n <= 105
 *      n + 1 �� 2 ����
 *      cost.length == n
 *      1 <= cost[i] <= 104
 *
 * ����: https://leetcode.cn/problems/make-costs-of-paths-equal-in-a-binary-tree/description/?envType=daily-question&envId=2024-02-28
 *
 */
class Leetcode2673 {

    /**
     * ͼ�ι���
     * ��ʱ��524ms
     * �ڴ棺50.78MB
     */
    fun minIncrements(n: Int, cost: IntArray): Int {
        var count = 0
        for (i in n downTo 3 step 2) {
            val left = cost[i - 2]
            val right = cost[i - 1]
            count += abs(left - right)
            cost[(i - 1) / 2 - 1] += max(left, right)
        }
        return count
    }

}