package page004

import base.BaseTest


object LeetcodeTest415 : BaseTest<LeetcodeTest415.Data, String>() {

    data class Data(val num1: String, val num2: String)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("11", "123"))
            it.add(Data("456", "77"))
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode415().addStrings(it.num1, it.num2) }
    }

}