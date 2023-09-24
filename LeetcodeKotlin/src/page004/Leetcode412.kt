package page004

/**
 *
 * ��Ŀ: Fizz Buzz
 *
 * ����: ����һ������ n ���ҳ��� 1 �� n ���������� Fizz Buzz ��ʾ�������ַ������� answer���±�� 1 ��ʼ�����ؽ�������У�
 *          answer[i] == "FizzBuzz" ��� i ͬʱ�� 3 �� 5 �ı�����
 *          answer[i] == "Fizz" ��� i �� 3 �ı�����
 *          answer[i] == "Buzz" ��� i �� 5 �ı�����
 *          answer[i] == i �����ַ�����ʽ�������������ȫ�����㡣
 * ����: 1 <= n <= 104
 *
 * ����: https://leetcode.cn/problems/fizz-buzz/description/
 *
 */
class Leetcode412 {

    /**
     * ģ��
     * ʱ�� 180ms
     * �ڴ� 35.99MB
     */
    fun fizzBuzz(n: Int): List<String> {
        val answer = ArrayList<String>()
        for (i in 1..n) {
            if (i % 15 == 0) {
                answer.add("FizzBuzz")
            } else if (i % 3 == 0) {
                answer.add("Fizz")
            } else if (i % 5 == 0) {
                answer.add("Buzz")
            } else {
                answer.add(i.toString())
            }
        }
        return answer
    }

}