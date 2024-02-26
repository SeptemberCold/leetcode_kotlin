package page001

import base.BaseTest

object LeetcodeTest167 : BaseTest<LeetcodeTest167.Data, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode167().twoSum(it.numbers, it.target) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(2, 7, 11, 15), 9))
            it.add(Data(intArrayOf(2, 3, 4), 6))
            it.add(Data(intArrayOf(-1, 0), -1))
        }
    }


    data class Data(val numbers: IntArray, val target: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!numbers.contentEquals(other.numbers)) return false
            return target == other.target
        }

        override fun hashCode(): Int {
            var result = numbers.contentHashCode()
            result = 31 * result + target
            return result
        }
    }

}