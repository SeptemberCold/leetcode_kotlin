package base

/**
 *
 * @author lin
 * @date 2023/03/12/21:51
 */
abstract class LeetcodeBaseTest<EXAMPLE, RESULT> {

//    @JvmStatic
//    fun main(args: Array<String>) {
//        val example = getExample()
//        methodTest(example) { return@methodTest  }
//    }

    /**
     * ���ò��Է���
     */
    abstract fun methodTest(example: List<EXAMPLE>, method: (x: EXAMPLE) -> RESULT)

//    private fun methodTest(example: List<Int>, method: (x: Int) -> Boolean) {
//        example.forEach {
//            val result = method(it)
//            println("����:x=${it}")
//            println("���:${result}")
//            println("====================")
//        }
//    }

    /**
     * ��ȡ�����ķ���
     */
    abstract fun getExample(): List<EXAMPLE>

}