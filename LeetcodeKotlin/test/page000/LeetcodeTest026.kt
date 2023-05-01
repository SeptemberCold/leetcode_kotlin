package page000

import base.BaseTest

object LeetcodeTest026 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        //��Ҫ��ȫ������Ҫͨ�����Բſ��� ��Ϊ���Ҫ���������ж����
        methodTest(example) { return@methodTest Leetcode026().removeDuplicates(it) }
    }

    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(1, 1, 2))
        example.add(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
        return example
    }
}