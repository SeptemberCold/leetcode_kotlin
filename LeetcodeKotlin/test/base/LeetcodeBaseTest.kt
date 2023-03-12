package base

/**
 *
 * @author lin
 * @date 2023/03/12/21:51
 */
abstract class LeetcodeBaseTest<EXAMPLE, RESULT> {

    /**
     * ���ò��Է���
     */
    abstract fun methodTest(example: List<EXAMPLE>, method: (x: EXAMPLE) -> RESULT)

    /**
     * ��ȡ�����ķ���
     */
    abstract fun getExample(): List<EXAMPLE>

}