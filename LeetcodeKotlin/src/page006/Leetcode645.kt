package page006

/**
 *
 * ��Ŀ: ����ļ���
 *
 * ����: ���� s ������ 1 �� n �����������ҵ��ǣ���Ϊ���ݴ��󣬵��¼�������ĳһ�����ָ����˳��˼������������һ�����ֵ�ֵ��
 *      ���¼��� ��ʧ��һ������ ���� ��һ�������ظ� ��
 *      ����һ������ nums �����˼��� S ���������Ľ����
 *      �����ҳ��ظ����ֵ����������ҵ���ʧ�����������������������ʽ���ء�
 *
 * ����: 2 <= nums.length <= 104
 *      1 <= nums[i] <= 104
 *
 * ����: https://leetcode.cn/problems/set-mismatch/description/
 *
 */
class Leetcode645 {

    /**
     * ģ��
     * ʱ�䣺239ms
     * �ڴ棺38.96MB
     */
    fun findErrorNums(nums: IntArray): IntArray {
        val temp = IntArray(nums.size)
        for (num in nums) {
            temp[num - 1] = temp[num - 1] + 1
        }
        var i = 0
        var j = 0
        for (index in temp.indices) {
            if (temp[index] == 2) i = index + 1
            if (temp[index] == 0) j = index + 1
        }
        return intArrayOf(i, j)
    }

}