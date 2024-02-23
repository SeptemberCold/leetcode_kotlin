package page025

import java.util.*
import kotlin.collections.ArrayList

/**
 *
 * ��Ŀ: �������еĵ� K ����
 *
 * ����: ����һ�ö������ĸ��ڵ� root ��һ�������� k ��
 *      ���е� ��� ��ָ ͬһ�� �Ͻڵ�ֵ���ܺ͡�
 *      �������е� k ��Ĳ�ͣ���һ����ͬ������������� k �㣬�򷵻� -1 ��
 *      ע�⣬��������ڵ�����ڵ�ľ�����ͬ������Ϊ������ͬһ�㡣
 *
 * ����: 2 <= n <= 105
 *      1 <= Node.val <= 106
 *      1 <= k <= n
 *
 * ����: https://leetcode.cn/problems/kth-largest-sum-in-a-binary-tree/description/?envType=daily-question&envId=2024-02-23
 *
 */
class Leetcode2583 {

    /**
     * �������
     * ��ʱ��603ms
     * �ڴ棺59.09MB
     */
    fun kthLargestLevelSum(root: TreeNode?, k: Int): Long {
        if (root == null) return 0
        //�����������
        val queue = LinkedList<TreeNode>()
        //��ͼ���
        val arrayList = ArrayList<Long>()
        queue.add(root)

        while (!queue.isEmpty()) {
            var sum = 0L
            //queue�洢��x������нڵ� ��ͳ��x�Ľڵ� ����һ�߳��� һ�����
            //��x������нڵ㶼���Ӻ� queueʣ�µ�������ӵ�x+1�����нڵ�
            for (i in 0 until queue.size) {
                //����
                val mRoot = queue.pop()
                //�ӽڵ㶼���
                mRoot.left?.let { queue.add(it) }
                mRoot.right?.let { queue.add(it) }
                //
                sum += mRoot.`val`
            }
            //�洢x��Ĳ��
            arrayList.add(sum)
        }
        //��������� k �㣬�򷵻� -1
        if (k > arrayList.size) {
            return -1
        }
        //�ÿ⺯������ ��С�����
        arrayList.sort()
        return arrayList[arrayList.size - k]
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}