package page000

import base.LeetcodeBaseTest

/**
 *
 * @author lin
 * @date 2023/03/12/21:46
 */
object LeetcodeTest070 : LeetcodeBaseTest<Int, Int>() {


    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode070.climbStairs(it) }
    }

    override fun methodTest(example: List<Int>, method: (x: Int) -> Int) {
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