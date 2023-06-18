package page001

/**
 *
 * ��Ŀ: ����Ԫ��
 *
 * ����: ����һ����СΪ n ������nums ���������еĶ���Ԫ�ء�����Ԫ����ָ�������г��ִ��� ���� n/2 ��Ԫ�ء�
 *      ����Լ��������Ƿǿյģ����Ҹ������������Ǵ��ڶ���Ԫ�ء�
 * ����: n == nums.length
 *      1 <= n <= 5 * 104
 *      -109 <= nums[i] <= 109
 *
 * ����: https://leetcode.cn/problems/majority-element/
 *
 */
class Leetcode169 {

    /**
     * ��ϣ��
     * ִ����ʱ��272 ms
     * �ڴ����ģ�39.3 MB
     */
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (num in nums) {
            //��ȡ����
            val sum = map[num] ?: 0
            if (sum + 1 > (nums.size / 2)) {
                return num
            } else {
                map[num] = sum + 1
            }
        }
        return 0
    }
}