package page000

/**
 *
 * ��Ŀ: �ϲ�������������
 *
 * ����: ���������� �ǵݼ�˳�� ���е��������� nums1 �� nums2�������������� m �� n ���ֱ��ʾ nums1 �� nums2 �е�Ԫ����Ŀ��
 *      ���� �ϲ� nums2 �� nums1 �У�ʹ�ϲ��������ͬ���� �ǵݼ�˳�� ���С�
 *      ע�⣺���գ��ϲ������鲻Ӧ�ɺ������أ����Ǵ洢������ nums1 �С�
 *      Ϊ��Ӧ�����������nums1 �ĳ�ʼ����Ϊ m + n������ǰ m ��Ԫ�ر�ʾӦ�ϲ���Ԫ�أ��� n ��Ԫ��Ϊ 0 ��Ӧ���ԡ�nums2 �ĳ���Ϊ n ��
 * ����: nums1.length == m + n
 *      nums2.length == n
 *      0 <= m, n <= 200
 *      1 <= m + n <= 200
 *      -109 <= nums1[i], nums2[j] <= 109
 *
 * ����: https://leetcode.cn/problems/merge-sorted-array/description/
 *
 */
class Leetcode088 {

    /**
     * ����
     * ʱ�� 164ms
     * �ڴ� 33.16mb
     */
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        for (i in 0 until n) {
            nums1[m + i] = nums2[i]
        }
        //����
        for (i in nums1.indices) {
            for (j in i until nums1.size) {
                if (nums1[i] > nums1[j]) {
                    val temp = nums1[j]
                    nums1[j] = nums1[i]
                    nums1[i] = temp
                }
            }
        }
    }

}