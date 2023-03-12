package base

/**
 *
 * @author lin
 * @date 2023/03/12/21:51
 */
abstract class LeetcodeBaseTest<EXAMPLE, RESULT> {

    /**
     * 调用测试方法
     */
    abstract fun methodTest(example: List<EXAMPLE>, method: (x: EXAMPLE) -> RESULT)

    /**
     * 获取范例的方法
     */
    abstract fun getExample(): List<EXAMPLE>

}