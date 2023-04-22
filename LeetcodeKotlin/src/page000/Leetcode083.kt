package page000

/**
 *
 * 题目: 删除排序链表中的重复元素
 *
 * 描述: 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 * 限制: 链表中节点数目在范围 [0, 300] 内
 *      -100 <= Node.val <= 100
 *      题目数据保证链表已经按升序 排列
 *
 * 链接: https://leetcode.cn/problems/remove-duplicates-from-sorted-list/
 *
 */
class Leetcode083 {

    /**
     * 模拟
     * 执行用时：168 ms
     * 内存消耗：34.5 MB
     */
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null
        var mhead = head
        var mtemp = head.next
        while (mtemp != null && mhead != null) {
            if (mhead.`val` == mtemp.`val`) {
                mhead.next = mtemp.next
                mtemp = mtemp.next
            }else{
                mhead = mtemp
                mtemp = mtemp.next
            }
        }
        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


}