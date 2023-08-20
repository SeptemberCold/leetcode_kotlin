package page022

/**
 *
 * ��Ŀ: �жϸ�����Ƿ�����ӽ��֮��
 *
 * ����: ����һ�� ������ �ĸ���� root���ö�������ǡ�� 3 �������ɣ�����㡢���ӽ������ӽ�㡣
 *      ��������ֵ���������ӽ��ֵ֮�ͣ����� true �����򷵻� false ��
 * ����: ��ֻ��������㡢���ӽ������ӽ��
 *      -100 <= Node.val <= 100
 *
 * ����: https://leetcode.cn/problems/root-equals-sum-of-children/description/
 *
 */
class Leetcode2236 {

    /**
     *
     * ʱ�� 144ms
     * �ڴ� 32.28MB
     */
    fun checkTree(root: TreeNode?): Boolean {
        return (root?.`val` ?: 0) == (root?.left?.`val` ?: 0) + (root?.right?.`val` ?: 0)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}