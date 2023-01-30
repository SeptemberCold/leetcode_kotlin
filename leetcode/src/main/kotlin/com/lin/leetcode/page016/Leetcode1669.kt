package com.lin.leetcode.page016

/**
 *
 * @author lin
 * @date 2023/01/30/18:30
 *
 * �ϲ���������
 * ������������list1 ��list2�����ǰ�����Ԫ�طֱ�Ϊn ����m ����
 * ���㽫list1���±�� a �� b ��ȫ���ڵ㶼ɾ��������list2���ڱ�ɾ���ڵ��λ�á�
 * ���㷵�ؽ�������ͷָ�롣
 */
object Leetcode1669 {

    /**
     * ִ����ʱ��500 ms
     * �ڴ����ģ�42.8 MB
     */
    private fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        //b+1�Ľڵ�
        var bNode: ListNode? = null
        //���ڱ��浱ǰ�ڵ�
        var node = list1
        //���ڼ�¼�ڵ��±�
        var i = 0
        //�������ڵ����
        while (node != null) {
            //�����һ���ڵ���a ������һ���ڵ����ڼ������� ����һ���ڵ������ָ��list2
            if (i + 1 == a) {
                val temp = node.next
                node.next = list2
                node = temp
                i++
                continue
            }
            //�����ǰ�ڵ���b ������һ���ڵ�
            if (i == b) {
                if (node.next == null) return list1
                bNode = node.next!!
                break
            }
            //���±���
            node = node.next
            i++
        }
        node = list2
        while (node != null) {
            if (node.next == null) {
                node.next = bNode
                break
            }
            node = node.next
        }
        return list1
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            var answer = mergeInBetween(it.list1, it.a, it.b, it.list2)
            while (answer != null) {
                println(answer.`val`)
                answer = answer.next
            }
        }

    }

    private fun getTestData(): List<Data> {
        val data = ArrayList<Data>()
        val array1 = intArrayOf(0, 1, 2, 3, 4, 5)
        val list1 = ListNode(0)
        var node: ListNode? = list1
        for (i in array1) {
            if (node != null) {
                node.`val` = i
            } else {
                node = ListNode(i)
            }
            node = node.next
        }
        val array2 = intArrayOf(1000000, 1000001, 1000002)
        val list2 = ListNode(0)
        node = list2
        for (i in array2) {
            if (node != null) {
                node.`val` = i
            } else {
                node = ListNode(i)
            }
            node = node.next
        }
        data.add(Data(list1, 3, 4, list2))
        return data
    }

    class Data(val list1: ListNode, val a: Int, val b: Int, val list2: ListNode)
}