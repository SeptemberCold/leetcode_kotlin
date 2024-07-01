package page008

/**
 *
 * 题目: 较大分组的位置
 *
 * 描述: 在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
 *      例如，在字符串 s = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 *      分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示为 [3,6] 。
 *      我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
 *      找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。
 *
 * 限制: 1 <= s.length <= 1000
 *      s 仅含小写英文字母
 *
 * 链接: https://leetcode.cn/problems/positions-of-large-groups/description/
 *
 */
class Leetcode830 {

    /**
     * 双指针
     * 时间：218ms
     * 内存：40.10MB
     */
    fun largeGroupPositions(s: String): List<List<Int>> {
        val answer = ArrayList<List<Int>>()
        var start = 0
        val array = s.toCharArray()
        for (index in 1 until array.size) {
            if (array[start] != array[index]) {
                if (index - start >= 3) {
                    answer.add(listOf(start, index - 1))
                }
                start = index
            }
        }
        if (array.size - start >= 3) {
            answer.add(listOf(start, array.size - 1))
        }
        return answer
    }

}