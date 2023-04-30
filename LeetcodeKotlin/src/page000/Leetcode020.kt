package page000

/**
 *
 * 题目: 有效的括号
 *
 * 描述: 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 *      有效字符串需满足：
 *          左括号必须用相同类型的右括号闭合。
 *          左括号必须以正确的顺序闭合。
 *          每个右括号都有一个对应的相同类型的左括号。
 *
 * 限制: 1 <= s.length <= 104
 *      s 仅由括号 '()[]{}' 组成
 *
 * 链接: https://leetcode.cn/problems/valid-parentheses/
 *
 */
class Leetcode020 {

    /**
     * 字符串替换
     * 执行用时：276 ms
     * 内存消耗：38.6 MB
     */
    fun isValid(s: String): Boolean {
        var temp = s
        while (true) {
            //将所有括号替换了
            val replace1 = temp.replace("()", "")
            val replace2 = replace1.replace("{}", "")
            val replace3 = replace2.replace("[]", "")
            //判断有没有被替换掉的括号 没有就返回
            if (replace3.length == temp.length) return temp.isEmpty()
            //保存继续下一轮替换
            temp = replace3
        }
    }

}