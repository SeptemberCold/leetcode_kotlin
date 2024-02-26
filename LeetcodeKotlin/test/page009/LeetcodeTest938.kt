package page009

import base.BaseTest

object LeetcodeTest938 : BaseTest<LeetcodeTest938.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode938().rangeSumBST(it.root, it.low, it.high) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(Leetcode938.TreeNode(10).also { root ->
                root.left = Leetcode938.TreeNode(5)
                root.right = Leetcode938.TreeNode(15)
                root.left?.left = Leetcode938.TreeNode(3)
                root.left?.right = Leetcode938.TreeNode(7)
                root.right?.right = Leetcode938.TreeNode(18)
            }, 7, 15))
        }
    }

    data class Data(val root: Leetcode938.TreeNode, val low: Int, val high: Int)

}