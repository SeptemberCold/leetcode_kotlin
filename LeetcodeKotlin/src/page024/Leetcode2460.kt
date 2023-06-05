package page024

/**
 *
 * ��Ŀ: ������ִ�в���
 *
 * ����: ����һ���±�� 0 ��ʼ������ nums �������СΪ n ������ �Ǹ� ������ɡ�
 *      ����Ҫ������ִ�� n - 1 �����������е� i ���������� 0 ��ʼ������Ҫ��� nums �е� i ��Ԫ��ִ������ָ�
 *      ��� nums[i] == nums[i + 1] ���� nums[i] ��ֵ���ԭ���� 2 ����nums[i + 1] ��ֵ��� 0 �����������ⲽ������
 *      ��ִ���� ȫ�� �����󣬽����� 0 �ƶ� ������� ĩβ ��
 *      ���磬���� [1,0,2,0,0,1] ������ 0 �ƶ���ĩβ���Ϊ [1,2,1,0,0,0] ��
 *      ���ؽ�����顣
 *      ע�� ����Ӧ�� �������� ִ�У�������һ����ȫ��ִ�С�
 *
 * ����: 2 <= nums.length <= 2000
 *      0 <= nums[i] <= 1000
 *
 * ����: https://leetcode.cn/problems/apply-operations-to-an-array/
 *
 */
class Leetcode2460 {

    /**
     * ģ��+ѡ������
     * ִ����ʱ��188 ms
     * �ڴ����ģ�35.6 MB
     */
    fun applyOperations(nums: IntArray): IntArray {
        //��Ҫ�����
        for (i in 0 until nums.size - 1) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2
                nums[i + 1] = 0
            }
        }

        //ѡ������
        for (i in nums.indices) {
            //��0����һ��ѭ��
            if (nums[i] != 0) continue
            //�ҳ���һ����0�Ĳ���
            for (j in i until nums.size) {
                if (nums[j] != 0) {
                    nums[i] = nums[j]
                    nums[j] = 0
                    break
                }
            }
        }
        return nums
    }

}