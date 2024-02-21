package page001

/**
 *
 * 题目: 从中序与后序遍历序列构造二叉树
 *
 * 描述: 给定两个整数数组 inorder 和 postorder ，
 *      其中 inorder 是二叉树的中序遍历，
 *      postorder 是同一棵树的后序遍历，请你构造并返回这颗 二叉树 。
 * 限制: 1 <= inorder.length <= 3000
 *      postorder.length == inorder.length
 *      -3000 <= inorder[i], postorder[i] <= 3000
 *      inorder 和 postorder 都由 不同 的值组成
 *      postorder 中每一个值都在 inorder 中
 *      inorder 保证是树的中序遍历
 *      postorder 保证是树的后序遍历
 *
 * 链接: https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/?envType=daily-question&envId=2024-02-21
 *
 */
class Leetcode106 {

    /**
     * 递归
     * 用时：331ms
     * 内存：49.50MB
     */
    fun buildTree(inorder: IntArray, preorder: IntArray): TreeNode {
        val preorderList = preorder.toMutableList()
        val inorderList = inorder.toMutableList()
        return mBuiltTree(preorderList, inorderList)
    }


    private fun mBuiltTree(preorder: MutableList<Int>, inorder: MutableList<Int>): TreeNode {
        //只有一个参数直接构造返回
        if (preorder.size == 1) {
            return TreeNode(preorder[0])
        }

        //根据后序遍历的规律 末位是根节点
        //后序遍历的规律是[[左子树的后序遍历结果],[右子树的后序遍历结果],根节点]
        val value = preorder[preorder.size - 1]

        //在中序遍历中找到根节点位置 左边是左子树的数据 右边是右子树的数据
        //[ [左子树的中序遍历结果], 根节点, [右子树的中序遍历结果] ]
        val index = inorder.indexOf(value)
        //获取左子树的中序遍历数据
        val leftInorder = if (index != 0) {
            inorder.subList(0, index)
        } else null
        //获取右子树的中序遍历数据
        val rightInorder = if (index != inorder.size - 1) {
            inorder.subList(index + 1, inorder.size)
        } else null

        //获取左子树的后序遍历数据
        val leftPreorder = if (leftInorder != null) {
            preorder.subList(0, leftInorder.size)
        } else null
        //获取右子树的后序遍历数据
        val rightPreorder = if (rightInorder != null) {
            preorder.subList(preorder.size - rightInorder.size - 1, preorder.size - 1)
        } else null

        //构造子节点
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