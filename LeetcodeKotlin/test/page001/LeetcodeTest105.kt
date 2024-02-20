package page001

import base.BaseTest

object LeetcodeTest105 : BaseTest<LeetcodeTest105.Data, Leetcode105.TreeNode>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode105().buildTree(it.preorder, it.inorder) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7)))
        }
    }


    data class Data(val preorder: IntArray, val inorder: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!preorder.contentEquals(other.preorder)) return false
            return inorder.contentEquals(other.inorder)
        }

        override fun hashCode(): Int {
            var result = preorder.contentHashCode()
            result = 31 * result + inorder.contentHashCode()
            return result
        }

    }

}