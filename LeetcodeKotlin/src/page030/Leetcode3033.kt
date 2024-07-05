package page030

/**
 *
 * 题目: 修改矩阵
 *
 * 描述: 给你一个下标从 0 开始、大小为 m x n 的整数矩阵 matrix ，
 *      新建一个下标从 0 开始、名为 answer 的矩阵。
 *      使 answer 与 matrix 相等，接着将其中每个值为 -1 的元素替换为所在列的 最大 元素。
 *      返回矩阵 answer 。
 *
 * 限制: m == matrix.length
 *      n == matrix[i].length
 *      2 <= m, n <= 50
 *      -1 <= matrix[i][j] <= 100
 *      测试用例中生成的输入满足每列至少包含一个非负整数。
 *
 * 链接: https://leetcode.cn/problems/modify-the-matrix/description/?envType=daily-question&envId=2024-07-05
 *
 */
class Leetcode3033 {

    /**
     * 双循环
     * 时间：262ms
     * 内存：45.56MB
     */
    fun modifiedMatrix(matrix: Array<IntArray>): Array<IntArray> {

        val m = matrix.size
        val n = matrix[0].size
        var max: Int
        val array = ArrayList<Int>()

        for (i in 0 until n) {
            max = 0
            array.clear()
            for (j in 0 until m) {
                val temp = matrix[j][i]
                if (temp == -1) {
                    array.add(j)
                }
                if (temp > max) {
                    max = temp
                }
            }
            for (j in array) {
                matrix[j][i] = max
            }
        }

        return matrix
    }

}