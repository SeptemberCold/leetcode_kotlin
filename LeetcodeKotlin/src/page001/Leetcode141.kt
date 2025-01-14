package page001

/**
 *
 * 题目: 环形链表
 *
 * 描述: 给你一个链表的头节点 head ，判断链表中是否有环。
 *      如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 *      为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 *      注意：pos 不作为参数进行传递。仅仅是为了标识链表的实际情况。
 *      如果链表中存在环，则返回 true 。 否则，返回 false 。
 * 限制: 链表中节点的数目范围是 [0, 104]
 *      -105 <= Node.val <= 105
 *      pos 为 -1 或者链表中的一个 有效索引 。
 *
 * 链接: https://leetcode.cn/problems/linked-list-cycle/
 *
 */
class Leetcode141 {

    /**
     * 双指针
     * 执行用时：208 ms
     * 内存消耗：36.3 MB
     */
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false
        if (head.next == null) return false
        var temp = head
        var temp2 = head
        while (temp != null && temp2 != null) {
            temp = temp.next
            temp2 = temp2.next?.next
            if (temp == temp2) return true
        }
        return false
    }


    class ListNode {
        var next: ListNode? = null
    }


}