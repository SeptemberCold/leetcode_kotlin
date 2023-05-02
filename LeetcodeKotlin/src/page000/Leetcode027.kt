package page000

/**
 *
 * ��Ŀ: �Ƴ�Ԫ��
 *
 * ����: ����һ������ nums��һ��ֵ val������Ҫ ԭ�� �Ƴ�������ֵ����val��Ԫ�أ��������Ƴ���������³��ȡ�
 *      ��Ҫʹ�ö��������ռ䣬������ʹ�� O(1) ����ռ䲢 ԭ�� �޸��������顣
 *      Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * ����: 0 <= nums.length <= 100
 *      0 <= nums[i] <= 50
 *      0 <= val <= 100
 *
 * ����: https://leetcode.cn/problems/remove-element/
 *
 */
class Leetcode027 {

    /**
     * ˫ָ��
     * ִ����ʱ��172 ms
     * �ڴ����ģ�33.9 MB
     */
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) return 0
        var sum = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[sum] = nums[i]
                sum++
            }
        }
        return sum
    }

}