package page001

/**
 *
 * 题目:杨辉三角 II
 *
 * 描述: 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 *      在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * 限制: 0 <= rowIndex <= 33
 *
 * 链接: https://leetcode.cn/problems/pascals-triangle-ii/
 *
 */
object Leetcode119 {

    /**
     * 动态规划
     * 使用数组代替集合 在返回时再转成集合 这在时间消耗上会快些
     *
     * 执行用时：164 ms
     * 内存消耗：32.4 MB
     *
     */
    fun getRow(rowIndex: Int): List<Int> {
        val answer = ArrayList<Int>()
        answer.add(1)
        for (i in 1..rowIndex) {
            val item = answer[i - 1].toLong() * (rowIndex - i + 1) / i
            answer.add(item.toInt())
        }
        return answer
    }

}