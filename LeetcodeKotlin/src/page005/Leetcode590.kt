package page005


/**
 *
 * ��Ŀ: N �����ĺ������
 *
 * ����: ����һ�� n �����ĸ��ڵ� root ������ ��ڵ�ֵ�� ������� ��
 *      n ���� �������а���������������л���ʾ��ÿ���ӽڵ��ɿ�ֵ null �ָ�����μ�ʾ��������
 * ����: �ڵ������ڷ�Χ [0, 104] ��
 *      0 <= Node.val <= 104
 *      n �����ĸ߶�С�ڻ���� 1000
 *
 * ����: https://leetcode.cn/problems/n-ary-tree-postorder-traversal/description/?envType=daily-question&envId=2024-02-19
 *
 */
class Leetcode590 {

    class Node(var `val`: Int) {
        var children: ArrayList<Node?> = arrayListOf()
    }

    /**
     * �ݹ�
     * ��ʱ��224ms
     * �ڴ棺40.93MB
     */
    fun postorder(root: Node?): List<Int> {
        val arrayList = ArrayList<Int>()
        //���еݹ�
        root?.let { postorder(it, arrayList) }
        return arrayList
    }


    private fun postorder(root: Node, list: ArrayList<Int>) {
        //û���ӽڵ�
        if (root.children.isEmpty()) {
            list.add(root.`val`)
            return
        }
        //����
        for (node in root.children) {
            node?.let { postorder(node, list) }
        }
        //��������
        list.add(root.`val`)
    }

    /**
     * ����
     * ��ʱ��286ms
     * �ڴ棺41.88MB
     */
    fun postorderIteration(root: Node?): List<Int> {
        val arrayList = ArrayList<Int>()
        if (root == null) return arrayList

        val map: HashMap<Node, Int> = HashMap()
        val stack = ArrayDeque<Node>()
        var node: Node? = root

        while (stack.isNotEmpty() || node != null) {
            //����ڵ㲻Ϊ�� ѹ��ջ�� ��һ��ѭ����ʱ��������ߵĽڵ㶼ѹ��ջ��
            while (node != null) {
                stack.add(node)
                //��������ӽڵ� ѹ��ջ��
                if (node.children.isNotEmpty()) {
                    map[node] = 0
                    node = node.children[0]
                } else {
                    node = null
                }
            }

            //�õ�һ���ڵ�
            node = stack.last()
            val index = (map[node] ?: 0) + 1
            //����������δ�������ӽڵ� �ҵ�����ӽڵ� Ȼ�����½���ѭ������һ�нڵ�ѹ��ջ��
            if (node.children.size > index) {
                map[node] = index
                node = node.children[index]
            }
            //û���ӽڵ�ͼ�¼���ݲ��Ƴ�
            else {
                arrayList.add(node.`val`)
                map.remove(node)
                stack.removeLast()
                node = null
            }
        }
        return arrayList
    }

}