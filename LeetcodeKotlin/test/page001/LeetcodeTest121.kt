package page001

import base.LeetcodeBaseTest

object LeetcodeTest121 : LeetcodeBaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode121.maxProfit(it) }
    }

    override fun methodTest(example: List<IntArray>, method: (x: IntArray) -> Int) {
        example.forEach {
            val result = method(it)
            println(" ‰»Î:x=${it}")
            println(" ‰≥ˆ:${result}")
            println("====================")
        }
    }

    override fun getExample(): List<IntArray> {
        val examples = ArrayList<IntArray>()
        examples.add(intArrayOf(7, 1, 5, 3, 6, 4))
        examples.add(intArrayOf(7, 6, 4, 3, 1))
        return examples
    }
}