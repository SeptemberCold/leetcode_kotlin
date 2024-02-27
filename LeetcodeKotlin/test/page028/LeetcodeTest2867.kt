package page028

import base.BaseTest

object LeetcodeTest2867 : BaseTest<LeetcodeTest2867.Data, Long>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2867().countPaths(it.n, it.edges) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(4, arrayOf(intArrayOf(1, 2), intArrayOf(4, 1), intArrayOf(3, 4))))
//            it.add(Data(5, arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 4), intArrayOf(2, 5))))
//            it.add(Data(5, arrayOf(intArrayOf(1, 3), intArrayOf(4, 3), intArrayOf(2, 3), intArrayOf(5, 2))))
        }
    }


    data class Data(val n: Int, val edges: Array<IntArray>) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (n != other.n) return false
            return edges.contentDeepEquals(other.edges)
        }

        override fun hashCode(): Int {
            var result = n
            result = 31 * result + edges.contentDeepHashCode()
            return result
        }
    }


}