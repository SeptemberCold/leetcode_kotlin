package page004

/**
 *
 * 题目: Fizz Buzz
 *
 * 描述: 给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
 *          answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
 *          answer[i] == "Fizz" 如果 i 是 3 的倍数。
 *          answer[i] == "Buzz" 如果 i 是 5 的倍数。
 *          answer[i] == i （以字符串形式）如果上述条件全不满足。
 * 限制: 1 <= n <= 104
 *
 * 链接: https://leetcode.cn/problems/fizz-buzz/description/
 *
 */
class Leetcode412 {

    /**
     * 模拟
     * 时间 180ms
     * 内存 35.99MB
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