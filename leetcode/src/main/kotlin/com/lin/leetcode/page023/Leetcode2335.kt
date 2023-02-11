package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/02/11/23:33
 *
 * 装满杯子需要的最短总时长
 * 现有一台饮水机，可以制备冷水、温水和热水。
 * 每秒钟，可以装满 2 杯 不同 类型的水或者 1 杯任意类型的水。
 * 给你一个下标从 0 开始、长度为 3 的整数数组 amount ，
 * 其中 amount[0]、amount[1] 和 amount[2] 分别表示需要装满冷水、温水和热水的杯子数量。
 * 返回装满所有杯子所需的 最少 秒数。
 */
object Leetcode2335 {

    /**
     * 问题模拟，每次装最多的两个
     * 执行用时：144 ms
     * 内存消耗：33.1 MB
     */
    private fun fillCups(amount: IntArray): Int {
        var answer = 0
        while (true) {
            val i0 = amount[0]
            val i1 = amount[1]
            val i2 = amount[2]
            if (i0 != 0 || i1 != 0 || i2 != 0) {
                answer += 1
                if (i0 != 0 && i0 >= i1 && i0 >= i2) {
                    amount[0] = amount[0] - 1
                    if (i1 != 0 && i1 >= i2) amount[1] = amount[1] - 1
                    if (i2 != 0 && i2 > i1) amount[2] = amount[2] - 1
                    continue
                }
                if (i1 != 0 && i1 >= i0 && i1 >= i2) {
                    amount[1] = amount[1] - 1
                    if (i0 != 0 && i0 >= i2) amount[0] = amount[0] - 1
                    if (i2 != 0 && i2 > i0) amount[2] = amount[2] - 1
                    continue
                }
                if (i2 != 0 && i2 >= i1 && i2 >= i0) {
                    amount[2] = amount[2] - 1
                    if (i1 != 0 && i1 >= i0) amount[1] = amount[1] - 1
                    if (i0 != 0 && i0 > i1) amount[0] = amount[0] - 1
                    continue
                }
            } else {
                break
            }
        }
        return answer
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = fillCups(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<IntArray> {
        val array = ArrayList<IntArray>()
        array.add(intArrayOf(0, 2, 2))
        return array
    }

}