package page007

/**
 *
 * ��Ŀ: Ѱ������������±�
 *
 * ����: ����һ���������� nums ������������ �����±� ��
 *      ���� �����±� �������һ���±꣬���������Ԫ����ӵĺ͵����Ҳ�����Ԫ����ӵĺ͡�\
 *      ��������±�λ����������ˣ���ô�����֮����Ϊ 0 ����Ϊ���±����಻����Ԫ�ء���һ����������±�λ���������Ҷ�ͬ�����á�
 *      ��������ж�������±꣬Ӧ�÷��� ������ ����һ����������鲻���������±꣬���� -1 ��
 *
 * ����: 1 <= nums.length <= 104
 *      -1000 <= nums[i] <= 1000
 *
 * ����: https://leetcode.cn/problems/find-pivot-index/description/?envType=daily-question&envId=2024-07-08
 *
 */
class Leetcode724 {

    /**
     * ǰ׺��
     * ʱ��:219ms
     * �ڴ�:45.21MB
     */
    fun pivotIndex(nums: IntArray): Int {
        var sum = 0
        for (num in nums) {
            sum += num
        }

        var sum2 = 0
        for (i in nums.indices) {
            val value = sum2 * 2 + nums[i]
            if (value == sum) return i
            sum2 += nums[i]
        }
        return -1
    }

}