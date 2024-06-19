package page004

/**
 *
 * ��Ŀ: �ҵ�������������ʧ������
 *
 * ����: ����һ���� n ������������ nums ��
 *      ���� nums[i] ������ [1, n] �ڡ�
 *      �����ҳ������� [1, n] ��Χ�ڵ�û�г����� nums �е����֣������������ʽ���ؽ����
 *
 * ����: n == nums.length
 *      1 <= n <= 105
 *      1 <= nums[i] <= n
 *
 * ����: https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/description/
 *
 */
class Leetcode448 {

    /**
     * ����ȥ��������
     * ʱ�� 500ms
     * �ڴ� 53.12MB
     */
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val hashSet = HashSet<Int>()
        for (i in 1..nums.size) {
            hashSet.add(i)
        }
        val set = hashSet - HashSet(nums.toList())
        return set.toList()
    }

}