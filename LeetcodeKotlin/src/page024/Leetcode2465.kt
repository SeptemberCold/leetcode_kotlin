package page024

/**
 *
 * ��Ŀ: ��ͬ��ƽ��ֵ��Ŀ
 *
 * ����: ����һ���±�� 0��ʼ����Ϊ ż������������nums��
 *      ֻҪnums ���ǿ����飬����ظ�ִ�����²��裺
 *          �ҵ�nums�е���Сֵ����ɾ������
 *          �ҵ�nums�е����ֵ����ɾ������
 *          ����ɾ��������ƽ��ֵ��
 *      ���� a�� b�� ƽ��ֵΪ(a + b) / 2��
 *      �ȷ�˵��2��3��ƽ��ֵ��(2 + 3) / 2 = 2.5��
 *      �������������ܵõ��� ��ͬƽ��ֵ����Ŀ��
 *      ע�⣬�����Сֵ�������ֵ���ظ�Ԫ�أ�����ɾ������һ����
 *
 * ����: 2 <= nums.length <= 100
 *      nums.length ��ż����
 *      0 <= nums[i] <= 100
 *
 * ����: https://leetcode.cn/problems/number-of-distinct-averages/
 *
 */
class Leetcode2465 {

    /**
     * ����+��ϣ
     * ִ����ʱ��148  ms
     * �ڴ����ģ�32.7 MB
     */
    fun distinctAverages(nums: IntArray): Int {
        //ð������
        for (i in nums.indices) {
            for (j in 0 until nums.size - i - 1) {
                if (nums[j] > nums[j + 1]) {
                    val temp = nums[j]
                    nums[j] = nums[j + 1]
                    nums[j + 1] = temp
                }
            }
        }
        //��ϣ�洢
        val hashSet = HashSet<Int>()
        //����� ������ƽ��ֵ ����һ��
        val count = nums.size / 2
        for (i in 0..count) {
            val add = nums[i] + nums[nums.size - 1 - i]
            hashSet.add(add)
        }
        return hashSet.size
    }


}