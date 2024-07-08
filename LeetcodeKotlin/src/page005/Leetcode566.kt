package page005

/**
 *
 * 题目: 重塑矩阵
 *
 * 描述: 在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个 m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。
 *      给你一个由二维数组 mat 表示的 m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。
 *      重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。
 *      如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 *
 * 限制: m == mat.length
 *      n == mat[i].length
 *      1 <= m, n <= 100
 *      -1000 <= mat[i][j] <= 1000
 *      1 <= r, c <= 300
 *
 * 链接: https://leetcode.cn/problems/reshape-the-matrix/description/
 *
 */
class Leetcode566 {

    /**
     * 队列
     * 时间：289ms
     * 内存：40.75MB
     */
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat[0].size * mat.size != r * c) {
            return mat
        }
        val temp = ArrayDeque<Int>()
        for (m in mat) {
            for (n in m) {
                temp.add(n)
            }
        }
        val answer = Array(r) { IntArray(c) }
        for (m in answer) {
            for (n in m.indices) {
                m[n] = temp.removeFirst()
            }
        }
        return answer
    }

}