package page000

/**
 *
 * 题目: 最接近的三数之和
 *
 * 描述: 给你一个长度为 n 的整数数组nums和 一个目标值target。请你从 nums 中选出三个整数，使它们的和与target最接近。
 *      返回这三个数的和。
 *      假定每组输入只存在恰好一个解。
 * 限制: 3 <= nums.length <= 1000
 *      -1000 <= nums[i] <= 1000
 *      -104 <= target <= 104
 *
 * 链接: https://leetcode.cn/problems/3sum-closest/
 *
 */
class Leetcode016 {

    /**
     * 三层循环暴力破解
     * 执行用时：692 ms
     * 内存消耗：36.8 MB
     */
    fun threeSumClosest(nums: IntArray, target: Int): Int {

        var sum = 0
        var temp = Int.MAX_VALUE

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                for (o in j + 1 until nums.size) {
                    val mSum = nums[i] + nums[j] + nums[o]
                    val mTemp = if (mSum > target) mSum - target else target - mSum
                    //等于0
                    if (mTemp == 0) {
                        return mSum
                    }
                    //小于0
                    else if (mTemp < 0) {
                        if (mTemp * -1 < temp) {
                            temp = mTemp * -1
                            sum = mSum
                        }
                    }
                    //大于0
                    else {
                        if (mTemp < temp) {
                            temp = mTemp
                            sum = mSum
                        }
                    }
                }
            }
        }
        return sum
    }

}