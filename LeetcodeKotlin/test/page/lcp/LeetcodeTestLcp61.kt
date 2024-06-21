package page.lcp

import base.BaseTest


object LeetcodeTestLcp61 : BaseTest<LeetcodeTestLcp61.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest LeetcodeLcp61().temperatureTrend(it.temperatureA, it.temperatureB) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(21, 18, 18, 18, 31), intArrayOf(34, 32, 16, 16, 17)))
        }
    }


    data class Data(val temperatureA: IntArray, val temperatureB: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!temperatureA.contentEquals(other.temperatureA)) return false
            return temperatureB.contentEquals(other.temperatureB)
        }

        override fun hashCode(): Int {
            var result = temperatureA.contentHashCode()
            result = 31 * result + temperatureB.contentHashCode()
            return result
        }
    }

}