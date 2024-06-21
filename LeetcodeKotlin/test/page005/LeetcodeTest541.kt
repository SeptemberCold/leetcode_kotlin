package page005

import base.BaseTest

object LeetcodeTest541 : BaseTest<LeetcodeTest541.Data, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode541().reverseStr(it.s, it.k) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("abcdefg", 2))
            it.add(Data("abcd", 2))
        }
    }

    data class Data(val s: String, val k: Int)

}