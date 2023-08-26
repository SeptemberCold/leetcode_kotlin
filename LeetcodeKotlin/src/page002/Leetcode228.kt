package page002

/**
 *
 * 题目: 汇总区间
 *
 * 描述: 给定一个  无重复元素 的 有序 整数数组 nums 。
 *      返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表 。
 *      也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 *      列表中的每个区间范围 [a,b] 应该按如下格式输出：
 *      "a->b" ，如果 a != b
 *      "a" ，如果 a == b
 * 限制: 0 <= nums.length <= 20
 *      -231 <= nums[i] <= 231 - 1
 *      nums 中的所有值都 互不相同
 *      nums 按升序排列
 *
 * 链接: https://leetcode.cn/problems/summary-ranges/description/
 *
 */
class Leetcode228 {

    /**
     * 模拟
     * 时间 168ms
     * 内存 32.72MB
     */
    fun summaryRanges(nums: IntArray): List<String> {
        //空参处理
        if (nums.isEmpty()) return ArrayList()

        //初始化
        val result = ArrayList<String>()
        var start = nums[0]
        var temp = nums[0]

        for (i in 1 until nums.size) {
            val number = nums[i]
            if (number - temp != 1) {
                if (temp - start!=0){
                    result.add("${start}->${temp}")
                }else{
                    result.add("$start")
                }
                start = number
            }
            temp = number
        }
        if (temp - start!=0){
            result.add("${start}->${temp}")
        }else{
            result.add("$start")
        }
        return result
    }

}