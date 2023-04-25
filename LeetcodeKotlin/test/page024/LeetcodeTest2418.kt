package page024

import base.BaseTest

object LeetcodeTest2418 : BaseTest<LeetcodeTest2418.Data, Array<String>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) {
            return@methodTest Leetcode2418().sortPeople(it.arrayStr, it.intArray)
        }
    }

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data(arrayOf("Mary", "John", "Emma"), intArrayOf(180, 165, 170)))
        example.add(Data(arrayOf("Alice", "Bob", "Bob"), intArrayOf(155, 185, 150)))
        return example
    }

    class Data(
        val arrayStr: Array<String>, val intArray: IntArray
    )

}