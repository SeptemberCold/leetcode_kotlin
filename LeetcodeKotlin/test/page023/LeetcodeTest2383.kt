package page023

import base.LeetcodeBaseTest

object LeetcodeTest2383 : LeetcodeBaseTest<LeetcodeTest2383.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) {
            return@methodTest Leetcode2383.minNumberOfHours(
                it.initialEnergy, it.initialExperience, it.energy, it.experience
            )
        }
    }

    override fun methodTest(example: List<Data>, method: (x: Data) -> Int) {
        example.forEach {
            val result = method(it)
            println(" ‰»Î:x=${it}")
            println(" ‰≥ˆ:${result}")
            println("====================")
        }
    }

    override fun getExample(): List<Data> {
        val examples = ArrayList<Data>()
        examples.add(Data(5, 3, intArrayOf(1, 4, 3, 2), intArrayOf(2, 6, 3, 1)))
        examples.add(Data(2, 4, intArrayOf(1), intArrayOf(3)))
        return examples
    }

    class Data(
        val initialEnergy: Int, val initialExperience: Int, val energy: IntArray, val experience: IntArray
    )

}