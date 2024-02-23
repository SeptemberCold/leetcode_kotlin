package page025

import base.BaseTest

object LeetcodeTest2583 : BaseTest<LeetcodeTest2583.Data, Long>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2583().kthLargestLevelSum(it.root, it.k) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(Leetcode2583.TreeNode(5).also { item ->
                item.left = Leetcode2583.TreeNode(8)
                item.right = Leetcode2583.TreeNode(9)

                item.left?.left = Leetcode2583.TreeNode(2)
                item.left?.right = Leetcode2583.TreeNode(1)

                item.right?.left = Leetcode2583.TreeNode(3)
                item.right?.right = Leetcode2583.TreeNode(7)

                item.left?.left?.left = Leetcode2583.TreeNode(4)
                item.left?.left?.left = Leetcode2583.TreeNode(6)
            }, 2))
        }
    }

    data class Data(val root: Leetcode2583.TreeNode?, val k: Int)


}