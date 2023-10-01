package page001

/**
 *
 * 题目: 相交链表
 *
 * 描述: 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 *        图示两个链表在节点 c1 开始相交：
 *      题目数据 保证 整个链式结构中不存在环。
 *      注意，函数返回结果后，链表必须 保持其原始结构 。
 *      自定义评测：
 *      评测系统 的输入如下（你设计的程序 不适用 此输入）：
 *          intersectVal - 相交的起始节点的值。如果不存在相交节点，这一值为 0
 *          listA - 第一个链表
 *          listB - 第二个链表
 *          skipA - 在 listA 中（从头节点开始）跳到交叉节点的节点数
 *          skipB - 在 listB 中（从头节点开始）跳到交叉节点的节点数
 *          评测系统将根据这些输入创建链式数据结构，并将两个头节点 headA 和 headB 传递给你的程序。如果程序能够正确返回相交节点，那么你的解决方案将被 视作正确答案 。
 * 限制: listA 中节点数目为 m
 *      listB 中节点数目为 n
 *      1 <= m, n <= 3 * 104
 *      1 <= Node.val <= 105
 *      0 <= skipA <= m
 *      0 <= skipB <= n
 *      如果 listA 和 listB 没有交点，intersectVal 为 0
 *      如果 listA 和 listB 有交点，intersectVal == listA[skipA] == listB[skipB]
 *
 * 链接: https://leetcode.cn/problems/intersection-of-two-linked-lists/description/
 *
 */
class Leetcode160 {

    /**
     * 哈希表
     * 时间 160ms
     * 内存 37.20MB
     */
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        val hashMap = HashMap<ListNode, Int>()

        var headATemp = headA
        while (headATemp != null) {
            hashMap[headATemp] = 1
            headATemp = headATemp.next
        }
        var headBTemp = headB
        while (headBTemp != null) {
            if (hashMap.containsKey(headBTemp)) return headBTemp
            headBTemp = headBTemp.next
        }
        return null
    }


    data class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


}