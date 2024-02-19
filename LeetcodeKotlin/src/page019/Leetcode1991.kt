package page019

/**
 *
 * ��Ŀ: �ҵ�������м�λ��
 *
 * ����: ����һ���±�� 0 ��ʼ���������� nums �������ҵ� ����� ���м�λ�� middleIndex ��Ҳ�������п����м�λ���±���С��һ������
 *      �м�λ�� middleIndex ������ nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1] �������±ꡣ
 *      ��� middleIndex == 0 ����߲��ֵĺͶ���Ϊ 0 �����Ƶģ���� middleIndex == nums.length - 1 ���ұ߲��ֵĺͶ���Ϊ 0 ��
 *      ���㷵�������������� ����� �� middleIndex ������������������м�λ�ã����㷵�� -1 ��
 *
 * ����: 1 <= nums.length <= 100
 *      -1000 <= nums[i] <= 1000
 *
 * ����: https://leetcode.cn/problems/find-the-middle-index-in-array/description/
 *
 */
class Leetcode1991 {

    /**
     * ǰ׺��
     * ��ʱ��165ms
     * �ڴ棺34.26MB
     */
    fun findMiddleIndex(nums: IntArray): Int {
        //�����ܺ�
        var sum = 0
        for (num in nums) {
            sum += num
        }
        //ǰ׺��
        var left = 0
        //����
        for (index in nums.indices) {
            //���������Ҳ��Ƿ����
            if ((left * 2 + nums[index]) == sum) return index
            //����ȸ���ǰ׺��
            left += nums[index]
        }
        return -1
    }

}