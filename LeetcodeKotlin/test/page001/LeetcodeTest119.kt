package page001

import base.LeetcodeBaseTest

object LeetcodeTest119 : LeetcodeBaseTest<Int, List<Int>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode119.getRow(it) }
    }

    override fun methodTest(example: List<Int>, method: (x: Int) -> List<Int>) {
        example.forEach {
            val result = method(it)
            println(" ‰»Î:x=${it}")
            println(" ‰≥ˆ:${result}")
            println("====================")
        }
    }

    override fun getExample(): List<Int> {
        val example = ArrayList<Int>()
        example.add(2)
        example.add(3)
        example.add(6)
        example.add(8)
        return example
    }
}