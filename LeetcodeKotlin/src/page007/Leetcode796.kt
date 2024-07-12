package page007

/**
 *
 * 题目: 旋转字符串
 *
 * 描述: 给定两个字符串, s 和 goal。如果在若干次旋转操作之后，s 能变成 goal ，那么返回 true 。
 *      s 的 旋转操作 就是将 s 最左边的字符移动到最右边。
 *      例如, 若 s = 'abcde'，在旋转一次之后结果就是'bcdea' 。
 *
 * 限制: 1 <= s.length, goal.length <= 100
 *      s 和 goal 由小写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/rotate-string/description/
 *
 */
class Leetcode796 {

    /**
     * 字符串匹配
     * 时间：143ms
     * 内存：33.25MB
     */
    fun rotateString(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        val ms = s + s;
        val keys = ArrayList<Int>()
        for (i in 0 until ms.length - goal.length) {
            keys.add(i)
        }
        for (i in goal.indices) {
            val temp = HashSet<Int>()
            for (key in keys) {
                if (ms[key + i] != goal[i]) {
                    temp.add(key)
                }
            }
            keys.removeAll(temp)
        }
        return keys.isNotEmpty()
    }

}