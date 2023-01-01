package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/01/01/22:48
 *
 * ���������ǿ� ��������ʾ�����Ǹ�������������ÿλ���ֶ��ǰ�������ķ�ʽ�洢�ģ�
 * ����ÿ���ڵ�ֻ�ܴ洢һλ���֡����㽫��������ӣ�������ͬ��ʽ����һ����ʾ�͵�����
 * ����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��
 *
 */
object Leetcode002 {

    /**
     * ִ����ʱ��204 ms
     * �ڴ����ģ�41.5 MB
     */
    private fun addTwoNumbers01(l1: ListNode?, l2: ListNode?): ListNode? {
        //��������
        var temp1 = l1
        var temp2 = l2
        //��ʮ��һ
        var i = 0
        while (temp1 != null) {
            //���ݶ�������Ľڵ� �������
            if (temp2 != null) {
                temp1.`val` = temp1.`val` + temp2.`val` + i
            } else {
                temp1.`val` = temp1.`val` + i
            }
            //��ʮ��һ����
            if (temp1.`val` >= 10) {
                temp1.`val` = temp1.`val` - 10
                i = 1
            } else {
                i = 0
            }
            //���һ���������һ���ڵ���ˣ�����ʮ��һ��û�м���
            //���һ���������һ���ڵ���ˣ���������������һ���ڵ�
            //�����������������һ����������һ���µĽڵ�
            if ((temp1.next == null && i == 1) || (temp1.next == null && temp2?.next != null)) {
                temp1.next = ListNode(0)
                temp1 = temp1.next
            } else {
                temp1 = temp1.next
            }
            temp2 = temp2?.next
        }
        return l1
    }

    /**
     * �ݹ鷽ʽ
     * ִ����ʱ��200 ms
     * �ڴ����ģ�40.5 MB
     */
    private fun addTwoNumbers02(l1: ListNode?, l2: ListNode?): ListNode? {
        //���������ǿյ� ����null ���ڽ����ݹ�
        if (l1 == null && l2 == null) return null
        //���渳ֵ kotlin���ܶԲ���ֱ�Ӳ���
        var temp1 = l1
        var temp2 = l2
        //����������Ȳ����Ͳ���
        if (temp1 == null) temp1 = ListNode(0)
        if (temp2 == null) temp2 = ListNode(0)
        //��������֮��
        val `val` = temp1.`val` + temp2.`val`
        //����ʮֱ�Ӽӵ�������һ���ڵ�
        if (`val` >= 10) {
            if (temp1.next == null) temp1.next = ListNode(0)
            temp1.next!!.`val` = temp1.next!!.`val` + 1
        }
        //�������õ���ֵ������10�ͼ�10
        val listNode = ListNode(if (`val` >= 10) `val` - 10 else `val`)
        //��һ���ڵ�ĵݹ�
        listNode.next = addTwoNumbers02(temp1.next, temp2.next)
        return listNode
    }


    /**
     * ����
     */
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


    @JvmStatic
    fun main(args: Array<String>) {
        val testData = getTestData()
        println("����һ��ʼ->${System.currentTimeMillis()}")
        for (index in testData.indices) {
            if (index % 2 != 0) continue
            if (index + 1 > testData.size - 1) break
            var result = addTwoNumbers01(testData[index], testData[index + 1])
            var str = ""
            while (result != null) {
                str += result.`val`
                result = result.next
            }
            println(str)
            println("��ʱ:${index + 1}->${System.currentTimeMillis()}")
        }
        println("��������ʼ->${System.currentTimeMillis()}")
        for (index in testData.indices) {
            if (index % 2 != 0) continue
            if (index + 1 > testData.size - 1) break
            var result = addTwoNumbers02(testData[index], testData[index + 1])
            var str = ""
            while (result != null) {
                str += result.`val`
                result = result.next
            }
            println(str)
            println("��ʱ:${index + 1}->${System.currentTimeMillis()}")
        }

    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): List<ListNode> {
        val data = ArrayList<ListNode>()
        data.add(getTestData(intArrayOf(2, 2, 2)))
        data.add(getTestData(intArrayOf(2, 2, 2, 2)))
        data.add(getTestData(intArrayOf(9, 9, 9, 9, 9, 9, 9)))
        data.add(getTestData(intArrayOf(9, 9, 9, 9)))
        return data
    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(array: IntArray): ListNode {
        val node = ListNode(0)
        var temp = node
        for (i in array.indices) {
            temp.`val` = array[i]
            if (i == array.size - 1) break
            temp.next = ListNode(0)
            temp = temp.next!!
        }
        return node
    }


}