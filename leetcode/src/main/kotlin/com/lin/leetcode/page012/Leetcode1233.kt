package com.lin.leetcode.page012

/**
 *
 * @author lin
 * @date 2023/02/08/23:12
 * 删除子文件夹
 * 你是一位系统管理员，手里有一份文件夹列表 folder，
 * 你的任务是要删除该列表中的所有子文件夹，并以任意顺序 返回剩下的文件夹。
 * 如果文件夹folder[ i ]位于另一个文件夹folder[ j ]下，
 * 那么folder[ i ]就是folder[ j ]的 子文件夹 。
 * 文件夹的「路径」是由一个或多个按以下格式串联形成的字符串：'/'后跟一个或者多个小写英文字母。
 * 例如，"/leetcode"和"/leetcode/problems"都是有效的路径，而空字符串和"/"不是。
 */
object Leetcode1233 {

    /**
     * 执行用时：396 ms
     * 内存消耗：52.7 MB
     */
    private fun removeSubfolders(folder: Array<String>): List<String> {
        if (folder.isEmpty()) return ArrayList()
        //排序
        folder.sort()
        //用于存储结果
        val answer = ArrayList<String>()
        //第一个字符串
        var now = "/"
        //遍历
        for (s in folder) {
            if (!s.startsWith("$now/")) {
                now = s
                answer.add(now)
            }
        }
        return answer
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = removeSubfolders(it)
            println("answer=$answer")
        }
    }

    /**
     * 获取测试用例
     */
    private fun getTestData(): List<Array<String>> {
        val data = ArrayList<Array<String>>()
        data.add(arrayOf("/a/b/c", "/a/b/ca", "/a/b/d"))
        return data
    }


}