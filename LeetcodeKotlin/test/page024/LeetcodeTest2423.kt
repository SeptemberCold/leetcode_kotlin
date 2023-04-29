package page024

import base.BaseTest


object LeetcodeTest2423 : BaseTest<String, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) {
            return@methodTest Leetcode2423().equalFrequency(it)
        }
    }


    override fun getExample(): List<String> {
        val example = ArrayList<String>()
//        example.add("abcc")
//        example.add("aazz")
//        example.add("bac")
//        example.add("cccd")
//        example.add("aaaabbbbccc")
        example.add("ceeeec")
        return example
    }
}