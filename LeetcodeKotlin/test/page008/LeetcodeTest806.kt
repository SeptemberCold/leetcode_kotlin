package page008

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest806 : BaseTest<LeetcodeTest806.Data, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode806().numberOfLines(it.widths, it.s) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10), "bbbcccdddaaa"))
        }
    }

    class Data(val widths: IntArray, val s: String)

}