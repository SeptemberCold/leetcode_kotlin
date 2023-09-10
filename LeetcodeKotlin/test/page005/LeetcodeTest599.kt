package page005

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
object LeetcodeTest599 : BaseTest<LeetcodeTest599.Data, Array<String>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode599().findRestaurant(it.list1, it.list2) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(
                Data(
                    arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
                    arrayOf("Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun")
                )
            )
            it.add(
                Data(
                    arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
                    arrayOf("KFC", "Shogun", "Burger King")
                )
            )
        }
    }

    data class Data(val list1: Array<String>, val list2: Array<String>) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (!list1.contentEquals(other.list1)) return false
            if (!list2.contentEquals(other.list2)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = list1.contentHashCode()
            result = 31 * result + list2.contentHashCode()
            return result
        }
    }


}