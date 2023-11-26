package page000

/**
 *
 * ��Ŀ: ��ɫ����
 *
 * ����: ����һ��������ɫ����ɫ����ɫ���� n ��Ԫ�ص����� nums ��ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�
 *      ����ʹ������ 0�� 1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ��
 *      �����ڲ�ʹ�ÿ����õ� sort ����������½��������⡣
 * ����: n == nums.length
 *      1 <= n <= 300
 *      nums[i] Ϊ 0��1 �� 2
 *
 * ����: https://leetcode.cn/problems/sort-colors/description/
 *
 */
class Leetcode075 {

    /**
     * ͳ��˫ѭ��
     *
     * 156 ms
     * 34.11 MB
     */
    fun sortColors(nums: IntArray) {

        var n0 = 0
        var n1 = 0

        for (i in nums) {
            when (i) {
                0 -> n0 += 1
                1 -> n1 += 1
            }
        }

        for (i in nums.indices) {
            if (i < n0) {
                nums[i] = 0
                continue
            }
            if (i < n0 + n1) {
                nums[i] = 1
                continue
            }
            nums[i] = 2
        }

    }

}