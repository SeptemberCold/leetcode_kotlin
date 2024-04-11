package page003

import base.BaseTest

object LeetcodeTest322 : BaseTest<LeetcodeTest322.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode322().coinChange(it.coins, it.amount) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(1, 2, 5), 11))
        }
    }


    data class Data(val coins: IntArray, val amount: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!coins.contentEquals(other.coins)) return false
            return amount == other.amount
        }

        override fun hashCode(): Int {
            var result = coins.contentHashCode()
            result = 31 * result + amount
            return result
        }
    }


}