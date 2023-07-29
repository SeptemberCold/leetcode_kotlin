package page001

/**
 *
 * ��Ŀ: ��������
 *
 * ����: ����һ�������ͷ�ڵ� head ���ж��������Ƿ��л���
 *      �����������ĳ���ڵ㣬����ͨ���������� next ָ���ٴε���������д��ڻ���
 *      Ϊ�˱�ʾ���������еĻ�������ϵͳ�ڲ�ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ����
 *      ע�⣺pos ����Ϊ�������д��ݡ�������Ϊ�˱�ʶ�����ʵ�������
 *      ��������д��ڻ����򷵻� true �� ���򣬷��� false ��
 * ����: �����нڵ����Ŀ��Χ�� [0, 104]
 *      -105 <= Node.val <= 105
 *      pos Ϊ -1 ���������е�һ�� ��Ч���� ��
 *
 * ����: https://leetcode.cn/problems/linked-list-cycle/
 *
 */
class Leetcode141 {

    /**
     * ˫ָ��
     * ִ����ʱ��208 ms
     * �ڴ����ģ�36.3 MB
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