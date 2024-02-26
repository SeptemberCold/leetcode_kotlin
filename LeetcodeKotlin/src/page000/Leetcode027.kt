package page000

/**
 *
 * ��Ŀ: �Ƴ�Ԫ��
 *
 * ����: ����һ������ nums��һ��ֵ val������Ҫ ԭ�� �Ƴ�������ֵ����val��Ԫ�أ��������Ƴ���������³��ȡ�
 *      ��Ҫʹ�ö��������ռ䣬������ʹ�� O(1) ����ռ䲢 ԭ�� �޸��������顣
 *      Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * ����: 0 <= nums.length <= 100
 *      0 <= nums[i] <= 50
 *      0 <= val <= 100
 *
 * ����: https://leetcode.cn/problems/remove-element/
 *
 */
class Leetcode027 {

    /**
     * ˫ָ��
     * ִ����ʱ��172 ms
     * �ڴ����ģ�33.9 MB
     */
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) return 0
        var sum = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[sum] = nums[i]
                sum++
            }
        }
        return sum
    }

    /**
     * ˫ָ��
     * ��ʱ��170ms
     * �ڴ棺34.43MB
     */
    fun removeElement2(nums: IntArray, `val`: Int): Int {
        //˫ָ��
        var index = 0
        var index2 = 0

        while (index < nums.size) {
            //���Ԫ��Ԫ�ص���val ����
            if (nums[index] == `val`) {
                while (index2 < nums.size) {
                    if (nums[index2] != `val`) {
                        nums[index] = nums[index2]
                        nums[index2] = `val`
                        break
                    }
                    index2 += 1
                }
            }
            //���Ԫ����Ȼ��� ��ζ��û�н����ɹ�
            if (nums[index] == `val`){
                return index
            }
            //ָ����ǰ
            index += 1
            index2 += 1
        }

        return nums.size
    }

}