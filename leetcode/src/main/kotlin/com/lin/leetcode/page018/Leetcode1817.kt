package com.lin.leetcode.page018

/**
 *
 * @author lin
 * @date 2023/01/20/23:12
 */
object Leetcode1817 {


    /**
     * ��Ŀû����
     */
    private fun findingUsersActiveMinutes(logs: Array<IntArray>, k: Int): IntArray {
        //���
        val answer = IntArray(k) { return@IntArray 0 }
        //ȥ��
        logs.distinct()
        //��������
        logs.forEach {
            if (it[1] <= k) {
                answer[it[1] - 1] = answer[it[1] - 1] + 1
            }
        }
        return answer
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = findingUsersActiveMinutes(it.value, it.key)
            println("${it.key} result=${result.toList()}")
        }

    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): Map<Int, Array<IntArray>> {
        val map = HashMap<Int, Array<IntArray>>()
        map[5] = Array(5) { return@Array intArrayOf(0, 0) }
        map[5]?.set(0, intArrayOf(0, 5))
        map[5]?.set(1, intArrayOf(1, 2))
        map[5]?.set(2, intArrayOf(0, 2))
        map[5]?.set(3, intArrayOf(0, 5))
        map[5]?.set(4, intArrayOf(1, 3))

        map[4] = Array(3) { return@Array intArrayOf(0, 0) }
        map[4]?.set(0, intArrayOf(1, 1))
        map[4]?.set(1, intArrayOf(2, 2))
        map[4]?.set(2, intArrayOf(2, 3))

        return map
    }


}