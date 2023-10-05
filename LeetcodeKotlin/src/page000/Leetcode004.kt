package page000

/**
 *
 * ��Ŀ: Ѱ�����������������λ��
 *
 * ����: ����������С�ֱ�Ϊ m �� n �����򣨴�С��������nums1 ��nums2�������ҳ���������������������� ��λ�� ��
 *      �㷨��ʱ�临�Ӷ�Ӧ��Ϊ O(log (m+n)) ��
 * ����: nums1.length == m
 *      nums2.length == n
 *      0 <= m <= 1000
 *      0 <= n <= 1000
 *      1 <= m + n <= 2000
 *      -106 <= nums1[i], nums2[i] <= 106
 *
 * ����: https://leetcode.cn/problems/median-of-two-sorted-arrays/
 *
 */
class Leetcode004 {

    /**
     * ˫ָ��
     * ʱ�� 264ms
     * �ڴ� 46.07MB
     */
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        val m = nums1.size
        val n = nums2.size
        val length = m + n

        //ָ��λ��
        var m1 = 0
        var n1 = 0
        //ָ��ǰ��
        val count = if (length % 2 == 0) (length - 2) / 2 else (length - 1) / 2
        for (i in 1..count) {
            val temp1 = if (m1 >= m) Int.MAX_VALUE else nums1[m1]
            val temp2 = if (n1 >= n) Int.MAX_VALUE else nums2[n1]
            if (temp1 > temp2) {
                n1 += 1
            } else {
                m1 += 1
            }
        }

        if (length % 2 == 0) {
            //ǰ���궼û�е���λ������ʾ��λ��������һ��������
            if (m1 >= m || m == 0) return (nums2[n1] + nums2[n1 + 1]) / 2.0
            if (n1 >= n || n == 0) return (nums1[m1] + nums1[m1 + 1]) / 2.0
            //������߶�û��ǰ���� ��4������������С��������
            return if (nums1[m1] > nums2[n1]) {
                val temp = if (n1 + 1 >= n) Int.MAX_VALUE else nums2[n1 + 1]
                val min = temp.coerceAtMost(nums1[m1])
                (nums2[n1] + min) / 2.0
            } else {
                val temp = if (m1 + 1 >= m) Int.MAX_VALUE else nums1[m1 + 1]
                val min = temp.coerceAtMost(nums2[n1])
                (nums1[m1] + min) / 2.0
            }
        } else {

            //ǰ���궼û�е���λ������ʾ��λ��������һ��������
            if (m1 >= m || m == 0) return nums2[n1].toDouble()
            if (n1 >= n || n == 0) return nums1[m1].toDouble()
            return nums1[m1].coerceAtMost(nums2[n1]).toDouble()
        }
    }

}