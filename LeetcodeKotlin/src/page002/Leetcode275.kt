package page002

/**
 *
 * 题目: H 指数 II
 *
 * 描述: 给你一个整数数组 citations ，
 *      其中 citations[i] 表示研究者的第 i 篇论文被引用的次数，citations 已经按照 升序排列 。
 *      计算并返回该研究者的 h 指数。
 *      h 指数的定义：h 代表“高引用次数”（high citations），
 *      一名科研人员的 h 指数是指他（她）的 （n 篇论文中）总共有 h 篇论文分别被引用了至少 h 次。
 *      请你设计并实现对数时间复杂度的算法解决此问题。
 * 限制: n == citations.length
 *      1 <= n <= 105
 *      0 <= citations[i] <= 1000
 *      citations 按 升序排列
 *
 * 链接: https://leetcode.cn/problems/h-index-ii/description/?envType=daily-question&envId=2023-10-30
 *
 */
class Leetcode275 {

    /**
     *  二分查询
     *  时间 204ms
     *  内存 41.41MB
     */
    fun hIndex(citations: IntArray): Int {
        var start = 0
        var end = citations.size - 1
        while (start <= end) {
            val index = (start + end) / 2
            if (citations[index] >= citations.size - index) {
                end = index - 1
            } else {
                start = index + 1
            }
        }
        return citations.size - start
    }

}