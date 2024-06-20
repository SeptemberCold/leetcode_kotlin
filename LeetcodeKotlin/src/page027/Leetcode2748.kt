package page027

/**
 *
 * 题目: 美丽下标对的数目
 *
 * 描述: 给你一个下标从 0 开始的整数数组 nums 。
 *      如果下标对 i、j 满足 0 ≤ i < j < nums.length ，
 *      如果 nums[i] 的 第一个数字 和 nums[j] 的 最后一个数字 互质 ，
 *      则认为 nums[i] 和 nums[j] 是一组 美丽下标对 。
 *      返回 nums 中 美丽下标对 的总数目。
 *      对于两个整数 x 和 y ，如果不存在大于 1 的整数可以整除它们，
 *      则认为 x 和 y 互质 。换而言之，如果 gcd(x, y) == 1 ，
 *      则认为 x 和 y 互质，其中 gcd(x, y) 是 x 和 y 的 最大公因数 。
 *
 * 限制: 2 <= nums.length <= 100
 *      1 <= nums[i] <= 9999
 *      nums[i] % 10 != 0
 *
 * 链接: https://leetcode.cn/problems/number-of-beautiful-pairs/description/?envType=daily-question&envId=2024-06-20
 *
 */
class Leetcode2748 {

    /**
     * 库函数+模拟
     * 时间：360ms
     * 内存：56.50MB
     */
    fun countBeautifulPairs(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                var a = nums[i].toString().substring(0, 1).toInt()
                var b = nums[j] % 10
                //求两个数是否互质
                while (b != 0) {
                    val temp = b
                    b = a % b
                    a = temp
                }
                if (a == 1) count += 1
            }
        }
        return count
    }

}