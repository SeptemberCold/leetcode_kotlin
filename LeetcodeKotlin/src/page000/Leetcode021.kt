package page000

/**
 *
 * 题目: 合并两个有序链表
 *
 * 描述: 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 限制: 两个链表的节点数目范围是 [0, 50]
 *      -100 <= Node.val <= 100
 *      l1 和 l2 均按 非递减顺序 排列
 *
 * 链接: https://leetcode.cn/problems/merge-two-sorted-lists/description/
 *
 */
class Leetcode021 {

    /**
     * 迭代
     * 时间 164ms
     * 内存 33.79MB
     */
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        //非空检查
        if (list1 == null) return list2
        if (list2 == null) return list1
        //缓存对象引用
        var temp1 = if (list1.`val` < list2.`val`) list1 else list2
        var temp2: ListNode? = if (list1.`val` < list2.`val`) list2 else list1

        while (true) {
            val next1 = temp1.next
            //如果已经到结尾了 后面直接连着temp2
            if (next1 == null) {
                temp1.next = temp2
                break
            }
            if (temp2 == null) {
                break
            }

            //连接操作
            if (next1.`val` < temp2.`val`) {
                temp1 = next1
            } else {
                //缓存第二条链表的下一个参数
                val temp = temp2.next
                //把参数插入temp2中
                temp1.next = temp2
                temp2.next = next1
                //变量转移
                temp1 = temp2
                temp2 = temp
            }
        }
        return if (list1.`val` < list2.`val`) list1 else list2
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}