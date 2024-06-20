package page005

import java.util.Stack

/**
 *
 * ��Ŀ: �����������е�����
 *
 * ����: ����һ�����ظ�ֵ�Ķ�����������BST���ĸ��ڵ� root ���ҳ������� BST �е����� ��������������Ƶ����ߵ�Ԫ�أ���
 *      ��������в�ֹһ�����������԰� ����˳�� ���ء�
 *      �ٶ� BST �������¶��壺
 *      ����������������ڵ��ֵ С�ڵ��� ��ǰ�ڵ��ֵ
 *      ����������������ڵ��ֵ ���ڵ��� ��ǰ�ڵ��ֵ
 *      �����������������Ƕ���������
 *
 * ����: ���нڵ����Ŀ�ڷ�Χ [1, 104] ��
 *      -105 <= Node.val <= 105
 *
 * ����: https://leetcode.cn/problems/find-mode-in-binary-search-tree/description/
 *
 */
class Leetcode501 {

    /**
     * ��ϣ
     * ʱ�� 237ms
     * �ڴ� 40.07MB
     */
    fun findMode(root: TreeNode?): IntArray {
        if (root == null) return intArrayOf()

        var max = 0
        val hashMap = HashMap<Int, Int>()
        //ջ
        val stack = Stack<TreeNode>()
        stack.push(root)
        //�������
        while (stack.isNotEmpty()) {
            val treeNode = stack.pop()
            //��ϣ�洢
            val sum = hashMap[treeNode.`val`] ?: 0
            hashMap[treeNode.`val`] = sum + 1
            max = (sum + 1).coerceAtLeast(max)

            if (treeNode.left != null) {
                stack.push(treeNode.left)
            }
            if (treeNode.right != null) {
                stack.push(treeNode.right)
            }
        }
        val arrayList = ArrayList<Int>()
        for ((key, value) in hashMap) {
            if (value == max) {
                arrayList.add(key)
            }
        }
        return arrayList.toIntArray()
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}