package page004

/**
 *
 * ��Ŀ: ������� 1 �ĸ���
 *
 * ����: ����һ������������ nums �� ��������������� 1 �ĸ�����
 *
 * ����: 1 <= nums.length <= 105
 *      nums[i] ���� 0 ���� 1.
 *
 * ����: https://leetcode.cn/problems/max-consecutive-ones/description/
 *
 */
class Leetcode485 {

    /**
     * ˫ָ��
     * ��ʱ��347ms
     * �ڴ棺37.79MB
     */
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0

        var i = 0
        while (i < nums.size) {
            //�ҵ�1
            if (nums[i] == 1) {
                var j = i + 1
                //�ҵ�0
                while (j < nums.size) {
                    if (nums[j] == 0) {
                        if (max < j - i) {
                            max = j - i
                        }
                        i = j
                        break
                    }
                    j += 1
                }
                //���j�������˾ͱ�ʾû���ҵ�0
                if (j == nums.size) {
                    if (max < j - i) {
                        max = j - i
                    }
                }
            }
            i += 1
        }
        return max
    }

}