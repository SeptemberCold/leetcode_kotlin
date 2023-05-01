package page000

/**
 *
 * ��Ŀ: ɾ�����������е��ظ���
 *
 * ����: ����һ�� �������� ������ nums ������ ԭ�� ɾ���ظ����ֵ�Ԫ�أ�ʹÿ��Ԫ�� ֻ����һ�� ������ɾ����������³��ȡ�
 *      Ԫ�ص� ���˳�� Ӧ�ñ��� һ�� ��Ȼ�󷵻� nums ��ΨһԪ�صĸ�����
 *      ���� nums ��ΨһԪ�ص�����Ϊ k ������Ҫ����������ȷ����������Ա�ͨ����
 *          �������� nums ��ʹ nums ��ǰ k ��Ԫ�ذ���ΨһԪ�أ���������������� nums �г��ֵ�˳�����С�nums������Ԫ���� nums �Ĵ�С����Ҫ��
 *          ���� k��
 * 
 * ����: 1 <= nums.length <= 3 * 104
 *      -104 <= nums[i] <= 104
 *       nums �Ѱ� ���� ����
 *
 * ����: https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 *
 */
class Leetcode026 {

    /**
     * ˫ָ��
     * ִ����ʱ��228 ms
     * �ڴ����ģ�40.1 MB
     */
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 1) return nums.size
        var sum = 0
        for (i in 1 until nums.size) {
            if (nums[i] != nums[sum]) {
                nums[sum + 1] = nums[i]
                sum += 1
            }
        }
        return sum + 1
    }

}