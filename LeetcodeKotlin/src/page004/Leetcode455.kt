package page004

/**
 *
 * 题目: 分发饼干
 *
 * 描述: 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 *      对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，
 *      都有一个尺寸 s[j] 。如果 s[j] >= g[i]，
 *      我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。
 *      你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 *
 * 限制: 1 <= g.length <= 3 * 104
 *      0 <= s.length <= 3 * 104
 *      1 <= g[i], s[j] <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/assign-cookies/description/
 *
 */
class Leetcode455 {

    /**
     * 排序 双指针
     * 时间 245ms
     * 内存 40.01MB
     */
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        //数组排序
        g.sort()
        s.sort()
        var sum = 0
        var j = 0
        for (children in g) {
            if (j >= s.size) {
                return sum
            }
            while (j < s.size) {
                if (s[j] >= children) {
                    sum += 1
                    j += 1
                    break
                }
                j += 1
            }

        }
        return sum
    }

}