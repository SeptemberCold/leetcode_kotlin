package com.lin.leetcode.page012

/**
 *
 * @author lin
 * @date 2023/02/08/23:12
 * ɾ�����ļ���
 * ����һλϵͳ����Ա��������һ���ļ����б� folder��
 * ���������Ҫɾ�����б��е��������ļ��У���������˳�� ����ʣ�µ��ļ��С�
 * ����ļ���folder[ i ]λ����һ���ļ���folder[ j ]�£�
 * ��ôfolder[ i ]����folder[ j ]�� ���ļ��� ��
 * �ļ��еġ�·��������һ�����������¸�ʽ�����γɵ��ַ�����'/'���һ�����߶��СдӢ����ĸ��
 * ���磬"/leetcode"��"/leetcode/problems"������Ч��·���������ַ�����"/"���ǡ�
 */
object Leetcode1233 {

    /**
     * ִ����ʱ��396 ms
     * �ڴ����ģ�52.7 MB
     */
    private fun removeSubfolders(folder: Array<String>): List<String> {
        if (folder.isEmpty()) return ArrayList()
        //����
        folder.sort()
        //���ڴ洢���
        val answer = ArrayList<String>()
        //��һ���ַ���
        var now = "/"
        //����
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
     * ��ȡ��������
     */
    private fun getTestData(): List<Array<String>> {
        val data = ArrayList<Array<String>>()
        data.add(arrayOf("/a/b/c", "/a/b/ca", "/a/b/d"))
        return data
    }


}