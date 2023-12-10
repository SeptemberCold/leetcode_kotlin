package page002

/**
 *
 * ��Ŀ: �����ظ�Ԫ�� II
 *
 * ����: ����һ���������� nums ��һ������ k ���ж��������Ƿ�������� ��ͬ������ i �� j ��
 *      ���� nums[i] == nums[j] �� abs(i - j) <= k ��������ڣ����� true �����򣬷��� false ��
 * ����: 1 <= nums.length <= 105
 *      -109 <= nums[i] <= 109
 *      0 <= k <= 105
 *
 * ����: https://leetcode.cn/problems/contains-duplicate-ii/description/
 *
 */
class Leetcode219 {

    /**
     * ��ϣ��
     * 484 ms
     * 51.53 MB
     */
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val hashMap = HashMap<Int, Int>()

        for (i in nums.indices) {
            val value = nums[i]
            val j = hashMap[value]
            if (j != null && j - i <= k) {
                return true
            }
            hashMap[value] = i
        }
        return false
    }

}