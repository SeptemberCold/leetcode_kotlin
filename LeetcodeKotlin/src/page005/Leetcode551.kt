package page005

/**
 *
 * 题目: 学生出勤记录 I
 *
 * 描述: 给你一个字符串 s 表示一个学生的出勤记录，其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符：
 *      'A'：Absent，缺勤
 *      'L'：Late，迟到
 *      'P'：Present，到场
 *      如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励：
 *      按 总出勤 计，学生缺勤（'A'）严格 少于两天。
 *      学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。
 *      如果学生可以获得出勤奖励，返回 true ；否则，返回 false 。
 *
 * 限制: 1 <= s.length <= 1000
 *      s[i] 为 'A'、'L' 或 'P'
 *
 * 链接: https://leetcode.cn/problems/student-attendance-record-i/description/
 *
 */
class Leetcode551 {

    /**
     * 模拟
     * 执行用时：152 ms
     * 内存消耗：33.33 MB
     */
    fun checkRecord(s: String): Boolean {
        var late = false
        var absent = 0
        for (i in s.indices) {
            if (s[i] == 'A') {
                absent += 1
            } else if (s[i] == 'L' && i > 1) {
                if (s[i - 1] == 'L' && s[i - 2] == 'L') {
                    late = true
                }
            }
        }
        return absent < 2 && !late
    }

}