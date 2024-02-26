package page005

/**
 *
 * ��Ŀ: ������
 *
 * ����: ��������Ϊ2n���������� nums ����������ǽ���Щ���ֳ�n ��,
 *      ���� (a1, b1), (a2, b2), ..., (an, bn) ��ʹ�ô� 1 ��n �� min(ai, bi) �ܺ����
 *      ���ظ� ����ܺ� ��
 *
 * ����: 1 <= n <= 104
 *      nums.length == 2 * n
 *      -104 <= nums[i] <= 104
 *
 * ����: https://leetcode.cn/problems/array-partition/
 *
 */
class Leetcode561 {

    /**
     * ��ѧ����
     * ��ʱ��283ms
     * �ڴ棺42.5MB
     */
    fun arrayPairSum(nums: IntArray): Int {
        var sum = 0
        nums.sort()

        for (index in nums.indices step 2) {
            sum += nums[index]
        }
        return sum
    }

}