package page002

/**
 *
 * 题目: H 指数
 *
 * 描述: 给你一个整数数组 citations ，其中 citations[ i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
 *      根据维基百科上 h 指数的定义：h 代表“高引用次数” ，一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，并且每篇论文 至少 被引用 h 次。
 *      如果 h 有多种可能的值，h 指数 是其中最大的那个。
 * 限制: n == citations.length
 *      1 <= n <= 5000
 *      0 <= citations[i] <= 1000
 *
 * 链接: https://leetcode.cn/problems/h-index/description/?envType=daily-question&envId=2023-10-29
 *
 */
class Leetcode274 {

    /**
     * 排序 + 暴力
     * 时间 188ms
     * 内存 32.79MB
     */
    fun hIndex(citations: IntArray): Int {
        //这是1000的最大值 每篇论文最多被引用1000次
        for (i in citations.indices) {
            for (j in i until citations.size) {
                if (citations[i] > citations[j]) {
                    val temp = citations[i]
                    citations[i] = citations[j]
                    citations[j] = temp
                }
            }
        }

        var h = 0
        var index = 0
        for (i in 1..1000) {
            //有sum篇论文引用次数超过i
            var sum = 0
            for (j in index until citations.size) {
                if (i <= citations[j]) {
                    index = j
                    sum = citations.size - index
                    break
                }
            }
            if (i <= sum) {
                h = i
            }else{
                return h
            }
        }
        return h
    }


}