package page008

import base.BaseTest


object LeetcodeTest889 : BaseTest<LeetcodeTest889.Data, Leetcode889.TreeNode>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode889().constructFromPrePost(it.preorder, it.postorder) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
//            it.add(Data(intArrayOf(1, 2, 4, 5, 3, 6, 7), intArrayOf(4, 5, 2, 6, 7, 3, 1)))
            it.add(Data(intArrayOf(1, 2), intArrayOf(2, 1)))
        }
    }

    data class Data(val preorder: IntArray, val postorder: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!preorder.contentEquals(other.preorder)) return false
            return postorder.contentEquals(other.postorder)
        }

        override fun hashCode(): Int {
            var result = preorder.contentHashCode()
            result = 31 * result + postorder.contentHashCode()
            return result
        }

    }

}