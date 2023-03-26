package page024

import base.LeetcodeBaseTest2


object LeetcodeTest2469 : LeetcodeBaseTest2<Double, DoubleArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode2469.convertTemperature(it) }
    }

    override fun getExample(): List<Double> {
        val examples = ArrayList<Double>()
        examples.add(36.5)
        examples.add(12.11)
        return examples
    }
}