package page029

/**
 *
 * 题目: 最小数字游戏
 *
 * 描述: 你有一个下标从 0 开始、长度为 偶数 的整数数组 nums ，
 *      同时还有一个空数组 arr 。Alice 和 Bob 决定玩一个游戏，
 *      游戏中每一轮 Alice 和 Bob 都会各自执行一次操作。游戏规则如下：
 *      每一轮，Alice 先从 nums 中移除一个 最小 元素，然后 Bob 执行同样的操作。
 *      接着，Bob 会将移除的元素添加到数组 arr 中，然后 Alice 也执行同样的操作。
 *      游戏持续进行，直到 nums 变为空。
 *      返回结果数组 arr 。
 *
 * 限制: 1 <= nums.length <= 100
 *      1 <= nums[i] <= 100
 *      nums.length % 2 == 0
 *
 * 链接: https://leetcode.cn/problems/minimum-number-game/description/?envType=daily-question&envId=2024-07-12
 *
 */
class Leetcode2974 {

    /**
     * 冒泡排序
     * 时间：239ms
     * 内存：40.31MB
     */
    fun numberGame(nums: IntArray): IntArray {
        for (i in nums.indices) {
            for (j in 0 until nums.size - i - 1) {
                val m = nums[j]
                val n = nums[j + 1]
                if (n < m) {
                    nums[j] = n
                    nums[j + 1] = m
                }
            }
        }

        for (i in nums.indices step 2) {
            val m = nums[i]
            nums[i] = nums[i + 1]
            nums[i + 1] = m
        }
        return nums
    }

}