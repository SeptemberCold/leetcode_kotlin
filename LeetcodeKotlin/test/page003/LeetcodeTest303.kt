package page003

import base.BaseTest
import com.sun.glass.ui.Size

object LeetcodeTest303 : BaseTest<LeetcodeTest303.Data, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) {
            val arrayList = ArrayList<Int>()
            val numArray = Leetcode303(it.nums)
            for (i in it.size) {
                val sumRange = numArray.sumRange(i.width, i.height)
                arrayList.add(sumRange)
            }
            return@methodTest arrayList.toIntArray()
        }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(intArrayOf(-2, 0, 3, -5, 2, -1),
                    arrayOf(Size(0, 2), Size(2, 5), Size(0, 5))))
        }
    }

    data class Data(val nums: IntArray, val size: Array<Size>) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!nums.contentEquals(other.nums)) return false
            return size.contentEquals(other.size)
        }

        override fun hashCode(): Int {
            var result = nums.contentHashCode()
            result = 31 * result + size.contentHashCode()
            return result
        }
    }


}