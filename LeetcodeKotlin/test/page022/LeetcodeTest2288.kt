package page022

import base.BaseTest


object LeetcodeTest2288 : BaseTest<LeetcodeTest2288.Data, String>() {

    data class Data(val sentence: String, val discount: Int)

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2288().discountPrices(it.sentence, it.discount) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("there are $1 $2 and 5$ candies in the shop", 50))
            it.add(Data("1 2 $3 4 $5 $6 7 8$ $9 $10$", 100))
        }
    }

}