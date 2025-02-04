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

    /**
     * 原地旋转
     * 用时：168ms
     * 内存：34.63MB
     */
    fun rotate2(matrix: Array<IntArray>) {
        val n = matrix.size
        for (i in 0 until n / 2) {
            //遍历元素上部分 每4个旋转一次
            for (j in i until n - i - 1) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[n - 1 - j][i]
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j]
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i]
                matrix[j][n - 1 - i] = temp
            }
        }
    }

    /**
     * 翻转代替旋转 线性代数的知识 淦
     * 用时：176ms
     * 内存：34.69MB
     */
    fun rotate3(matrix: Array<IntArray>) {
        val n = matrix.size
        if (n == 1) return
        //上下翻转
        for (i in 0 until n / 2) {
            val temp = matrix[i]
            matrix[i] = matrix[n - 1 - i]
            matrix[n - 1 - i] = temp
        }
        //以对角线为准交换数据
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
    }


}