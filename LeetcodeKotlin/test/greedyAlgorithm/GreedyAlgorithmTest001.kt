package greedyAlgorithm

import base.BaseTest

object GreedyAlgorithmTest001 : BaseTest<GreedyAlgorithmTest001.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest GreedyAlgorithm001.greedyAlgorithm(it.ai, it.bi) }
    }

    class Data(
        val ai: IntArray, val bi: IntArray
    )

    override fun getExample(): List<Data> {
        val examples = ArrayList<Data>()
        examples.add(Data(intArrayOf(1, 2, 7, 10), intArrayOf(1, 3, 5, 9)))
        return examples
    }

}