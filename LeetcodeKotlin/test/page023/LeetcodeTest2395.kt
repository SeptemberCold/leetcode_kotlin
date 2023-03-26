package page023

import base.LeetcodeBaseTest2

object LeetcodeTest2395 : LeetcodeBaseTest2<IntArray, Boolean>() {


    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode2395.findSubarrays(it) }
    }

    override fun getExample(): List<IntArray> {
        val examples = ArrayList<IntArray>()
        examples.add(intArrayOf(4, 2, 4))
        examples.add(intArrayOf(1, 2, 3, 4, 5))
        return examples
    }


}