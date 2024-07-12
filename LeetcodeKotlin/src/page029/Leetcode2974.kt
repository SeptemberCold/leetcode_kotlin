package page029

/**
 *
 * ��Ŀ: ��С������Ϸ
 *
 * ����: ����һ���±�� 0 ��ʼ������Ϊ ż�� ���������� nums ��
 *      ͬʱ����һ�������� arr ��Alice �� Bob ������һ����Ϸ��
 *      ��Ϸ��ÿһ�� Alice �� Bob �������ִ��һ�β�������Ϸ�������£�
 *      ÿһ�֣�Alice �ȴ� nums ���Ƴ�һ�� ��С Ԫ�أ�Ȼ�� Bob ִ��ͬ���Ĳ�����
 *      ���ţ�Bob �Ὣ�Ƴ���Ԫ����ӵ����� arr �У�Ȼ�� Alice Ҳִ��ͬ���Ĳ�����
 *      ��Ϸ�������У�ֱ�� nums ��Ϊ�ա�
 *      ���ؽ������ arr ��
 *
 * ����: 1 <= nums.length <= 100
 *      1 <= nums[i] <= 100
 *      nums.length % 2 == 0
 *
 * ����: https://leetcode.cn/problems/minimum-number-game/description/?envType=daily-question&envId=2024-07-12
 *
 */
class Leetcode2974 {

    /**
     * ð������
     * ʱ�䣺239ms
     * �ڴ棺40.31MB
     */
    fun numberGame(nums: IntArray): IntArray {
        for (i in nums.indices) {
            for (j in 0 until nums.size - i - 1) {
                val m = nums[j]
                val n = nums[j + 1]
                if (n < m) {
                    nums[j] = n
                    nums[j + 1] = m
                }
            }
        }

        for (i in nums.indices step 2) {
            val m = nums[i]
            nums[i] = nums[i + 1]
            nums[i + 1] = m
        }
        return nums
    }

}