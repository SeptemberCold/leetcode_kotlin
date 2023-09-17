package page007

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
object LeetcodeTest748 : BaseTest<LeetcodeTest748.Data, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode748().shortestCompletingWord(it.licensePlate, it.words) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("1s3 PSt", arrayOf("step", "steps", "stripe", "stepple")))
            it.add(Data("1s3 456", arrayOf("looks", "pest", "stew", "show")))
        }
    }

    data class Data(val licensePlate: String, val words: Array<String>) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Data

            if (licensePlate != other.licensePlate) return false
            if (!words.contentEquals(other.words)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = licensePlate.hashCode()
            result = 31 * result + words.contentHashCode()
            return result
        }
    }

}