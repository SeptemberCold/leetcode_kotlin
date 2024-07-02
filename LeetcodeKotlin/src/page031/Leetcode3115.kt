package page031

/**
 *
 * 题目: 质数的最大距离
 *
 * 描述: 给你一个整数数组 nums。
 *      返回两个（不一定不同的）质数在 nums 中 下标 的 最大距离。
 *
 * 限制: 1 <= nums.length <= 3 * 105
 *      1 <= nums[i] <= 100
 *      输入保证 nums 中至少有一个质数。
 *
 * 链接: https://leetcode.cn/problems/maximum-prime-difference/description/?envType=daily-question&envId=2024-07-02
 *
 */
class Leetcode3115 {

    /**
     * 埃氏筛
     * 时间：609ms
     * 空间：91.38MB
     */
    fun maximumPrimeDifference(nums: IntArray): Int {
        //埃氏筛 100以内的素数
        val primes = ArrayList<Int>()
        val mNums = ArrayList<Int>()
        val temp = ArrayList<Int>()
        for (i in 2..100) {
            mNums.add(i)
        }
        while (mNums.isNotEmpty() && mNums[0] * mNums[0] < mNums[mNums.size - 1]) {
            val prime = mNums[0]
            temp.clear()
            for (i in mNums) {
                if (i % prime != 0) {
                    temp.add(i)
                }
            }
            mNums.clear()
            mNums.addAll(temp)
            primes.add(prime)
        }
        primes.addAll(mNums)
        var min = 0
        for (i in nums.indices) {
            if (primes.contains(nums[i])) {
                min = i
                break
            }
        }
        var max = 0
        for (i in nums.indices) {
            if (primes.contains(nums[nums.size - 1 - i])) {
                max = nums.size - 1 - i
                break
            }
        }
        return max - min
    }

}