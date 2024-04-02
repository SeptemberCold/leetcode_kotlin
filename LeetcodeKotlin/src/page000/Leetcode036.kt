package page000

/**
 *
 * 题目: 有效的数独
 *
 * 描述: 请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。、
 *      数字 1-9 在每一行只能出现一次。
 *      数字 1-9 在每一列只能出现一次。
 *      数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 *
 * 限制: 一个有效的数独（部分已被填充）不一定是可解的。
 *      只需要根据以上规则，验证已经填入的数字是否有效即可。
 *      空白格用 '.' 表示。
 *
 * 链接: https://leetcode.cn/problems/valid-sudoku/description/
 *
 */
class Leetcode036 {

    /**
     * 每行、每列、每个暴力判断
     * 时间：211ms
     * 时间：42.44MB
     */
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val sum = IntArray(9) { return@IntArray 0 }
        //检查每一行
        for (chars in board) {
            for (c in chars) {
                if (c in '1'..'9') {
                    val index = c.code - '1'.code
                    //如果同一行已经有这个数了 返回无效
                    if (sum[index] == 1)
                        return false
                    sum[index] = 1
                }
            }
            sum.fill(0)
        }
        //检查每一列
        for (i in 0 until 9) {
            for (chars in board) {
                if (chars[i] in '1'..'9') {
                    val index = chars[i].code - '1'.code
                    //如果同一列已经有这个数了 返回无效
                    if (sum[index] == 1)
                        return false
                    sum[index] = 1
                }
            }
            sum.fill(0)
        }
        //检查每一个宫格
        for (i in 0 until 9 step 3) {
            for (j in 0 until 9 step 3) {
                for (x in i until i + 3) {
                    for (y in j until j + 3) {
                        if (board[x][y] in '1'..'9') {
                            val index = board[x][y].code - '1'.code
                            //如果同一九宫格已经有这个数了 返回无效
                            if (sum[index] == 1)
                                return false
                            sum[index] = 1
                        }
                    }
                }
                sum.fill(0)
            }
        }
        return true
    }

}