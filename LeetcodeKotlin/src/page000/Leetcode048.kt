package page000

/**
 *
 * 题目: 旋转图像
 *
 * 描述: 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *      你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 *
 * 限制: n == matrix.length == matrix[i].length
 *      1 <= n <= 20
 *      -1000 <= matrix[i][j] <= 1000
 *
 * 链接: https://leetcode.cn/problems/rotate-image/description/
 *
 */
class Leetcode048 {

    /**
     * 使用辅助空间暴力破解
     * 用时：168ms
     * 内存：34.76MB
     */
    fun rotate(matrix: Array<IntArray>) {
        //深拷贝 变成list了
        val copy = matrix.map { it.copyOf() }

        for (matrixIndex in matrix.indices) {
            val ints = matrix[matrixIndex]
            for (index in ints.indices) {
                ints[index] = copy[ints.size - 1 - index][matrixIndex]
            }
        }
    }

}