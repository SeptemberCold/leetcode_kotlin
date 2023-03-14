package page032

import base.LeetcodeBaseTest2

object LeetcodeTest392 : LeetcodeBaseTest2<LeetcodeTest392.Data, Boolean>() {


    class Data(val s: String, val t: String)

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode392.isSubsequence(it.s, it.t) }
        methodTest(example) { return@methodTest Leetcode392.isSubsequence2(it.s, it.t) }
    }

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data("abc", "bahbgdc"))
        example.add(Data("axc", "ahbgdc"))
        return example
    }

}