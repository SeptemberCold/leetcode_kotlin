package page005

import base.BaseTest

object LeetcodeTest521 : BaseTest<LeetcodeTest521.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode521().findLUSlength(it.a, it.b) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("aaa", "bbb"))
        }
    }

    data class Data(val a: String, val b: String)


}