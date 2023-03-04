package page000

/**
 *
 * ��Ŀ:����֮��
 *
 * ����: ����һ���������� nums��һ������Ŀ��ֵ target�������ڸ��������ҳ� ��ΪĿ��ֵ target �����������������������ǵ������±ꡣ��
 *      ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡���
 *      ����԰�����˳�򷵻ش𰸡�
 * ����:  2 <= nums.length <= 104
 *      -109 <= nums[i] <= 109
 *      -109 <= target <= 109
 *      ֻ�����һ����Ч��
 *
 * ����:https://leetcode.cn/problems/two-sum/
 *
 */
object LeetcodeTest001 {


    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        example.forEach {
            val twoSum = Leetcode001.twoSum(it.nums, it.target)
            println("����:nums=${it.nums.toList()},target=${it.target}")
            println("���:${twoSum.toList()}")
        }
    }

    private fun getExample(): List<Data> {
        val examples = ArrayList<Data>()
        examples.add(Data(intArrayOf(2, 7, 11, 15), 9))
        examples.add(Data(intArrayOf(3, 2, 4), 6))
        examples.add(Data(intArrayOf(3, 3), 6))
        return examples
    }


    class Data(
        val nums: IntArray, val target: Int
    )


}