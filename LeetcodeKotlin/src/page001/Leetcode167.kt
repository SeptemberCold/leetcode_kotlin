package page001

/**
 *
 * 题目: 两数之和 II - 输入有序数组
 *
 * 描述: 给你一个下标从 1 开始的整数数组 numbers，该数组已按 非递减顺序排列，请你从数组中找出满足相加之和等于目标数 target 的两个数。
 *      如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
 *      以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 *      你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 *
 *      你所设计的解决方案必须只使用常量级的额外空间。
 *
 * 限制: 2 <= numbers.length <= 3 * 104
 *      -1000 <= numbers[i] <= 1000
 *      numbers 按 非递减顺序 排列
 *      -1000 <= target <= 1000
 *      仅存在一个有效答案
 *
 * 链接: https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/description/
 *
 */
class Leetcode167 {

    /**
     * 双指针
     * 用时：524ms
     * 内存：38.95MB
     */
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for ((index, num) in numbers.withIndex()) {
            for (index2 in index + 1 until numbers.size) {
                if (num + numbers[index2] == target) return intArrayOf(index + 1, index2 + 1)
                if (num + numbers[index2] > target) break
            }
        }
        return intArrayOf(0, 0)
    }

}