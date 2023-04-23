package page010

import base.BaseTest

object LeetcodeTest1027 :BaseTest<IntArray,Int>(){

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example){return@methodTest Leetcode1027().longestArithSeqLength(it)}
    }

    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(3,6,9,12))
        example.add(intArrayOf(9,4,7,2,10))
        example.add(intArrayOf(20,1,15,3,10,5,8))
        example.add(intArrayOf(83,20,17,43,52,78,68,45))
        return example
    }
}