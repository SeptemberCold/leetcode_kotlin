package page001

/**
 *
 * ��Ŀ: �ཻ����
 *
 * ����: ���������������ͷ�ڵ� headA �� headB �������ҳ������������������ཻ����ʼ�ڵ㡣����������������ཻ�ڵ㣬���� null ��
 *        ͼʾ���������ڽڵ� c1 ��ʼ�ཻ��
 *      ��Ŀ���� ��֤ ������ʽ�ṹ�в����ڻ���
 *      ע�⣬�������ؽ����������� ������ԭʼ�ṹ ��
 *      �Զ������⣺
 *      ����ϵͳ ���������£�����Ƶĳ��� ������ �����룩��
 *          intersectVal - �ཻ����ʼ�ڵ��ֵ������������ཻ�ڵ㣬��һֵΪ 0
 *          listA - ��һ������
 *          listB - �ڶ�������
 *          skipA - �� listA �У���ͷ�ڵ㿪ʼ����������ڵ�Ľڵ���
 *          skipB - �� listB �У���ͷ�ڵ㿪ʼ����������ڵ�Ľڵ���
 *          ����ϵͳ��������Щ���봴����ʽ���ݽṹ����������ͷ�ڵ� headA �� headB ���ݸ���ĳ�����������ܹ���ȷ�����ཻ�ڵ㣬��ô��Ľ���������� ������ȷ�� ��
 * ����: listA �нڵ���ĿΪ m
 *      listB �нڵ���ĿΪ n
 *      1 <= m, n <= 3 * 104
 *      1 <= Node.val <= 105
 *      0 <= skipA <= m
 *      0 <= skipB <= n
 *      ��� listA �� listB û�н��㣬intersectVal Ϊ 0
 *      ��� listA �� listB �н��㣬intersectVal == listA[skipA] == listB[skipB]
 *
 * ����: https://leetcode.cn/problems/intersection-of-two-linked-lists/description/
 *
 */
class Leetcode160 {

    /**
     * ��ϣ��
     * ʱ�� 160ms
     * �ڴ� 37.20MB
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