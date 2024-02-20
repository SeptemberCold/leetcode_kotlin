package page000

/**
 *
 * 题目: 矩阵置零
 *
 * 描述: 给定一个 m x n 的矩阵，如果一个元素为 0 ，
 *      则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 * 限制: m == matrix.length
 *       n == matrix[0].length
 *      1 <= m, n <= 200
 *      -231 <= matrix[i][j] <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/set-matrix-zeroes/description/
 */
class Leetcode073 {

    /**
     * 利用原有数组做文章
     * 用时：260ms
     * 内存：45.91MB
     */
    fun setZeroes(matrix: Array<IntArray>) {
        //第一例是否有0
        var isFirstRowZero = false
        //计算第一例是否有0
        for (num in matrix[0]) {
            if (num == 0) {
                isFirstRowZero = true
                break
            }
        }
        //开始遍历 用第一行标记该列是否有0
        for (i in 1 until matrix.size) {
            val ints = matrix[i]
            //这一行是否有0
            var isZero = false
            for (j in ints.indices) {
                if (ints[j] == 0) {
                    matrix[0][j] = 0
                    isZero = true
                }
            }
            //如果这一行有0 全部置0
            if (isZero) {
                for (j in ints.indices) {
                    ints[j] = 0
                }
            }
        }
        //根据第一行的标记对每一列检查
        for (i in matrix[0].indices) {
            if (matrix[0][i] == 0) {
                for (ints in matrix) {
                    ints[i] = 0
                }
            }
        }
        //第一行换0
        if (isFirstRowZero) {
            for (i in matrix[0].indices) {
                matrix[0][i] = 0
            }
        }
    }

}