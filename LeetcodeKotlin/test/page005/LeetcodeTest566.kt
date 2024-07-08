package page005

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest566 : BaseTest<LeetcodeTest566.Data, Array<IntArray>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode566().matrixReshape(it.mat, it.r, it.c) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
//            it.add(Data(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 1, 4))
            it.add(Data(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 4, 1))
        }
    }


    class Data(val mat: Array<IntArray>, val r: Int, val c: Int)

}