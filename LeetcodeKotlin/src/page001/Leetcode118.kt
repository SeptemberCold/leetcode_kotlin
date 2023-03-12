package page001

/**
 *
 * 题目: 杨辉三角
 *
 * 描述: 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 *      在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * 限制: 1 <= numRows <= 30
 *
 * 链接: https://leetcode.cn/problems/pascals-triangle/
 *
 */
object Leetcode118 {

    /**
     * 首尾赋1
     * 利用上一行相邻的数计算当前结果
     *
     * 执行用时: 164 ms
     * 内存消耗: 34.4 MB
     */
    fun generate(numRows: Int): List<List<Int>> {
        val answer = ArrayList<List<Int>>()
        for(i in 0 until numRows){
            val row = ArrayList<Int>()
            for(j in 0..i){
                if (j==0||j==i){
                    row.add(1)
                }else{
                    row.add(answer[i-1][j-1]+answer[i-1][j])
                }
            }
            answer.add(row)
        }
        return answer
    }


}