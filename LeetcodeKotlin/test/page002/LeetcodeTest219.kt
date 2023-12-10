package page002

import base.BaseTest

/**
 *
 * 题目:
 *
 * 描述:
 * 限制:
 *
 * 链接:
 *
 */
object LeetcodeTest219 : BaseTest<LeetcodeTest219.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode219().containsNearbyDuplicate(it.nums, it.k) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(1, 2, 3, 1, 2, 3), 2))
        }
    }

    data class Data(val nums: IntArray, val k: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!nums.contentEquals(other.nums)) return false
            if (k != other.k) return false

            return true
        }

        override fun hashCode(): Int {
            var result = nums.contentHashCode()
            result = 31 * result + k
            return result
        }
    }


}