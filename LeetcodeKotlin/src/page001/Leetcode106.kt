package page001

/**
 *
 * ��Ŀ: �����������������й��������
 *
 * ����: ���������������� inorder �� postorder ��
 *      ���� inorder �Ƕ����������������
 *      postorder ��ͬһ�����ĺ�����������㹹�첢������� ������ ��
 * ����: 1 <= inorder.length <= 3000
 *      postorder.length == inorder.length
 *      -3000 <= inorder[i], postorder[i] <= 3000
 *      inorder �� postorder ���� ��ͬ ��ֵ���
 *      postorder ��ÿһ��ֵ���� inorder ��
 *      inorder ��֤�������������
 *      postorder ��֤�����ĺ������
 *
 * ����: https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/?envType=daily-question&envId=2024-02-21
 *
 */
class Leetcode106 {

    /**
     * �ݹ�
     * ��ʱ��331ms
     * �ڴ棺49.50MB
     */
    fun buildTree(inorder: IntArray, preorder: IntArray): TreeNode {
        val preorderList = preorder.toMutableList()
        val inorderList = inorder.toMutableList()
        return mBuiltTree(preorderList, inorderList)
    }


    private fun mBuiltTree(preorder: MutableList<Int>, inorder: MutableList<Int>): TreeNode {
        //ֻ��һ������ֱ�ӹ��췵��
        if (preorder.size == 1) {
            return TreeNode(preorder[0])
        }

        //���ݺ�������Ĺ��� ĩλ�Ǹ��ڵ�
        //��������Ĺ�����[[�������ĺ���������],[�������ĺ���������],���ڵ�]
        val value = preorder[preorder.size - 1]

        //������������ҵ����ڵ�λ�� ����������������� �ұ���������������
        //[ [������������������], ���ڵ�, [������������������] ]
        val index = inorder.indexOf(value)
        //��ȡ�������������������
        val leftInorder = if (index != 0) {
            inorder.subList(0, index)
        } else null
        //��ȡ�������������������
        val rightInorder = if (index != inorder.size - 1) {
            inorder.subList(index + 1, inorder.size)
        } else null

        //��ȡ�������ĺ����������
        val leftPreorder = if (leftInorder != null) {
            preorder.subList(0, leftInorder.size)
        } else null
        //��ȡ�������ĺ����������
        val rightPreorder = if (rightInorder != null) {
            preorder.subList(preorder.size - rightInorder.size - 1, preorder.size - 1)
        } else null

        //�����ӽڵ�
        val root = TreeNode(value)
        root.left = if (leftInorder == null || leftPreorder == null) {
            null
        } else mBuiltTree(leftPreorder, leftInorder)
        root.right = if (rightPreorder == null || rightInorder == null) {
            null
        } else mBuiltTree(rightPreorder, rightInorder)

        return root
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}