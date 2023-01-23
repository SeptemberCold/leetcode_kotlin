package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/23/18:37
 * 计算应缴税款总额
 * 给你一个下标从 0 开始的二维整数数组 brackets ，
 * 其中 brackets[ i ] = [upperi, percenti] ，表示第 i 个税级的上限是 upperi ，征收的税率为 percenti 。
 * 税级按上限 从低到高排序（在满足 0 < i < brackets.length 的前提下，upperi-1 < upperi）。
 * 税款计算方式如下：
 * 不超过 upper0 的收入按税率 percent0 缴纳
 * 接着 upper1 - upper0 的部分按税率 percent1 缴纳
 * 然后 upper2 - upper1 的部分按税率 percent2 缴纳
 * 以此类推
 * 给你一个整数 income 表示你的总收入。返回你需要缴纳的税款总额。与标准答案误差不超 10-5 的结果将被视作正确答案。
 */
object Leetcode2303 {

    /**
     * 执行用时：232 ms
     * 内存消耗：41.9 MB
     * 问题模拟
     */
    private fun calculateTax(brackets: Array<IntArray>, income: Int): Double {
        //需要缴的税
        var tax: Double
        //如果只符合第一个税级的标准 直接返回结果 减少循环的判断
        if (income <= brackets[0][0]) {
            return 0.01 * brackets[0][1] * income
        } else {
            tax = 0.01 * brackets[0][1] * brackets[0][0]
        }

        for (i in 1 until brackets.size) {
            //税级
            val upper = brackets[i][0]
            //税率
            val percent = brackets[i][1]
            //上一级税级
            val upperUp = brackets[i - 1][0]
            if (upper < income) {
                tax += 0.01 * percent * (upper - upperUp)
            } else {
                tax += 0.01 * percent * (income - upperUp)
                break
            }
        }
        return tax
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = calculateTax(it.value, it.key)
            println("${it.key} = $answer")
        }
    }

    private fun getTestData(): Map<Int, Array<IntArray>> {
        val map = HashMap<Int, Array<IntArray>>()
        map[10] = arrayOf(intArrayOf(3, 50), intArrayOf(7, 10), intArrayOf(12, 25))
        map[2] = arrayOf(intArrayOf(1, 0), intArrayOf(4, 25), intArrayOf(5, 20))
        map[0] = arrayOf(intArrayOf(2, 50))
        return map
    }


}