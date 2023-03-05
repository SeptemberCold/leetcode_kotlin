package page000

/**
 *
 * ��Ŀ: ������
 *
 * ����: ����һ������ x ����� x ��һ���������������� true �����򣬷��� false ��
 *      ��������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 * ����: -231 <= x <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/palindrome-number/
 */
object LeetcodeTest009 {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode009.isPalindrome(it) }
        methodTest(example) { return@methodTest Leetcode009.isPalindrome2(it) }
        methodTest(example) { return@methodTest Leetcode009.isPalindrome3(it) }
    }

    private fun methodTest(example: List<Int>, method: (x: Int) -> Boolean) {
        example.forEach {
            val isPalindrome = method(it)
            println("����:x=${it}")
            println("���:${isPalindrome}")
            println("====================")
        }
    }

    private fun getExample(): List<Int> {
        val examples = ArrayList<Int>()
        examples.add(121)
        examples.add(-121)
        examples.add(10)
        return examples
    }


}