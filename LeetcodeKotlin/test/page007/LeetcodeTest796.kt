package page007

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest796 : BaseTest<LeetcodeTest796.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode796().rotateString(it.s, it.goal) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("abcde", "cdeab"))
        }
    }

    class Data(val s: String, val goal: String)

}