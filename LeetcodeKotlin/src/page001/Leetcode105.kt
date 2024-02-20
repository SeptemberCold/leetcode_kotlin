package page001

/**
 *
 * 题目: 从前序与中序遍历序列构造二叉树
 *
 * 描述: 给定两个整数数组 preorder 和 inorder ，
 *      其中 preorder 是二叉树的先序遍历，
 *      inorder 是同一棵树的中序遍历，请构造二叉树并返回其根节点。
 * 限制: 1 <= preorder.length <= 3000
 *      inorder.length == preorder.length
 *      -3000 <= preorder[i], inorder[i] <= 3000
 *      preorder 和 inorder 均 无重复 元素
 *      inorder 均出现在 preorder
 *      preorder 保证 为二叉树的前序遍历序列
 *      inorder 保证 为二叉树的中序遍历序列
 *
 * 链接: https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/?envType=daily-question&envId=2024-02-20
 *
 */
class Leetcode105 {

    private lateinit var map: HashMap<Int, Int>

    /**
     * 递归
     * 用时：247ms
     * 内存：37.20MB
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
        //只有一个参数直接构造返回
        if (preorder.size == 1) {
            return TreeNode(preorder[0])
        }

        //根据先序遍历的规律 首位是根节点
        val value = preorder[0]

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

        //先序遍历的规律是[根节点,[左子树的前序遍历结果],[右子树的前序遍历结果]]
        //获取左子树的先序遍历数据
        val leftPreorder = if (leftInorder != null) {
            preorder.subList(1, 1 + leftInorder.size)
        } else null
        //获取右子树的先序遍历数据
        val rightPreorder = if (rightInorder != null) {
            preorder.subList(preorder.size - rightInorder.size, preorder.size)
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