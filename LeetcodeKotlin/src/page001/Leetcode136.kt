package page001

/**
 *
 * ��Ŀ: ֻ����һ�ε�����
 *
 * ����: ����һ�� �ǿ� �������� nums ������ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ�
 *      �ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
 *      �������Ʋ�ʵ������ʱ�临�Ӷȵ��㷨����������⣬�Ҹ��㷨ֻʹ�ó�������ռ䡣
 * ����: 1 <= nums.length <= 3 * 104
 *      -3 * 104 <= nums[i] <= 3 * 104
 *      ����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ�
 *
 * ����: https://leetcode.cn/problems/single-number/
 *
 */
class Leetcode136 {

    /**
     * λ����
     * ִ����ʱ��216 ms
     * �ڴ����ģ�37.8 MB
     */
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }

}