package page024

import base.BaseTest


object LeetcodeTest2446 : BaseTest<LeetcodeTest2446.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode2446.haveConflict(it.event1, it.event2) }
    }

    class Data(val event1: Array<String>, val event2: Array<String>)

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data(arrayOf("01:15", "02:00"), arrayOf("02:00", "03:00")))
        example.add(Data(arrayOf("01:00", "02:00"), arrayOf("01:20", "03:00")))
        example.add(Data(arrayOf("10:00", "11:00"), arrayOf("14:00", "15:00")))
        return example
    }
}