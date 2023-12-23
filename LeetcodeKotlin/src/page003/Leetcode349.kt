package page003

/**
 *
 * ��Ŀ: ��������Ľ���
 *
 * ����: ������������ nums1 �� nums2 ������ ���ǵĽ��� ���������е�ÿ��Ԫ��һ���� Ψһ �ġ����ǿ��� ��������������˳�� ��
 * ����: 1 <= nums1.length, nums2.length <= 1000
 *      0 <= nums1[i], nums2[i] <= 1000
 *
 * ����: https://leetcode.cn/problems/intersection-of-two-arrays/description/
 *
 */
class Leetcode349 {

    /**
     * ��ϣ�㷨
     * 192 ms
     * 38.02 MB
     */
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap = HashMap<Int, Int>()
        val result = HashSet<Int>()

        for (num in nums1) {
            hashMap[num] = 1
        }
        for (num in nums2) {
            val i = hashMap[num] ?: 0
            if (i != 0) {
                result.add(num)
            }
        }
        return result.toIntArray()
    }

}