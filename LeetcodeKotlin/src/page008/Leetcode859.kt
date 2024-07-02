package page008

/**
 *
 * 题目: 亲密字符串
 *
 * 描述: 给你两个字符串 s 和 goal ，只要我们可以通过交换 s 中的两个字母得到与 goal 相等的结果，就返回 true ；否则返回 false 。
 *      交换字母的定义是：取两个下标 i 和 j （下标从 0 开始）且满足 i != j ，接着交换 s[i] 和 s[j] 处的字符。
 *      例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
 *
 * 限制: 1 <= s.length, goal.length <= 2 * 104
 *      s 和 goal 由小写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/buddy-strings/description/
 *
 */
class Leetcode859 {

    /**
     * 统计
     * 时间：161ms
     * 内存：36.27MB
     */
    fun buddyStrings(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        //同样的字符串
        if (s == goal) {
            val hashMap = HashMap<Char, Int>()
            //检查有没有两个一样的字符
            for (i in s) {
                if (hashMap.containsKey(i)) {
                    return true
                } else {
                    hashMap[i] = 1
                }
            }
            //没有就不是亲密字符串
            return false
        }
        //记录不一样的索引
        val list = ArrayList<Int>()
        for (i in s.indices) {
            if (s[i] != goal[i]) list.add(i)
        }
        if (list.size != 2) {
            return false
        }
        return s[list[0]] == goal[list[1]] && s[list[1]] == goal[list[0]]
    }

}