package page000

/**
 *
 * ��Ŀ:����֮��
 *
 * ����: ����һ����������nums��һ������Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ target �����������������������ǵ������±ꡣ
 *      ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ� ������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡�
 *      ����԰�����˳�򷵻ش𰸡�
 * ����:  2 <= nums.length <= 104
 *      -109 <= nums[i] <= 109
 *      -109 <= target <= 109
 *      ֻ�����һ����Ч��
 *
 * ����:https://leetcode.cn/problems/two-sum/
 *
 */
object Leetcode001 {

    /**
     * ʹ�ù�ϣ��
     * target���Ϊ109
     * ���ܲ����ڴ�
     * ���ֻ����һ����
     *
     * ִ����ʱ��208 ms
     * �ڴ����ģ�36.9 MB
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        for (i in nums.indices) {
            val numA = nums[i]
            val numB = target - numA
            val index = hashMap[numB]
            if (index != null) {
                return intArrayOf(i, index)
            } else {
                hashMap[numA] = i
            }
        }
        //��������ڴ� ���ؿ�����
        return intArrayOf()
    }

}