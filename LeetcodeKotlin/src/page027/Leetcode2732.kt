package page027

/**
 *
 * 题目: 找到矩阵中的好子集
 *
 * 描述: 给你一个下标从 0 开始大小为 m x n 的二进制矩阵 grid 。
 *      从原矩阵中选出若干行构成一个行的 非空 子集，如果子集中任何一列的和至多为子集大小的一半，那么我们称这个子集是 好子集。
 *      更正式的，如果选出来的行子集大小（即行的数量）为 k，那么每一列的和至多为 floor(k / 2) 。
 *      请你返回一个整数数组，它包含好子集的行下标，请你将其 升序 返回。
 *      如果有多个好子集，你可以返回任意一个。如果没有好子集，请你返回一个空数组。
 *      一个矩阵 grid 的行 子集 ，是删除 grid 中某些（也可能不删除）行后，剩余行构成的元素集合。
 *
 * 限制: m == grid.length
 *      n == grid[i].length
 *      1 <= m <= 104
 *      1 <= n <= 5
 *      grid[i][j] 要么是 0 ，要么是 1 。
 *
 * 链接: https://leetcode.cn/problems/find-a-good-subset-of-the-matrix/description/?envType=daily-question&envId=2024-06-25
 *
 */
class Leetcode2732 {

    /**
     * 数学+暴力
     * 时间：1406ms
     * 内存：73.23MB
     */
    fun goodSubsetofBinaryMatrix(grid: Array<IntArray>): List<Int> {
        for (i in grid.indices) {
            val nums = grid[0]
            var good = true
            for (num in nums) {
                if (num != 0) {
                    good = false
                    break
                }
            }
            if (good) return listOf(i)
            for (j in i + 1 until grid.size) {
                val num1 = grid[i]
                val num2 = grid[j]
                good = true
                for (z in num1.indices) {
                    if (num1[z] + num2[z] > 1) {
                        good = false
                        break
                    }
                }
                if (good) {
                    return listOf(i, j)
                }
            }
        }
        return listOf()
    }

}