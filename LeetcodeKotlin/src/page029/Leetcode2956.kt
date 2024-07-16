package page029

/**
 *
 * ��Ŀ: �ҵ����������еĹ���Ԫ��
 *
 * ����: ���������±�� 0 ��ʼ���������� nums1 �� nums2 �����Ƿֱ��� n �� m ��Ԫ�ء�
 *      �����������������ֵ��
 *          ͳ�� 0 <= i < n �е��±� i ������ nums1[i] �� nums2 �� ���� ������һ�Ρ�
 *          ͳ�� 0 <= i < m �е��±� i ������ nums2[i] �� nums1 �� ���� ������һ�Ρ�
 *      ���㷵��һ������Ϊ 2 ���������� answer ����˳�� �ֱ�Ϊ����������ֵ��
 *
 * ����: n == nums1.length
 *      m == nums2.length
 *      1 <= n, m <= 100
 *      1 <= nums1[i], nums2[i] <= 100
 *
 * ����: https://leetcode.cn/problems/find-common-elements-between-two-arrays/description/?envType=daily-question&envId=2024-07-16
 *
 */
class Leetcode2956 {

    /**
     * ��ϣ
     * ʱ�䣺285ms
     * �ڴ棺47.16MB
     */
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap1 = HashMap<Int, Int>()
        val hashMap2 = HashMap<Int, Int>()
        for (i in nums1) {
            hashMap1[i] = 1
        }
        var sum2 = 0
        for (i in nums2) {
            hashMap2[i] = 1
            if (hashMap1[i] != null) sum2 += 1
        }
        var sum1 = 0
        for (i in nums1) {
            if (hashMap2[i] != null) sum1 += 1
        }
        return intArrayOf(sum1, sum2)
    }

}