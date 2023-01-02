package main.kotlin.com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/01/01/19:
 *
 * ����һ���������� nums��һ������Ŀ��ֵ target�������ڸ��������ҳ� ��ΪĿ��ֵ target �����������������������ǵ������±ꡣ
 * ����Լ���ÿ������ֻ���Ӧһ���𰸡�
 * ���ǣ�������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡�����԰�����˳�򷵻ش𰸡�
 * ��Ŀ����
 * https://leetcode.cn/problems/two-sum/https://leetcode.cn/problems/two-sum/
 */
object Leetcode001 {

    /**
     * ִ����ʱ��336 ms
     * �ڴ����ģ�36.4 MB
     */
    private fun twoSum01(nums: IntArray, target: Int): IntArray? {
        for (first in nums.indices) {
            for (second in nums.indices) {
                if (first != second) {
                    if (nums[first] + nums[second] == target) {
                        return intArrayOf(first, second)
                    }
                }
            }
        }
        return null
    }

    /**
     * ִ����ʱ��244 ms
     * �ڴ����ģ�37.1 MB
     */
    private fun twoSum02(nums: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for (index in nums.indices) {
            val key = target - nums[index]
            val result = map.containsKey(key)
            if (result) {
                return map[key]?.let { intArrayOf(it, index) }
            } else {
                map[nums[index]] = index
            }
        }
        return null
    }

    /**
     * ִ����ʱ��240 ms
     * �ڴ����ģ�36.9 MB
     *
     * ���ַ�ʽjavaִ����ʱֻ��2ms �ڴ�����41.4 MB
     */
    private fun twoSum03(nums: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for (index in nums.indices) {
            if (map.containsKey(nums[index])) {
                return map[nums[index]]?.let { intArrayOf(it, index) }
            }
            map[target - nums[index]] = index
        }
        return null
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val testData = getTestData()
        println("1->${System.currentTimeMillis()}")
        testData.forEach { twoSum01(it.value, it.key) }
        println("2->${System.currentTimeMillis()}")
        testData.forEach { twoSum02(it.value, it.key) }
        println("3->${System.currentTimeMillis()}")
        testData.forEach { twoSum03(it.value, it.key) }
        println("4->${System.currentTimeMillis()}")
    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): Map<Int, IntArray> {
        val map = HashMap<Int, IntArray>()
        map[6] = intArrayOf(1, 2, 3, 4, 5)
        map[4] = intArrayOf(1, 2, 3, 4, 8)
        return map
    }

}
