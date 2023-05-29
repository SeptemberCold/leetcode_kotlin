package page024

/**
 *
 * ��Ŀ: �ɱ���������ż����ƽ��ֵ
 *
 * ����: ����һ������������ɵ��������� nums ���������пɱ� 3 ����������ż����ƽ��ֵ��
 *      ע�⣺n ��Ԫ�ص�ƽ��ֵ���� n ��Ԫ�� ��� �ٳ��� n ����� ����ȡ�� ����ӽ���������
 * ����: 1 <= nums.length <= 1000
 *      1 <= nums[i] <= 1000
 *
 * ����: https://leetcode.cn/problems/average-value-of-even-numbers-that-are-divisible-by-three/
 *
 */
class Leetcode2455 {

    /**
     * �����ƽ�
     * ִ����ʱ��196 ms
     * �ڴ����ģ�38.6 MB
     */
    fun averageValue(nums: IntArray): Int {
        var add = 0.0
        var num = 0.0
        for (i in nums) {
            if (i % 2 == 0 && i % 3 == 0) {
                add += i
                num += 1
            }
        }
        return (add / num).toInt()
    }

}