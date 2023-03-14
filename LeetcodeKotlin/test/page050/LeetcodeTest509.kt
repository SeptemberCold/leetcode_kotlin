package page050

import base.LeetcodeBaseTest2

object LeetcodeTest509 : LeetcodeBaseTest2<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode509.fib(it) }
    }

    override fun getExample(): List<Int> {
        val example = ArrayList<Int>()
        for (i in 0..30) {
            example.add(i)
        }
        return example
    }
}