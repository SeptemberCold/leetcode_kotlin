package base

abstract class LeetcodeBaseTest2<EXAMPLE, RESULT> : LeetcodeBaseTest<EXAMPLE, RESULT>() {


    override fun methodTest(example: List<EXAMPLE>, method: (x: EXAMPLE) -> RESULT) {
        example.forEach {
            val result = method(it)
            println(" ‰»Î:x=${it}")
            println(" ‰≥ˆ:${result}")
            println("====================")
        }
    }


}