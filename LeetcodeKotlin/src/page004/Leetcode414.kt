package page004

/**
 *
 * ��Ŀ: ���������
 *
 * ����: ����һ���ǿ����飬���ش������� ��������� ����������ڣ��򷵻���������������
 *
 * ����: 1 <= nums.length <= 104
 *      -231 <= nums[i] <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/third-maximum-number/description/
 *
 */
class Leetcode414 {

    /**
     * ģ��
     * ʱ�� 180ms
     * �ڴ� 37.21MB
     */
    fun thirdMax(nums: IntArray): Int {
        var x: Int? = null
        var y: Int? = null
        var z: Int? = null

        val hashSet = nums.toHashSet()

        for (num in hashSet) {
            if (num == x) continue
            if (x == null || num > x) {
                z = y
                y = x
                x = num
                continue
            }
            if (num == y) continue
            if (y == null || num > y) {
                z = y
                y = num
                continue
            }
            if (z == null || num > z) {
                z = num
            }
        }

        return z ?: x ?: 0
    }

}