package page010

/**
 *
 * 题目: 大样本统计
 *
 * 描述: 我们对 0 到 255 之间的整数进行采样，并将结果存储在数组 count 中：count[ k] 就是整数 k 在样本中出现的次数。
 *      计算以下统计数据:
 *      minimum：样本中的最小元素。
 *      maximum：样品中的最大元素。
 *      mean：样本的平均值，计算为所有元素的总和除以元素总数。
 *      median：
 *      如果样本的元素个数是奇数，那么一旦样本排序后，中位数 median 就是中间的元素。
 *      如果样本中有偶数个元素，那么中位数median 就是样本排序后中间两个元素的平均值。
 *      mode：样本中出现次数最多的数字。保众数是 唯一 的。
 *      以浮点数数组的形式返回样本的统计信息[minimum, maximum, mean, median, mode]。与真实答案误差在10-5内的答案都可以通过。
 * 限制: count.length == 256
 *      0 <= count[i] <= 109
 *      1 <= sum(count) <= 109
 *      count的众数是 唯一 的
 *
 * 链接: https://leetcode.cn/problems/statistics-from-a-large-sample/
 *
 */
class Leetcode1093 {

    /**
     * 数学模拟
     * 执行用时：196 ms
     * 内存消耗：40.7 MB
     */
    fun sampleStats(count: IntArray): DoubleArray {
        val answer = doubleArrayOf(-1.0, 0.0, 0.0, 0.0, 0.0)
        //总值
        var sum = 0.0
        //样本数
        var number = 0.0
        //样本最多的
        var more = 0
        //遍历
        for (i in count.indices) {
            val value = count[i]
            //========这里是找样本中的最小元素
            if (answer[0] == -1.0 && value != 0) {
                answer[0] = i.toDouble()
            }
            //这里是找样本中的最大元素
            if (value != 0) {
                answer[1] = i.toDouble()
            }
            //========这里是找样本中的众数的
            if (value > more) {
                answer[4] = i.toDouble()
                more = value
            }
            //========这里是计算样本的总数 value要先转成double，否则给sum赋值前它自身无法存储太大的数据
            sum += (value.toDouble() * i)
            //这里是计算样本有多少个元素
            number += value
        }
        //========这里是计算样本的平均值
        answer[2] = sum / number
        //========这里是计算中位数的
        //样本数是偶数
        if (number % 2 == 0.0) {
            var n = 0
            var a = -1
            var b = -1
            for (i in count.indices) {
                val value = count[i]
                n += value
                if (a == -1 && n >= number / 2) {
                    a = i
                }
                if (n >= number / 2 + 1) {
                    b = i
                    break
                }
            }
            answer[3] = (a.toDouble() + b) / 2
        } else {
            var n = 0
            for (i in count.indices) {
                val value = count[i]
                n += value
                if (n >= number / 2) {
                    answer[3] = i.toDouble()
                    break
                }
            }
        }
        return answer
    }

}