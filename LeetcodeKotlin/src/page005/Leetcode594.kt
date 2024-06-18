package page005

/**
 *
 * ��Ŀ: ���г������
 *
 * ����: ��г������ָһ��������Ԫ�ص����ֵ����Сֵ֮��Ĳ�� ������ 1 ��
 *      ���ڣ�����һ���������� nums �����������п��ܵ����������ҵ���ĺ�г�����еĳ��ȡ�
 *      �������������һ���������������������У�������ͨ��ɾ��һЩԪ�ػ�ɾ��Ԫ�ء��Ҳ��ı�����Ԫ�ص�˳����õ���
 * ����: 1 <= nums.length <= 2 * 104
 *      -109 <= nums[i] <= 109
 *
 * ����: https://leetcode.cn/problems/longest-harmonious-subsequence/description/
 *
 */
class Leetcode594 {

    /**
     * ���� ��ϣ
     * ��ʱ��373ms
     * �ڴ棺43.08MB
     */
    fun findLHS(nums: IntArray): Int {
        //��¼����
        val hashMap = HashMap<Int, Int>()
        for (num in nums) {
            hashMap[num] = (hashMap[num] ?: 0) + 1
        }
        //����ȥ��
        val set = nums.toSortedSet().toIntArray()
        var max = 0
        for (i in 1 until set.size) {
            val gap = set[i] - set[i - 1]
            if (gap == 1) {
                max = max.coerceAtLeast((hashMap[set[i]] ?: 0) + (hashMap[set[i - 1]] ?: 0))
            }
        }
        return max
    }

}