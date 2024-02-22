package page008

/**
 *
 * 题目: 根据前序和后序遍历构造二叉树
 *
 * 描述: 给定两个整数数组，preorder 和 postorder ，
 *      其中 preorder 是一个具有 无重复 值的二叉树的前序遍历，
 *      postorder 是同一棵树的后序遍历，重构并返回二叉树。
 *      如果存在多个答案，您可以返回其中 任何 一个。
 *
 * 限制: 1 <= preorder.length <= 30
 *      1 <= preorder[i] <= preorder.length
 *      preorder 中所有值都 不同
 *      postorder.length == preorder.length
 *      1 <= postorder[i] <= postorder.length
 *      postorder 中所有值都 不同
 *      保证 preorder 和 postorder 是同一棵二叉树的前序遍历和后序遍历
 *
 * 链接: https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal/description/?envType=daily-question&envId=2024-02-22
 *
 */
class Leetcode889 {

    /**
     * 递归
     * 用时：212ms
     * 内存：37.21MB
     */
    fun constructFromPrePost(preorder: IntArray, postorder: IntArray): TreeNode {
        //转成集合
        val preorderList = preorder.toMutableList()
        val postorderList = postorder.toMutableList()
        //计算
        return mConstructFromPrePost(preorderList, postorderList)
    }

    private fun mConstructFromPrePost(preorder: MutableList<Int>, postorder: MutableList<Int>): TreeNode {
        //构造根节点
        val root = TreeNode(preorder[0])
        //直接返回节点
        if (preorder.size == 1) {
            return root
        }

        //根据先序遍历的规律 第二位是左节点 [根节点,[左子树的先序遍历],[右子树的先序遍历结果]]
        //根据后序遍历的规律 倒数第二位是右节点 [[左子树的后序遍历],[右子树的后序遍历],根节点]
        //如果left==right 表示没有左节点或者没有右节点 默认当成没有右节点
        val left = preorder[1]

        //这是左子树的长度
        val leftLen = postorder.indexOf(left) + 1
        //获取左子树的前序遍历
        val leftPreorder = preorder.subList(1, 1 + leftLen)
        //获取右子树的前序遍历
        val rightPreorder = if (leftLen + 1 < preorder.size) {
            preorder.subList(leftLen + 1, preorder.size)
        } else null

        //获取左子树的后序遍历
        val leftPostorder = postorder.subList(0, leftLen)
        val rightPostorder = if (leftLen < postorder.size) {
            postorder.subList(leftLen, postorder.size - 1)
        } else null

        //构造左节点
        root.left = mConstructFromPrePost(leftPreorder, leftPostorder)
        //构造右节点
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