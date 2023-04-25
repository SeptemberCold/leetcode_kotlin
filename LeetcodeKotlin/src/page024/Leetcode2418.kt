package page024

/**
 *
 * 题目: 按身高排序
 *
 * 描述: 给你一个字符串数组 names ，和一个由 互不相同 的正整数组成的数组 heights 。两个数组的长度均为 n 。
 *      对于每个下标 i，names[i] 和 heights[i] 表示第 i 个人的名字和身高。
 *      请按身高 降序 顺序返回对应的名字数组 names 。
 * 限制: n == names.length == heights.length
 *      1 <= n <= 103、
 *      1 <= names[i].length <= 20
 *      1 <= heights[i] <= 105
 *      names[i] 由大小写英文字母组成
 *      heights 中的所有值互不相同
 *
 * 链接: https://leetcode.cn/problems/sort-the-people/
 *
 */
class Leetcode2418 {

    /**
     * 冒泡排序
     * 执行用时：292 ms
     * 内存消耗：36 MB
     */
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        for (j in heights.indices) {
            for (i in 1 until heights.size - j) {
                if (heights[i - 1] < heights[i]) {
                    val temp = heights[i - 1]
                    heights[i - 1] = heights[i]
                    heights[i] = temp

                    val strTemp = names[i - 1]
                    names[i - 1] = names[i]
                    names[i] = strTemp
                }
            }
        }
        return names
    }

}