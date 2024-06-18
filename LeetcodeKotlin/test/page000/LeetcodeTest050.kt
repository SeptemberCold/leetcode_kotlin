package page000

import base.BaseTest


object LeetcodeTest050 : BaseTest<LeetcodeTest050.Data, Double>() {

    data class Data(val x: Double, val n: Int)

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode050().myPow(it.x, it.n) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(2.0, 10))
            it.add(Data(2.1, 3))
            it.add(Data(2.0, -2))
            it.add(Data(1.0, -2147483648))
        }
    }

}