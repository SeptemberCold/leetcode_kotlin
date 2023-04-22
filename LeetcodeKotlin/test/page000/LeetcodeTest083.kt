package page000

import base.BaseTest

object LeetcodeTest083 : BaseTest<Leetcode083.ListNode, Leetcode083.ListNode?>() {

    /**
     * 使用调试模式检查吧，不好打印结果
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode083().deleteDuplicates(it) }
    }

    override fun getExample(): List<Leetcode083.ListNode> {
        val example = ArrayList<Leetcode083.ListNode>()
        example.add(getNode(intArrayOf(1, 1, 2)))
        example.add(getNode(intArrayOf(1, 1, 2, 3, 3)))
        return example
    }


    private fun getNode(nums: IntArray): Leetcode083.ListNode {
        val head = Leetcode083.ListNode(nums[0])
        var temp = head
        for (i in 1 until nums.size) {
            temp.next = Leetcode083.ListNode(nums[i])
            temp = temp.next!!
        }
        return head
    }

}