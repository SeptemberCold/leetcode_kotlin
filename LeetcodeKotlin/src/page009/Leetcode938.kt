package page009

import java.util.LinkedList

/**
 *
 * ��Ŀ: �����������ķ�Χ��
 *
 * ����: ���������������ĸ���� root������ֵλ�ڷ�Χ [low, high] ֮������н���ֵ�ĺ͡�
 *
 * ����: ���нڵ���Ŀ�ڷ�Χ [1, 2 * 104] ��
 *      1 <= Node.val <= 105
 *      1 <= low <= high <= 105
 *      ���� Node.val ������ͬ
 *
 * ����: https://leetcode.cn/problems/range-sum-of-bst/description/?envType=daily-question&envId=2024-02-26
 *
 */
class Leetcode938 {

    /**
     * ���е���
     * ��ʱ��333ms
     * �ڴ棺48.25MB
     */
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        //�ǿմ���
        if (root == null) return 0

        var sum = 0
        val queue = LinkedList<TreeNode>()
        queue.add(root)

        while (queue.isNotEmpty()) {
            //����
            val treeNode = queue.pop()
            //�ӽڵ����
            treeNode.left?.let { queue.add(it) }
            treeNode.right?.let { queue.add(it) }
            //�ڵ�����ͳ��
            if (treeNode.`val` in low..high) {
                sum += treeNode.`val`
            }
        }
        return sum
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}