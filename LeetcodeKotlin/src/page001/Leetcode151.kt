package page001

/**
 *
 * 题目: 反转字符串中的单词
 *
 * 描述: 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 *      单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 *      返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 *      注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。
 *      返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 *
 * 限制: 1 <= s.length <= 104
 *      s 包含英文大小写字母、数字和空格 ' '
 *      s 中 至少存在一个 单词
 *
 * 链接: https://leetcode.cn/problems/reverse-words-in-a-string/description/
 *
 */
class Leetcode151 {

    /**
     * 原地解法 空间复杂度O(1) 时间复杂度。。。
     * 用时：195ms
     * 内存：36.82MB
     */
    fun reverseWords(s: String): String {
        //转成数组模拟 做O(1)空间复杂度的原地解法
        val array = s.toCharArray()
        //字符串翻转
        var temp: Char
        for (i in 0 until s.length / 2) {
            temp = array[i]
            array[i] = array[s.length - 1 - i]
            array[s.length - 1 - i] = temp
        }
        //删除单词之间多余的空格 如果单词有前置空格 字符串前面会有一个空格 需要额外处理这个空格
        deleteEmpty(array, 0)
        //检查前置空格 有就前移
        if (array[0] == ' ') {
            for (i in 0..array.size - 2) {
                array[i] = array[i + 1]
            }
            array[array.size - 1] = ' '
        }
        //检查单词 每个单词单独翻转
        var index = 0
        for (i in 1 until array.size) {
            //遇到空格了就翻转前面的单词 且前面不是空格
            if (array[i] == ' ' && array[i - 1] != ' ') {
                for (j in 0 until (i - index) / 2) {
                    temp = array[index + j]
                    array[index + j] = array[i - j - 1]
                    array[i - j - 1] = temp
                }
                index = i + 1
                continue
            }
            //如果是连续的空格代表后面都是空格了 结束循环
            if (array[i] == ' ' && array[i - 1] == ' ') {
                break
            }
        }
        //如果到最后一位不是空格 翻转前面的单词
        if (array[array.size - 1] != ' ') {
            for (j in 0 until (array.size - index) / 2) {
                temp = array[index + j]
                array[index + j] = array[array.size - 1 - j]
                array[array.size - 1 - j] = temp
            }
        }
        //从后面开始遍历 找到不是空格的索引
        for (i in array.size - 1 downTo 0) {
            if (array[i] != ' ') {
                index = i + 1
                break
            }
        }
        //截取数据就是结果了
        return String(array).substring(0, index)
    }

    //删除单词之间多余的空格
    private fun deleteEmpty(charArray: CharArray, start: Int) {
        //删除单词之间多余的空格
        //标记索引
        var index = 0
        var isEmpty = false
        for (i in start until charArray.size) {
            //如果遇到空格且之前没有遇到空格 标记起始位置
            if (charArray[i] == ' ' && !isEmpty) {
                isEmpty = true
                index = i
                continue
            }
            //如果前面遇到了空格但本次没有遇到空格 且距离大于1 数据开始前移
            if (isEmpty && charArray[i] != ' ' && i - index > 1) {
                for (j in 0 until charArray.size - i) {
                    charArray[index + j + 1] = charArray[i + j]
                    charArray[i + j] = ' '
                }
                deleteEmpty(charArray, index)
                break
            }
            //如果遇到了单词 前面只有一个空格或者没有空格 修改标记
            if (charArray[i] != ' ') {
                isEmpty = false
            }
        }
    }

}