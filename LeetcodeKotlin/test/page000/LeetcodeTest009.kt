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
        example.forEach {
            val isPalindrome = Leetcode009.isPalindrome(it)
            println("����:x=${it}")
            println("���:${isPalindrome}")
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