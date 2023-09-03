package page000

/**
 *
 * ��Ŀ: �ϲ�������������
 *
 * ����: ��������������ϲ�Ϊһ���µ� ���� �������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ�
 * ����: ��������Ľڵ���Ŀ��Χ�� [0, 50]
 *      -100 <= Node.val <= 100
 *      l1 �� l2 ���� �ǵݼ�˳�� ����
 *
 * ����: https://leetcode.cn/problems/merge-two-sorted-lists/description/
 *
 */
class Leetcode021 {

    /**
     * ����
     * ʱ�� 164ms
     * �ڴ� 33.79MB
     */
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        //�ǿռ��
        if (list1 == null) return list2
        if (list2 == null) return list1
        //�����������
        var temp1 = if (list1.`val` < list2.`val`) list1 else list2
        var temp2: ListNode? = if (list1.`val` < list2.`val`) list2 else list1

        while (true) {
            val next1 = temp1.next
            //����Ѿ�����β�� ����ֱ������temp2
            if (next1 == null) {
                temp1.next = temp2
                break
            }
            if (temp2 == null) {
                break
            }

            //���Ӳ���
            if (next1.`val` < temp2.`val`) {
                temp1 = next1
            } else {
                //����ڶ����������һ������
                val temp = temp2.next
                //�Ѳ�������temp2��
                temp1.next = temp2
                temp2.next = next1
                //����ת��
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