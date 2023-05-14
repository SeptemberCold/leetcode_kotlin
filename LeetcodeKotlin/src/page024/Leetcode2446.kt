package page024

/**
 *
 * 题目: 判断两个事件是否存在冲突
 *
 * 描述: 给你两个字符串数组 event1 和event2，表示发生在同一天的两个闭区间时间段事件，其中：
 *          event1 = [startTime1, endTime1] 且
 *          event2 = [startTime2, endTime2]
 *      事件的时间为有效的 24 小时制且按HH:MM格式给出。
 *      当两个事件存在某个非空的交集时（即，某些时刻是两个事件都包含的），则认为出现 冲突。
 *      如果两个事件之间存在冲突，返回true；否则，返回false 。
 * 限制: event1.length == event2.length == 2.
 *      event1[i].length == event2[i].length == 5
 *      startTime1 <= endTime1
 *      startTime2 <= endTime2
 *      所有事件的时间都按照HH:MM格式给出
 *
 * 链接: https://leetcode.cn/problems/determine-if-two-events-have-conflict/
 *
 */
object Leetcode2446 {


    /**
     * 字典排序
     * 执行用时: 144 ms
     * 内存消耗: 32.8 MB
     */
    fun haveConflict(event1: Array<String>, event2: Array<String>): Boolean {
        return !(event1[1] < event2[0] || event2[1] < event1[0])
    }

}