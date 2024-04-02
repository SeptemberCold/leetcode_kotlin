package page028

/**
 *
 * 题目: 故障键盘
 *
 * 描述: 你的笔记本键盘存在故障，每当你在上面输入字符 'i' 时，它会反转你所写的字符串。而输入其他字符则可以正常工作。
 *      给你一个下标从 0 开始的字符串 s ，请你用故障键盘依次输入每个字符。
 *      返回最终笔记本屏幕上输出的字符串。
 *
 * 限制: 1 <= s.length <= 100
 *      s 由小写英文字母组成
 *      s[0] != 'i'
 *
 * 链接: https://leetcode.cn/problems/faulty-keyboard/description/?envType=daily-question&envId=2024-04-01
 *
 */
class Leetcode2810 {

    /**
     * 库函数+模拟
     * 时间：217ms
     * 内存：38.48MB
     */
    fun finalString(s: String): String {
        val split = s.split("i")
        var ans = ""
        for (str in split) {
            ans = ans.reversed()
            ans += str
        }
        return ans
    }


}