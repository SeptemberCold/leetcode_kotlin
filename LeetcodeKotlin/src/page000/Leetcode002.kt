package page000

/**
 *
 * 题目: 两数相加
 *
 * 描述: 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *      请你将两个数相加，并以相同形式返回一个表示和的链表。
 *      你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 限制: 每个链表中的节点数在范围 [1, 100] 内
 *      0 <= Node.val <= 9
 *      题目数据保证列表表示的数字不含前导零
 *
 * 链接: https://leetcode.cn/problems/add-two-numbers/
 *
 */
class Leetcode002 {

    /**
     * 双指针
     * 执行用时：208 ms
     * 内存消耗：42.5 MB
     */
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        //返回结果 用于保存链表的头部
        val result = ListNode(0)
        //3个链表的索引
        var temp1 = l1
        var temp2 = l2
        var tempResult = result
        //进制位
        var base = 0
        //两条链表都计算都最后且进制为0就可以结束循环
        while (temp1 != null || temp2 != null || base == 1) {
            //生成一个新的节点 用于存值
            tempResult.next = ListNode(0)
            tempResult = tempResult.next!!
            //计算两点相加的总值
            val c = (temp1?.`val` ?: 0) + (temp2?.`val` ?: 0) + base
            //10进制处理
            if (c >= 10) {
                tempResult.`val` = c % 10
                base = 1
            } else {
                tempResult.`val` = c
                base = 0
            }
            //链表移动一位
            temp1 = temp1?.next
            temp2 = temp2?.next
        }
        return result.next
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


}