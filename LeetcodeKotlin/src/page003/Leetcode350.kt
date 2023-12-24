package page003

/**
 *
 * ��Ŀ: ��������Ľ��� II
 *
 * ����: ���������������� nums1 �� nums2 ��������������ʽ����������Ľ�����
 *      ���ؽ����ÿ��Ԫ�س��ֵĴ�����Ӧ��Ԫ�������������ж����ֵĴ���һ�£�������ִ�����һ�£�����ȡ��Сֵ����
 *      ���Բ�������������˳��
 * ����: 1 <= nums1.length, nums2.length <= 1000
 *      0 <= nums1[i], nums2[i] <= 1000
 *
 * ����: https://leetcode.cn/problems/intersection-of-two-arrays-ii/description/
 *
 */
class Leetcode350 {

    /**
     * ��ϣ�㷨
     * 208 ms
     * 36.62 MB
     */
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap = HashMap<Int, Int>()
        val list = ArrayList<Int>()

        for (num in nums1) {
            hashMap[num] = (hashMap[num] ?: 0) + 1
        }

        val hashMap2 = HashMap<Int, Int>()
        for (num in nums2) {
            hashMap2[num] = (hashMap2[num] ?: 0) + 1
            val count = hashMap[num] ?: 0
            if (count != 0 && hashMap2[num]!! <= count) {
                list.add(num)
            }
        }
        return list.toIntArray()
    }

}