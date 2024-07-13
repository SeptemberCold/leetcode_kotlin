package page030

/**
 *
 * 题目: 判断一个数组是否可以变为有序
 *
 * 描述: 给你一个下标从 0 开始且全是 正 整数的数组 nums 。
 *      一次 操作 中，如果两个 相邻 元素在二进制下数位为 1 的数目 相同 ，
 *      那么你可以将这两个元素交换。你可以执行这个操作 任意次 （也可以 0 次）。
 *      如果你可以使数组变有序，请你返回 true ，否则返回 false 。
 *
 * 限制: 1 <= nums.length <= 100
 *      1 <= nums[i] <= 28
 *
 * 链接: https://leetcode.cn/problems/find-if-array-can-be-sorted/description/?envType=daily-question&envId=2024-07-13
 *
 * 备注：实际操作发现并不是要有序，要升序才可以，题目好像是翻译出错的缘故
 *
 */
class Leetcode3011 {

    /**
     * 冒泡排序
     * 时间：253ms
     * 内存：39MB
     */
    fun canSortArray(nums: IntArray): Boolean {
        val hashMap = HashMap<Int, Int>()
        for (i in nums.indices) {
            for (j in 0 until nums.size - i - 1) {
                if (nums[j] <= nums[j + 1]) continue
                //判断两者二进制1的数量是否一致 不一致就没法递增
                val m = nums[j]
                val n = nums[j + 1]
                //m的二进制 1的个数
                var mCount = hashMap[m]
                if (mCount == null) {
                    mCount = 0
                    var temp = m
                    while (temp != 0) {
                        if (temp and 1 == 1) mCount += 1
                        temp = temp shr 1
                    }
                    hashMap[m] = mCount
                }
                //n的二进制 1的个数
                var nCount = hashMap[n]
                if (nCount == null) {
                    nCount = 0
                    var temp = n
                    while (temp != 0) {
                        if (temp and 1 == 1) nCount += 1
                        temp = temp shr 1
                    }
                    hashMap[n] = nCount
                }
                //不一样就无法递增
                if (mCount != nCount) return false
                //数据交换
                nums[j] = n
                nums[j + 1] = m
            }
        }

        return true
    }

}