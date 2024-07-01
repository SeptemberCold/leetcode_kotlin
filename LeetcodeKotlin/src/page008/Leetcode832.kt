package page008


/**
 *
 * 题目: 翻转图像
 *
 * 描述: 给定一个 n x n 的二进制矩阵 image ，先 水平 翻转图像，然后 反转 图像并返回 结果 。
 *      水平翻转图片就是将图片的每一行都进行翻转，即逆序。、
 *      例如，水平翻转 [1,1,0] 的结果是 [0,1,1]。
 *      反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。
 *      例如，反转 [0,1,1] 的结果是 [1,0,0]。
 *
 * 限制: n == image.length
 *      n == image[i].length
 *      1 <= n <= 20
 *      images[i][j] == 0 或 1.
 *
 * 链接: https://leetcode.cn/problems/flipping-an-image/
 *
 */
class Leetcode832 {

    /**
     * 模拟 位运算
     * 用时：194ms
     * 内存：39.87MB
     */
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        for (row in image) {
            val size = (row.size / 2) - (row.size and 1 xor 1)
            for (i in 0..size) {
                //参数不一致可以不用交换
                if (row[i] == row[row.size - 1 - i]) {
                    if (i == row.size - 1 - i) {
                        row[i] = row[i] xor 1
                    } else {
                        row[i] = row[i] xor 1
                        row[row.size - 1 - i] = row[i]
                    }
                }
            }
        }
        return image
    }

}