package page000

/**
 *
 * ��Ŀ: ɾ�����������е��ظ�Ԫ��
 *
 * ����: ����һ��������������ͷ head �� ɾ�������ظ���Ԫ�أ�ʹÿ��Ԫ��ֻ����һ�� ������ ����������� ��
 * ����: �����нڵ���Ŀ�ڷ�Χ [0, 300] ��
 *      -100 <= Node.val <= 100
 *      ��Ŀ���ݱ�֤�����Ѿ������� ����
 *
 * ����: https://leetcode.cn/problems/remove-duplicates-from-sorted-list/
 *
 */
class Leetcode083 {

    /**
     * ģ��
     * ִ����ʱ��168 ms
     * �ڴ����ģ�34.5 MB
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