package page008

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest821 : BaseTest<LeetcodeTest821.Data, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode821().shortestToChar(it.s, it.c) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("loveleetcode", 'c'))
        }
    }


    class Data(val s: String, val c: Char)

}