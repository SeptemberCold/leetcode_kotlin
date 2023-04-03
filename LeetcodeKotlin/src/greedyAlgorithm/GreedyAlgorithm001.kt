package greedyAlgorithm

/**
 *
 * 题目: 分发饼干
 *
 * 描述: 给你两个数组，a[]表示小孩的胃口，b[]表示饼干的分量。
 *      当b[ i ]>a[ j ]的时候表示i饼干可以满足j小孩的胃口。
 *      求饼干b能满足多少小孩的胃口。
 * 限制:
 *
 * 链接: https://www.bilibili.com/video/BV1MM411b7cq
 *
 */
object GreedyAlgorithm001 {

    /**
     * 贪心算法 双指针
     * 从最大的分发起，发给满足且胃口相对最大的小孩
     */
    fun greedyAlgorithm(a: IntArray, b: IntArray): Int {
        val sortedA = a.toList().sorted()
        val sortedB = b.toList().sorted()
        //遍历索引
        var ai = sortedA.size - 1
        var bi = sortedB.size - 1
        var result = 0
        while (true) {
            if (ai <= -1 || bi <= -1) return result
            if (sortedB[bi] >= sortedA[ai]) {
                bi -= 1
                ai -= 1
                result++
            } else {
                ai -= 1
            }
        }
    }

}