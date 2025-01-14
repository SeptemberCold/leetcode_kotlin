package page024

/**
 *
 * 题目: 对数组执行操作
 *
 * 描述: 给你一个下标从 0 开始的数组 nums ，数组大小为 n ，且由 非负 整数组成。
 *      你需要对数组执行 n - 1 步操作，其中第 i 步操作（从 0 开始计数）要求对 nums 中第 i 个元素执行下述指令：
 *      如果 nums[i] == nums[i + 1] ，则 nums[i] 的值变成原来的 2 倍，nums[i + 1] 的值变成 0 。否则，跳过这步操作。
 *      在执行完 全部 操作后，将所有 0 移动 到数组的 末尾 。
 *      例如，数组 [1,0,2,0,0,1] 将所有 0 移动到末尾后变为 [1,2,1,0,0,0] 。
 *      返回结果数组。
 *      注意 操作应当 依次有序 执行，而不是一次性全部执行。
 *
 * 限制: 2 <= nums.length <= 2000
 *      0 <= nums[i] <= 1000
 *
 * 链接: https://leetcode.cn/problems/apply-operations-to-an-array/
 *
 */
class Leetcode2460 {

    /**
     * 模拟+选择排序
     * 执行用时：188 ms
     * 内存消耗：35.6 MB
     */
    fun applyOperations(nums: IntArray): IntArray {
        //按要求计算
        for (i in 0 until nums.size - 1) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2
                nums[i + 1] = 0
            }
        }

        //选择排序
        for (i in nums.indices) {
            //非0跳过一次循环
            if (nums[i] != 0) continue
            //找出下一个非0的参数
            for (j in i until nums.size) {
                if (nums[j] != 0) {
                    nums[i] = nums[j]
                    nums[j] = 0
                    break
                }
            }
        }
        return nums
    }

}