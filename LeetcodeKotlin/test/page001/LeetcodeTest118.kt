package page001

import base.LeetcodeBaseTest


object LeetcodeTest118 : LeetcodeBaseTest<Int, List<List<Int>>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode118.generate(it) }
        println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
        methodTest(example) { return@methodTest Leetcode118.generate2(it) }
    }


    override fun methodTest(example: List<Int>, method: (x: Int) -> List<List<Int>>) {
        example.forEach {
            val isPalindrome = method(it)
            println(" ‰»Î:x=${it}")
            println(" ‰≥ˆ:${isPalindrome}")
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