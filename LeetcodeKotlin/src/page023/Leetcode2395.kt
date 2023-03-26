package page023

/**
 *
 * ��Ŀ: ����ȵ�������
 *
 * ����: ����һ���±�� 0��ʼ����������nums���ж��Ƿ������������Ϊ2�������������ǵĺ���ȡ�ע�⣬��������������ʼλ�õ��±���벻��ͬ��
 *      �����������������ڣ��뷵��true�����򷵻�false��
 *      ������ ��һ��������һ�������ǿյ�Ԫ����ɵ����С�
 * ����: 2 <= nums.length <= 1000
 *      -109 <= nums[i] <= 109
 *
 * ����:https://leetcode.cn/problems/find-subarrays-with-equal-sum/
 *
 */
object Leetcode2395 {

    /**
     * ��ϣ��
     * ִ����ʱ��156 ms
     * �ڴ����ģ�34.9 MB
     */
    fun findSubarrays(nums: IntArray): Boolean {
        if (nums.size <= 2) return false
        val hash = HashSet<Int>()
        for (i in 1 until nums.size) {
            val value = nums[i] + nums[i - 1]
            val contains = hash.contains(value)
            if (contains) {
                return true
            } else {
                hash.add(value)
            }
        }
        return false
    }

}