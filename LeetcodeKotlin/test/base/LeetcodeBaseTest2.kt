package base

abstract class LeetcodeBaseTest2<EXAMPLE, RESULT> : LeetcodeBaseTest<EXAMPLE, RESULT>() {


    override fun methodTest(example: List<EXAMPLE>, method: (x: EXAMPLE) -> RESULT) {
        example.forEach {
            val result = method(it)
            println("����:x=${it}")
            println("���:${result}")
            println("====================")
        }
    }


}