package page008

import base.BaseTest


object LeetcodeTest859 : BaseTest<LeetcodeTest859.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode859().buddyStrings(it.s, it.goal) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("aa", "aa"))
            it.add(Data("ab", "ab"))
            it.add(Data("ab", "ba"))
            it.add(Data("abc", "bac"))
        }
    }


    class Data(val s: String, val goal: String)

}