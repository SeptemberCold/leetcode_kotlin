package page024

import kotlin.math.min

/**
 *
 * ��Ŀ: �����ӵ���Ŀ
 *
 * ����: �������������� a �� b ������ a �� b �� �� ���ӵ���Ŀ��
 *      ��� x ����ͬʱ���� a �� b ������Ϊ x �� a �� b ��һ�� ������ ��
 * ����: 1 <= a, b <= 1000
 *
 * ����: https://leetcode.cn/problems/number-of-common-factors/
 *
 */
object Leetcode2427 {

    fun commonFactors(a: Int, b: Int): Int {
        var result = 0
        for (i in min(a,b) downTo 1) {
            if (a % i == 0 && b % i == 0) {
                result++
            }
        }
        return result
    }

}