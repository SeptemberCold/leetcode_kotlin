package page000

/**
 *
 * ��Ŀ: ��������λ��
 *
 * ����: ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ����������������
 *      ���Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 *      �����ʹ��ʱ�临�Ӷ�Ϊ O(log n) ���㷨��
 * ����: 1 <= nums.length <= 104
 *      -104 <= nums[i] <= 104
 *      nums Ϊ���ظ�Ԫ�ص�������������
 *      -104 <= target <= 104
 *
 * ����: https://leetcode.cn/problems/search-insert-position/
 *
 */
class Leetcode035 {

    /**
     * ���ֲ���
     * ִ����ʱ��188 ms
     * �ڴ����ģ�37.3 MB
     */
    fun searchInsert(nums: IntArray, target: Int): Int {
        var min = 0
        var max = nums.size - 1
        while (min <= max) {
            val mid = (max + min) / 2
            if (nums[mid] < target) {
                min = mid + 1
            } else {
                max = mid - 1
            }
        }
        return min
    }

}