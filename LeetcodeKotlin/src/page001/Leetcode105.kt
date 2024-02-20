package page001

/**
 *
 * ��Ŀ: ��ǰ��������������й��������
 *
 * ����: ���������������� preorder �� inorder ��
 *      ���� preorder �Ƕ����������������
 *      inorder ��ͬһ����������������빹�����������������ڵ㡣
 * ����: 1 <= preorder.length <= 3000
 *      inorder.length == preorder.length
 *      -3000 <= preorder[i], inorder[i] <= 3000
 *      preorder �� inorder �� ���ظ� Ԫ��
 *      inorder �������� preorder
 *      preorder ��֤ Ϊ��������ǰ���������
 *      inorder ��֤ Ϊ�������������������
 *
 * ����: https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/?envType=daily-question&envId=2024-02-20
 *
 */
class Leetcode105 {

    private lateinit var map: HashMap<Int, Int>

    /**
     * �ݹ�
     * ��ʱ��247ms
     * �ڴ棺37.20MB
     */
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode {
        map = HashMap()
        for (index in inorder.indices) {
            map[inorder[index]] = index
        }
        val preorderList = preorder.toMutableList()
        val inorderList = inorder.toMutableList()
        return mBuiltTree(preorderList, inorderList)
    }


    private fun mBuiltTree(preorder: MutableList<Int>, inorder: MutableList<Int>): TreeNode {
        //ֻ��һ������ֱ�ӹ��췵��
        if (preorder.size == 1) {
            return TreeNode(preorder[0])
        }

        //������������Ĺ��� ��λ�Ǹ��ڵ�
        val value = preorder[0]

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

        //��������Ĺ�����[���ڵ�,[��������ǰ��������],[��������ǰ��������]]
        //��ȡ�������������������
        val leftPreorder = if (leftInorder != null) {
            preorder.subList(1, 1 + leftInorder.size)
        } else null
        //��ȡ�������������������
        val rightPreorder = if (rightInorder != null) {
            preorder.subList(preorder.size - rightInorder.size, preorder.size)
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