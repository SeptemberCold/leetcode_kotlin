package page002

/**
 *
 * ��Ŀ: �ƶ���
 *
 * ����: ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
 *      ��ע�� �������ڲ���������������ԭ�ض�������в�����
 * ����: 1 <= nums.length <= 104
 *      -231 <= nums[i] <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/move-zeroes/description/
 *
 */
class Leetcode283 {

    /**
     * ��ϣ
     * ʱ�� 272ms
     * �ڴ� 37.96MB
     */
    fun moveZeroes(nums: IntArray?) {
        if(nums==null) return
        //��һ�α�����ʱ��jָ���¼��0�ĸ�����ֻҪ�Ƿ�0��ͳͳ������nums[j]
        var j = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[j++] = nums[i]
            }
        }
        for (i in j until nums.size) {
            nums[i] = 0
        }
    }

}