package com.lin.leetcode.page007

import kotlin.math.pow

/**
 * �ƽⱣ����
 * ��һ����Ҫ������ܴ򿪵ı����䡣������n λ��, �����ÿһλ��kλ����0, 1, ..., k-1�е�һ�� ��
 * ����������������룬��������Զ���ס���nλ���룬���ƥ�䣬���ܹ��򿪱����䡣
 * �ٸ����ӣ�����������"345"�����������"012345"��������ֻ���������� 6���ַ�.
 * �뷵��һ���ܴ򿪱����������ַ�����
 */
object Leetcode753 {


    private val vis: MutableSet<Int> = HashSet()
    private val ans = StringBuilder()
    private var mod = 0

    /**
     * ִ����ʱ��212 ms
     * �ڴ����ģ�34.8 MB
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