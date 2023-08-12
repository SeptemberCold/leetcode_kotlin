package base

abstract class BaseTest<EXAMPLE, RESULT> : LeetcodeBaseTest2<EXAMPLE, RESULT>() {


    fun getArrayList() = ArrayList<EXAMPLE>()

}