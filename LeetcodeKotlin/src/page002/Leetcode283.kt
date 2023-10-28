package page002

/**
 *
 * 题目: 移动零
 *
 * 描述: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *      请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 限制: 1 <= nums.length <= 104
 *      -231 <= nums[i] <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/move-zeroes/description/
 *
 */
class Leetcode283 {

    /**
     * 哈希
     * 时间 272ms
     * 内存 37.96MB
     */
    fun moveZeroes(nums: IntArray?) {
        if(nums==null) return
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
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