package page008

/**
 *
 * ��Ŀ: ����ǰ��ͺ���������������
 *
 * ����: ���������������飬preorder �� postorder ��
 *      ���� preorder ��һ������ ���ظ� ֵ�Ķ�������ǰ�������
 *      postorder ��ͬһ�����ĺ���������ع������ض�������
 *      ������ڶ���𰸣������Է������� �κ� һ����
 *
 * ����: 1 <= preorder.length <= 30
 *      1 <= preorder[i] <= preorder.length
 *      preorder ������ֵ�� ��ͬ
 *      postorder.length == preorder.length
 *      1 <= postorder[i] <= postorder.length
 *      postorder ������ֵ�� ��ͬ
 *      ��֤ preorder �� postorder ��ͬһ�ö�������ǰ������ͺ������
 *
 * ����: https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal/description/?envType=daily-question&envId=2024-02-22
 *
 */
class Leetcode889 {

    /**
     * �ݹ�
     * ��ʱ��212ms
     * �ڴ棺37.21MB
     */
    fun constructFromPrePost(preorder: IntArray, postorder: IntArray): TreeNode {
        //ת�ɼ���
        val preorderList = preorder.toMutableList()
        val postorderList = postorder.toMutableList()
        //����
        return mConstructFromPrePost(preorderList, postorderList)
    }

    private fun mConstructFromPrePost(preorder: MutableList<Int>, postorder: MutableList<Int>): TreeNode {
        //������ڵ�
        val root = TreeNode(preorder[0])
        //ֱ�ӷ��ؽڵ�
        if (preorder.size == 1) {
            return root
        }

        //������������Ĺ��� �ڶ�λ����ڵ� [���ڵ�,[���������������],[������������������]]
        //���ݺ�������Ĺ��� �����ڶ�λ���ҽڵ� [[�������ĺ������],[�������ĺ������],���ڵ�]
        //���left==right ��ʾû����ڵ����û���ҽڵ� Ĭ�ϵ���û���ҽڵ�
        val left = preorder[1]

        //�����������ĳ���
        val leftLen = postorder.indexOf(left) + 1
        //��ȡ��������ǰ�����
        val leftPreorder = preorder.subList(1, 1 + leftLen)
        //��ȡ��������ǰ�����
        val rightPreorder = if (leftLen + 1 < preorder.size) {
            preorder.subList(leftLen + 1, preorder.size)
        } else null

        //��ȡ�������ĺ������
        val leftPostorder = postorder.subList(0, leftLen)
        val rightPostorder = if (leftLen < postorder.size) {
            postorder.subList(leftLen, postorder.size - 1)
        } else null

        //������ڵ�
        root.left = mConstructFromPrePost(leftPreorder, leftPostorder)
        //�����ҽڵ�
        root.right = if (rightPostorder != null && rightPreorder != null) {
            mConstructFromPrePost(rightPreorder, rightPostorder)
        } else null

        return root
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}