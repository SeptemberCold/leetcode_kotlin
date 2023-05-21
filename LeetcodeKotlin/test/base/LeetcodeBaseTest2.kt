package base

abstract class LeetcodeBaseTest2<EXAMPLE, RESULT> : LeetcodeBaseTest<EXAMPLE, RESULT>() {


    override fun methodTest(example: List<EXAMPLE>, method: (x: EXAMPLE) -> RESULT) {
        example.forEach {
            val result = method(it)
            if (it is IntArray) {
                println("����:x=${intArrayToString(it)}")
            } else {
                println("����:x=${it}")
            }

            if (result is IntArray) {
                println("���:${intArrayToString(result)}")
            } else {
                println("���:${result}")
            }
            println("====================")
        }
    }

    /**
     * int����תstring
     */
    private fun intArrayToString(intArray: IntArray): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("[")
        for (i in intArray.indices) {
            if (i > 0) {
                stringBuilder.append(",")
            }
            stringBuilder.append(intArray[i])
        }
        stringBuilder.append("]")
        return stringBuilder.toString()
    }


}