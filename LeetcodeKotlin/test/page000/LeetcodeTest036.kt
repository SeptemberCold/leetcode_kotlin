package page000

import base.BaseTest

object LeetcodeTest036 : BaseTest<Array<CharArray>, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode036().isValidSudoku(it) }
    }

    override fun getExample(): List<Array<CharArray>> {
        return getArrayList().also {
//            it.add(
//                    arrayOf(
//                            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
//                            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
//                            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
//                            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
//                            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
//                            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
//                            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
//                            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
//                            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'),
//                    )
//            )
            it.add(
                    arrayOf(
                            charArrayOf('.', '.', '.', '.', '5', '.', '.', '1', '.'),
                            charArrayOf('.', '4', '.', '3', '.', '.', '.', '.', '.'),
                            charArrayOf('.', '.', '.', '.', '.', '3', '.', '.', '1'),
                            charArrayOf('8', '.', '.', '.', '.', '.', '.', '2', '.'),
                            charArrayOf('.', '.', '2', '.', '7', '.', '.', '.', '.'),
                            charArrayOf('.', '1', '5', '.', '.', '.', '.', '.', '.'),
                            charArrayOf('.', '.', '.', '.', '.', '2', '.', '.', '.'),
                            charArrayOf('.', '2', '.', '9', '.', '.', '.', '.', '.'),
                            charArrayOf('.', '.', '4', '.', '.', '.', '.', '.', '.'),
                    )
            )
        }
    }

}