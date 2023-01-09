package com.lin.leetcode.page018

/**
 *
 * @author lin
 * @date 2023/01/09/23:13
 *
 * 还原排列的最少操作步数
 * 给你一个偶数 n，已知存在一个长度为 n 的排列 perm ，
 * 其中 perm[ i ] == i（下标 从 0 开始 计数）。
 * 一步操作中，你将创建一个新数组 arr ，对于每个 i ：
 * 如果 i % 2 == 0 ，那么 arr[ i ] = perm[i / 2]
 * 如果 i % 2 == 1 ，那么 arr[ i ] = perm[n / 2 + (i - 1) / 2]
 * 然后将 arr 赋值给 perm 。
 * 要想使 perm 回到排列初始值，至少需要执行多少步操作？返回最小的 非零 操作步数。
 *
 */
object Leetcode1806 {

    /**
     * 暴力破解，有数学解法
     * 另外这里中等难度 但难的地方应该是读懂题目
     * 执行用时：156 ms
     * 内存消耗：34.3 MB
     */
    private fun reinitializePermutation(n: Int): Int {
        //3个数组 一个用于缓存操作后的数组 一个用于操作的数组 一个用于比对结果的数组
        var perm = IntArray(n)
        val arr = IntArray(n)
        val temp = IntArray(n)
        //数组填充
        for (i in perm.indices) {
            perm[i] = i
            arr[i] = i
            temp[i] = i
        }
        //用于计数
        var sum = 0
        //死循环，如果解不出来就会卡死在这
        while (true) {
            //遍历操作
            for (index in arr.indices) {
                if (index % 2 == 0) {
                    arr[index] = perm[index / 2]
                } else {
                    arr[index] = perm[n / 2 + (index - 1) / 2]
                }
            }
            //复制赋值
            perm = arr.copyOf()
            //计数
            sum++
            //结果比对
            if (temp.contentEquals(arr)) {
                break
            }
        }
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = reinitializePermutation(it)
            println("${it}->result=${result}")
        }
    }

    private fun getTestData(): List<Int> {
        val data = ArrayList<Int>()
        data.add(4)
        data.add(6)
        data.add(8)
        data.add(10)
        return data
    }


}