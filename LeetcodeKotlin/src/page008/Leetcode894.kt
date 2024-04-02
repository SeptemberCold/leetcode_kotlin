package page008

import java.util.ArrayList

/**
 *
 * ��Ŀ: ���п��ܵ��������
 *
 * ����: ����һ������ n �������ҳ����п��ܺ� n ���ڵ�� ������� �������б���ʽ���ء�����ÿ������ÿ���ڵ㶼������� Node.val == 0 ��
 *      �𰸵�ÿ��Ԫ�ض���һ����������ĸ��ڵ㡣����԰� ����˳�� �������յ���������б�
 *      ������� ��һ�������������ÿ���ڵ�ǡ���� 0 �� 2 ���ӽڵ㡣
 *
 * ����: 1 <= n <= 20
 *
 * ����: https://leetcode.cn/problems/all-possible-full-binary-trees/description/
 *
 */
class Leetcode894 {

    /**
     * �ֿ��ݹ�
     * ʱ�䣺256ms
     * �ڴ棺47.27MB
     */
    fun allPossibleFBT(n: Int): List<TreeNode> {
        //ż��û���������� ����null
        if (n and 1 != 1) return arrayListOf()
        //�ݹ�
        if (n != 1) {
            val trees = ArrayList<TreeNode>()
            for (i in 1..n - 2) {
                val leftTrees = allPossibleFBT(i)
                val rightTrees = allPossibleFBT(n - 1 - i)

                for (leftTree in leftTrees) {
                    for (rightTree in rightTrees) {
                        val treeNode = TreeNode()
                        treeNode.left = leftTree
                        treeNode.right = rightTree
                        trees.add(treeNode)
                    }
                }
            }
            return trees
        }
        return arrayListOf(TreeNode())
    }


    data class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}