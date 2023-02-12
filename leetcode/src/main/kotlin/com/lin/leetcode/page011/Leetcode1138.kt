package com.lin.leetcode.page011


/**
 *
 * @author lin
 * @date 2023/02/12/23:17
 *
 * 我们从一块字母板上的位置(0, 0)出发，该坐标对应的字符为board[0][0]。
 * 在本题里，字母板为board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"]，如下所示。
 * 我们可以按下面的指令规则行动：
 * 如果方格存在，'U'意味着将我们的位置上移一行；
 * 如果方格存在，'D'意味着将我们的位置下移一行；
 * 如果方格存在，'L'意味着将我们的位置左移一列；
 * 如果方格存在，'R'R意味着将我们的位置右移一列；
 * '!'会把在我们当前位置 (r, c) 的字符board[ r ][ c ]添加到答案中。
 * （注意，字母板上只存在有字母的位置。）
 * 返回指令序列，用最小的行动次数让答案和目标target相同。你可以返回任何达成目标的路径。
 *
 */
object Leetcode1138 {

    /**
     * 问题模拟
     * 执行用时：144 ms
     * 内存消耗：32.7 MB
     * 因为字母表存在'z'的原因，需要一些特殊的处理
     * 或者也可以遵循上、左、下、右也可以避开‘z’的干扰
     */
    private fun alphabetBoardPath(target: String): String {
        val answer = StringBuilder()
        //行
        var i = 0
        //列
        var j = 0
        for (c in target) {
            val order = c - 'a'
            //行
            val orderI = order / 5
            //列
            val orderJ = order % 5
            //行偏移
            val sumI = orderI - i
            //列偏移
            val sumJ = orderJ - j
            //如果c='z' 先进行列偏移
            if (c == 'z') {
                if (sumJ > 0) for (r in 0 until sumJ) answer.append("R")
                else if (sumJ < 0) for (r in 0 until -sumJ) answer.append("L")
                //行偏移
                if (sumI > 0) for (r in 0 until sumI) answer.append("D")
                else if (sumI < 0) for (r in 0 until -sumI) answer.append("U")
            } else {
                //行偏移
                if (sumI > 0) for (r in 0 until sumI) answer.append("D")
                else if (sumI < 0) for (r in 0 until -sumI) answer.append("U")
                if (sumJ > 0) for (r in 0 until sumJ) answer.append("R")
                else if (sumJ < 0) for (r in 0 until -sumJ) answer.append("L")
            }
            answer.append("!")
            i = orderI
            j = orderJ
        }
        return answer.toString()
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = alphabetBoardPath(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<String> {
        val array = ArrayList<String>()
        array.add("leet")
        array.add("code")
        array.add("zdz")
        return array
    }


}