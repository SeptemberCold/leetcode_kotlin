package page008

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest819 : BaseTest<LeetcodeTest819.Data, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode819().mostCommonWord(it.paragraph, it.banned) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("Bob hit a ball, the hit BALL flew far after it was hit.", arrayOf("hit")))
        }
    }

    class Data(val paragraph: String, val banned: Array<String>)

}