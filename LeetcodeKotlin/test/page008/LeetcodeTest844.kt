package page008

import base.BaseTest

object LeetcodeTest844 : BaseTest<LeetcodeTest844.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode844().backspaceCompare(it.s, it.t) }
    }

    class Data(val s: String, val t: String)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("ab#c", "ad#c"))
            it.add(Data("ab##", "c#d#"))
            it.add(Data("a#c", "b"))
        }
    }

}