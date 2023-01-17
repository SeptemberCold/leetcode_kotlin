package com.lin.leetcode.page018

/**
 *
 * @author lin
 * @date 2023/01/17/22:44
 *
 * 统计一个数组中好对子的数目
 * 给你一个数组nums，数组中只包含非负整数。定义rev(x)的值为将整数x各个数字位反转得到的结果。
 * 比方说rev(123) = 321，rev(120) = 21。
 * 我们称满足下面条件的下标对(i, j) 是好的：
 * 0 <= i < j < nums.length
 * nums[ i ] + rev(nums[ j ]) == nums[ j ] + rev(nums[ i ])
 * 请你返回好下标对的数目。由于结果可能会很大，请将结果对109 + 7取余后返回。
 */
object Leetcode1814 {


    /**
     * 哈希表
     * 力扣第一题两数之和的变种
     * 执行用时：440 ms
     * 内存消耗：53.6 MB
     */
    fun countNicePairs(nums: IntArray): Int {
        val mod = 1000000007
        var result = 0
        //哈希表
        val map = HashMap<Int, Int>()
        for (i in nums) {
            //用于辅助翻转的变量
            var temp = i
            //翻转后的数字 i=123 j=321
            var j = 0
            //将i翻转
            while (temp > 0) {
                j = j * 10 + temp % 10
                temp /= 10
            }
            //获取好对子的数目 前面的对子会获取不到后面对应的对子
            result = (result + map.getOrDefault(i - j, 0)) % mod
            //存储好对子的数目 后面对应的好对子读取就能获得
            map[i - j] = map.getOrDefault(i - j, 0) + 1
        }
        return result
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = countNicePairs(it)
            println(result)
        }
    }

    /**
     * 获取测试用例
     */
    private fun getTestData(): List<IntArray> {
        val data = ArrayList<IntArray>()
        data.add(intArrayOf(42, 11, 1, 97))
        data.add(intArrayOf(13, 10, 35, 24, 76))
        return data
    }

}