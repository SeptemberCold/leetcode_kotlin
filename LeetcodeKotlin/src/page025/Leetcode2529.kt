package page025

import kotlin.math.max

/**
 *
 * ��Ŀ: �������͸�������������
 *
 * ����: ����һ���� �ǵݼ�˳�� ���е����� nums ��������������Ŀ�͸�������Ŀ�е����ֵ��
 *      ���仰������� nums ������������Ŀ�� pos ��������������Ŀ�� neg ������ pos �� neg�����е����ֵ��
 *      ע�⣺0 �Ȳ���������Ҳ���Ǹ�������
 *
 * ����: 1 <= nums.length <= 2000
 *      -2000 <= nums[i] <= 2000
 *      nums �� �ǵݼ�˳�� ���С�
 *
 * ����: https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer/description/?envType=daily-question&envId=2024-04-09
 *
 */
class Leetcode2529 {

    /**
     * �������
     * ʱ�䣺204ms
     * �ڴ棺37.52MB
     */
    fun maximumCount(nums: IntArray): Int {
        var pos = 0
        var neg = 0
        for (num in nums) {
            if (num > 0) {
                pos += 1
                continue
            }
            if (num < 0) {
                neg += 1
                continue
            }
        }
        return max(pos, neg)
    }

}