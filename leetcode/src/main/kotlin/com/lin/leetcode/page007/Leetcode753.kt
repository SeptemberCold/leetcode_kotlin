package com.lin.leetcode.page007

import kotlin.math.pow

/**
 * 破解保险箱
 * 有一个需要密码才能打开的保险箱。密码是n 位数, 密码的每一位是k位序列0, 1, ..., k-1中的一个 。
 * 你可以随意输入密码，保险箱会自动记住最后n位输入，如果匹配，则能够打开保险箱。
 * 举个例子，假设密码是"345"，你可以输入"012345"来打开它，只是你输入了 6个字符.
 * 请返回一个能打开保险箱的最短字符串。
 */
object Leetcode753 {


    private val vis: MutableSet<Int> = HashSet()
    private val ans = StringBuilder()
    private var mod = 0

    /**
     * 执行用时：212 ms
     * 内存消耗：34.8 MB
     */
    private fun crackSafe(n: Int, k: Int): String {
        mod = 10.0.pow((n - 1).toDouble()).toInt()
        dfs(0, k)
        ans.append("0".repeat(n - 1))
        return ans.toString()
    }

    private fun dfs(u: Int, k: Int) {
        for (x in 0 until k) {
            val e = u * 10 + x
            if (vis.add(e)) {
                val v = e % mod
                dfs(v, k)
                ans.append(x)
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val crackSafe1 = crackSafe(3, 3)
        println(crackSafe1)
        val crackSafe2 = crackSafe(4, 4)
        println(crackSafe2)
    }

}