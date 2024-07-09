package page007

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest771 : BaseTest<LeetcodeTest771.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode771().numJewelsInStones(it.jewels, it.stones) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("aA", "aAAbbbb"))
        }
    }

    class Data(val jewels: String, val stones: String)

}