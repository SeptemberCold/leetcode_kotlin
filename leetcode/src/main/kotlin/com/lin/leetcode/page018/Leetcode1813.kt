package com.lin.leetcode.page018

import kotlin.math.min

/**
 *
 * @author lin
 * @date 2023/01/16/20:54
 *
 * ���������� III
 * һ����������һЩ����������֮��ĵ����ո���ɣ��Ҿ��ӵĿ�ͷ�ͽ�βû�ж���ո�
 * �ȷ�˵��"Hello World"��"HELLO"��"hello world hello world"���Ǿ��ӡ�
 * ÿ�����ʶ� ֻ������д��СдӢ����ĸ��
 * �����������sentence1 ��sentence2������ͨ��������һ�����Ӳ���һ������ľ��ӣ������ǿվ��ӣ����õ���һ�����ӣ���ô���ǳ������������� ���Ƶġ�
 * �ȷ�˵��sentence1 = "Hello my name is Jane" ��sentence2 = "Hello Jane"��
 * ���ǿ����� sentence2��"Hello" ��"Jane"֮�����"my name is"�õ� sentence1��
 * ������������sentence1 ��sentence2�����sentence1 ��sentence2 �����Ƶģ�
 * ���㷵��true�����򷵻�false��
 */
object Leetcode1813 {

    /**
     * �����ƽ�
     * ִ����ʱ��184 ms
     * �ڴ����ģ�35.3 MB
     * ��Ү���еȶ��ܱ������ƽ�˫100
     */
    private fun areSentencesSimilar(sentence1: String, sentence2: String): Boolean {
        //�����ַ����Կո�ָ�
        val split1 = sentence1.split(" ")
        val split2 = sentence2.split(" ")
        //����̾���
        val short: List<String>
        //���泤����
        val long = HashMap<Int, String>()
        if (split1.size == split2.size) {
            return sentence1 == sentence2
        } else if (split1.size > split2.size) {
            split1.indices.forEach { long[it] = split1[it] }
            short = split2
        } else {
            split2.indices.forEach { long[it] = split2[it] }
            short = split1
        }
        var b = false
        short.indices.forEach {
            //�̾����е��ʳ�����û�� ֱ�ӿ���������
            if (!long.containsValue(short[it])) return false
            //�ж�ǰ��ľ����Ƿ�һ�� ��һ����ʼ�жϺ���ľ����Ƿ�һ��
            if (short[it] != long[it] && !b) {
                //��󷽱���
                b = true
            }
            if (b) {
                if (short[it] != long[long.size - (short.size - it)]) {
                    return false
                }
            }
        }
        return true
    }

    /**
     * ˫ָ��д��
     * ִ����ʱ��204 ms
     * �ڴ����ģ�35.1 MB
     * ˼·��࣬�ȼ���ǰ�����Ƶĳ��ȣ��ټ���������Ƶĳ���
     * ����������ӵ�����̵ľ��Ӿͱ�ʾ��������
     */
    private fun areSentencesSimilar2(sentence1: String, sentence2: String): Boolean {
        //�����ַ����Կո�ָ�
        val split1 = sentence1.split(" ")
        val split2 = sentence2.split(" ")
        var i = 0
        var j = 0
        while (i < split1.size && i < split2.size && split1[i] == split2[i]) {
            i++
        }
        while (j < split1.size - i && j < split2.size - i && split1[split1.size - j - 1] == split2[split2.size - j - 1]) {
            j++
        }
        return i + j == min(split1.size, split2.size)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = areSentencesSimilar(it.key, it.value)
            println("result=${result}")
        }
        println("===========================")
        getTestData().forEach {
            val result = areSentencesSimilar2(it.key, it.value)
            println("result=${result}")
        }

    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): Map<String, String> {
        val map = HashMap<String, String>()
        map["My name is Haley"] = "My Haley"
        map["of"] = "A lot of words"
        map["Eating right now"] = "Eating"
        map["Luky"] = "Lucccky"
        return map
    }


}