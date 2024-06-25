package page004

import base.BaseTest

object LeetcodeTest451 : BaseTest<String, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode451().frequencySort(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("eert")
            it.add("cccaaa")
        }
    }

}