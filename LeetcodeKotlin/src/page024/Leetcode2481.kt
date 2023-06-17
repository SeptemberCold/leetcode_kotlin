package page024

/**
 *
 * 题目: 分割圆的最少切割次数
 *
 * 描述: 圆内一个 有效切割，符合以下二者之一：
 *      该切割是两个端点在圆上的线段，且该线段经过圆心。
 *      该切割是一端在圆心另一端在圆上的线段。
 *      一些有效和无效的切割如下图所示。
 * 限制: 1 <= n <= 100
 *
 * 链接: https://leetcode.cn/problems/minimum-cuts-to-divide-a-circle/
 *
 */
class Leetcode2481 {

    /**
     * 数学计算
     * 执行用时：124 ms
     * 内存消耗：32.1 MB
     */
    fun numberOfCuts(n: Int): Int {
        if (n == 1) return 0
        return if (n % 2 == 0) n / 2 else n
    }

}