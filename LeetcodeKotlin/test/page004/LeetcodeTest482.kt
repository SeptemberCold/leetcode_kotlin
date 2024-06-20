package page004

import base.BaseTest


object LeetcodeTest482 : BaseTest<LeetcodeTest482.Data, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode482().licenseKeyFormatting(it.s, it.k) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("5F3Z-2e-9-w", 4))
            it.add(Data("2-5g-3-J", 2))
            it.add(Data("---", 2))
        }
    }

    data class Data(val s: String, val k: Int)


}