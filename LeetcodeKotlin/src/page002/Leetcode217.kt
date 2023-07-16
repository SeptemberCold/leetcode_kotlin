package page002

/**
 *
 * ��Ŀ: �����ظ�Ԫ��
 *
 * ����: ����һ���������� nums �������һֵ�������г��� �������� ������ true �����������ÿ��Ԫ�ػ�����ͬ������ false ��
 * ����: 1 <= nums.length <= 105
 *      -109 <= nums[i] <= 109
 *
 * ����: https://leetcode.cn/problems/contains-duplicate/
 *
 */
class Leetcode217 {

    /**
     * ��ϣ��洢
     * ִ����ʱ��444 ms
     * �ڴ����ģ�49.9 MB
     */
    fun containsDuplicate(nums: IntArray): Boolean {
        val temp = HashMap<Int, Boolean>()
        for (num in nums) {
            if ((temp[num] == true)) {
                return true
            } else {
                temp[num] = true
            }
        }
        return false
    }

}