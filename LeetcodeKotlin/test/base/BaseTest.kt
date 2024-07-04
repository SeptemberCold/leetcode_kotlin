package base

abstract class BaseTest<EXAMPLE, RESULT> : LeetcodeBaseTest2<EXAMPLE, RESULT>() {


    fun getArrayList() = ArrayList<EXAMPLE>()

    fun test(method: (x: EXAMPLE) -> RESULT) {
        methodTest(getExample()) { return@methodTest method(it) }
    }

}