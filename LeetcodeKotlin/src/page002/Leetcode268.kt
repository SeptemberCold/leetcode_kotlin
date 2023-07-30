package page002

/**
 *
 * ��Ŀ: ��ʧ������
 *
 * ����: ����һ������ [0, n] �� n ���������� nums ���ҳ� [0, n] �����Χ��û�г����������е��Ǹ�����
 * ����: n == nums.length
 *      1 <= n <= 104
 *      0 <= nums[i] <= n
 *      nums �е��������ֶ� ��һ�޶�
 *
 * ����: https://leetcode.cn/problems/missing-number/
 *
 */
class Leetcode268 {

    /**
     * ����
     * ִ����ʱ��1160 ms
     * �ڴ����ģ�39.6 MB
     */
    fun missingNumber(nums: IntArray): Int {
        for (i in nums.indices) {
            for (j in 0 until nums.size - i - 1) {
                if (nums[j] > nums[j + 1]) {
                    val temp = nums[j + 1]
                    nums[j + 1] = nums[j]
                    nums[j] = temp
                }
            }

        }
        for (i in nums.indices) {
            if (i != nums[i]) return i
        }
        return nums.size
    }

}