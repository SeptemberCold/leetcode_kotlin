package page000

/**
 *
 * ��Ŀ: �������
 *
 * ����: ���������ǿ� ��������ʾ�����Ǹ�������������ÿλ���ֶ��ǰ�������ķ�ʽ�洢�ģ�����ÿ���ڵ�ֻ�ܴ洢һλ���֡�
 *      ���㽫��������ӣ�������ͬ��ʽ����һ����ʾ�͵�����
 *      ����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��
 * ����: ÿ�������еĽڵ����ڷ�Χ [1, 100] ��
 *      0 <= Node.val <= 9
 *      ��Ŀ���ݱ�֤�б��ʾ�����ֲ���ǰ����
 *
 * ����: https://leetcode.cn/problems/add-two-numbers/
 *
 */
class Leetcode002 {

    /**
     * ˫ָ��
     * ִ����ʱ��208 ms
     * �ڴ����ģ�42.5 MB
     */
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        //���ؽ�� ���ڱ��������ͷ��
        val result = ListNode(0)
        //3�����������
        var temp1 = l1
        var temp2 = l2
        var tempResult = result
        //����λ
        var base = 0
        //�����������㶼����ҽ���Ϊ0�Ϳ��Խ���ѭ��
        while (temp1 != null || temp2 != null || base == 1) {
            //����һ���µĽڵ� ���ڴ�ֵ
            tempResult.next = ListNode(0)
            tempResult = tempResult.next!!
            //����������ӵ���ֵ
            val c = (temp1?.`val` ?: 0) + (temp2?.`val` ?: 0) + base
            //10���ƴ���
            if (c >= 10) {
                tempResult.`val` = c % 10
                base = 1
            } else {
                tempResult.`val` = c
                base = 0
            }
            //�����ƶ�һλ
            temp1 = temp1?.next
            temp2 = temp2?.next
        }
        return result.next
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


}