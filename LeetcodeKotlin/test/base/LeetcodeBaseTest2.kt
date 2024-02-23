package base

abstract class LeetcodeBaseTest2<EXAMPLE, RESULT> : LeetcodeBaseTest<EXAMPLE, RESULT>() {


    override fun methodTest(example: List<EXAMPLE>, method: (x: EXAMPLE) -> RESULT) {
        example.forEach {
            println("输入:${getInput(it)}")
            //计算
            val result = method(it)
            println("输出:${getOutput(it, result)}")
            println("====================")
        }
    }

    private fun getInput(example: EXAMPLE): String {
        return when (example) {
            is IntArray -> intArrayToString(example)
            is CharArray -> String(example)
            else -> example.toString()
        }
    }

    private fun getOutput(input: EXAMPLE, result: RESULT): String {
        return when (result) {
            is IntArray -> intArrayToString(result)
            is CharArray -> String(result)
            is Unit -> getInput(input)
            else -> result.toString()
        }
    }

    /**
     * int数组转string
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