package page028

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.set

/**
 *
 * ��Ŀ: ͳ�����еĺϷ�·����Ŀ
 *
 * ����: ����һ�� n ���ڵ�����������ڵ���Ϊ 1 �� n ������һ������ n ��һ������Ϊ n - 1 �Ķ�ά�������� edges ��
 *      ���� edges[i] = [ui, vi] ��ʾ�ڵ� ui �� vi ��������һ���ߡ�
 *      ���㷵�����е� �Ϸ�·����Ŀ ��
 *      ����ڽڵ� a ���ڵ� b ֮�� ǡ����һ�� �ڵ�ı������������ô���ǳ�·�� (a, b) �� �Ϸ��� ��
 *      ע�⣺
 *          ·�� (a, b) ָ����һ���ӽڵ� a ��ʼ���ڵ� b ������һ���ڵ����У������еĽڵ� ������ͬ �������ڽڵ�֮����������һ���ߡ�
 *          ·�� (a, b) ��·�� (b, a) ��Ϊ ͬһ�� ·������ֻ����� һ�� ��
 *
 * ����: 1 <= n <= 105
 *      edges.length == n - 1
 *      edges[i].length == 2
 *      1 <= ui, vi <= n
 *      ���뱣֤ edges �γ�һ�úϷ�������
 *
 * ����: https://leetcode.cn/problems/count-valid-paths-in-a-tree/description/?envType=daily-question&envId=2024-02-27
 *
 */
class Leetcode2867 {

    companion object {
        //����ɸ
        val isPrime = BooleanArray(100001) { true }.also {
            it[1] = false
            var i = 2
            while (i * i < 100001) {
                if (it[i]) {
                    var j = i * i
                    while (j < 100001) {
                        it[j] = false
                        j += i
                    }
                }
                i += 1
            }
        }
    }

    /**
     * ����ɸ + ���� + ����
     * ��ʱ��2116ms
     * �ڴ棺111.35MB
     */
    fun countPaths(n: Int, edges: Array<IntArray>): Long {
        //nodeMap[i] ����ڵ�i�����ڽڵ�
        val nodeMap = HashMap<Int, ArrayList<Int>>()
        for (i in 1..n) {
            nodeMap[i] = ArrayList()
        }
        for ((key, value) in edges) {
            nodeMap[key]?.add(value)
            nodeMap[value]?.add(key)
        }
        //count[i] ����ڵ�i���ڲ����������ڵ�������ܹ����ʵķ������ڵ���
        val count = IntArray(n + 1)
        //ͳ�ƺϷ�·������
        var sum = 0L
        //���� ����Ԫ��
        val queue = LinkedList<Int>()
        val headNode = ArrayList<Int>()
        //�ҳ������ڵ�
        for (i in 1..n) {
            //��������
            if (!isPrime[i]) continue
            //���ڽڵ㼯��
            val childrenNodes = nodeMap[i] as ArrayList
            var cur = 0
            for (childrenNode in childrenNodes) {
                //�ڵ������� ��һ��·����û����
                if (isPrime[childrenNode]) continue
                //���count[i]!=0�����Ѿ���������ڵ���,�������¼���һ��
                if (count[childrenNode] == 0) {
                    //���
                    queue.add(childrenNode)
                    headNode.add(i)
                    var cnt = 0
                    while (queue.isNotEmpty()) {
                        val dequeNode = queue.pop()
                        nodeMap[dequeNode]?.forEach {
                            if (!isPrime[it] && !headNode.contains(it)) {
                                queue.add(it)
                                cnt += 1
                            }
                        }
                        headNode.add(dequeNode)
                    }
                    headNode.clear()
                    //�����Լ�
                    count[childrenNode] = cnt + 1
                }
                sum += count[childrenNode] * cur
                //ǰ��ͳ�ƵĿɷ��ʽڵ���
                cur += count[childrenNode]
            }
            //���Ǵ����������������з������ڵ�
            sum += cur
        }
        return sum
    }

}