package page001

/**
 *
 * ��Ŀ: ֻ����һ�ε����� II
 *
 * ����: ����һ����������nums ����ĳ��Ԫ�ؽ����� һ�� �⣬����ÿ��Ԫ�ض�ǡ���� ���� �������ҳ��������Ǹ�ֻ������һ�ε�Ԫ�ء�
 *      �������Ʋ�ʵ������ʱ�临�Ӷȵ��㷨�Ҳ�ʹ�ö���ռ�����������⡣
 * ����: 1 <= nums.length <= 3 * 104
 *      -231 <= nums[i] <= 231 - 1
 *      nums �У���ĳ��Ԫ�ؽ����� һ�� �⣬����ÿ��Ԫ�ض�ǡ���� ����
 *
 * ����: https://leetcode.cn/problems/single-number-ii/
 *
 */
class Leetcode137 {

    /**
     * ��·����ģ��
     * ִ����ʱ��192 ms
     * �ڴ����ģ�35.3 MB
     */
    fun singleNumber(nums: IntArray): Int {
        var a = 0
        var b = 0
        for (num in nums) {
            val aNext = a.inv() and b and num or (a and b.inv() and num.inv())
            val bNext = a.inv() and (b xor num)
            a = aNext
            b = bNext
        }
        return b
    }

}