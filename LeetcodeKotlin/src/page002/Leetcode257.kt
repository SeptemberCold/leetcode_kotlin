package page002

import java.lang.StringBuilder

/**
 *
 * ��Ŀ: ������������·��
 *
 * ����: ����һ���������ĸ��ڵ� root ���� ����˳�� ���������дӸ��ڵ㵽Ҷ�ӽڵ��·����
 *      Ҷ�ӽڵ� ��ָû���ӽڵ�Ľڵ㡣
 *
 * ����: ���нڵ����Ŀ�ڷ�Χ [1, 100] ��
 *      -100 <= Node.val <= 100
 *
 * ����: https://leetcode.cn/problems/binary-tree-paths/description/
 *
 */
class Leetcode257 {

    /**
     * ջ �����������
     * ʱ�䣺194ms
     * �ڴ棺35.4MB
     */
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val answer = ArrayList<String>()
        if (root == null) return answer
        //arraylist��ջ��
        val stack = ArrayList<TreeNode>()
        stack.add(root)
        //������¼��
        val hashMap = HashMap<TreeNode, Int>()
        while (stack.isNotEmpty()) {
            val treeNode = stack[stack.size - 1]
            //Ҷ�ӽڵ㴦��
            if (treeNode.left == null && treeNode.right == null) {
                val sb = StringBuilder()
                sb.append(stack[0].`val`)
                for (i in 1 until stack.size) {
                    sb.append("->").append(stack[i].`val`)
                }
                answer.add(sb.toString())
                //Ҷ�ӽڵ㵯��
                stack.remove(treeNode)
                continue
            }
            //δ���ʹ��Ľڵ�
            if (hashMap[treeNode] == null) {
                //��ڵ㲻Ϊ�� ����ջ��
                if (treeNode.left != null) {
                    stack.add(treeNode.left!!)
                }
                hashMap[treeNode] = 1
                continue
            }
            //���ʹ�һ�εĽڵ�
            if (hashMap[treeNode] == 1) {
                //�ҽڵ㲻Ϊ�� ����ջ��
                if (treeNode.right != null) {
                    stack.add(treeNode.right!!)
                }
                hashMap[treeNode] = 2
                continue
            }
            //���ʹ����εĽڵ� ����
            if (hashMap[treeNode] == 2) {
                stack.remove(treeNode)
            }
        }
        return answer
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}