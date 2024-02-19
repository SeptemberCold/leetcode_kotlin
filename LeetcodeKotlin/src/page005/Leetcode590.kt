package page005


/**
 *
 * 题目: N 叉树的后序遍历
 *
 * 描述: 给定一个 n 叉树的根节点 root ，返回 其节点值的 后序遍历 。
 *      n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。。
 * 限制: 节点总数在范围 [0, 104] 内
 *      0 <= Node.val <= 104
 *      n 叉树的高度小于或等于 1000
 *
 * 链接: https://leetcode.cn/problems/n-ary-tree-postorder-traversal/description/?envType=daily-question&envId=2024-02-19
 *
 */
class Leetcode590 {

    class Node(var `val`: Int) {
        var children: ArrayList<Node?> = arrayListOf()
    }

    /**
     * 递归
     * 用时：224ms
     * 内存：40.93MB
     */
    fun postorder(root: Node?): List<Int> {
        val arrayList = ArrayList<Int>()
        //进行递归
        root?.let { postorder(it, arrayList) }
        return arrayList
    }


    private fun postorder(root: Node, list: ArrayList<Int>) {
        //没有子节点
        if (root.children.isEmpty()) {
            list.add(root.`val`)
            return
        }
        //遍历
        for (node in root.children) {
            node?.let { postorder(node, list) }
        }
        //加上自身
        list.add(root.`val`)
    }

    /**
     * 迭代
     * 用时：286ms
     * 内存：41.88MB
     */
    fun postorderIteration(root: Node?): List<Int> {
        val arrayList = ArrayList<Int>()
        if (root == null) return arrayList

        val map: HashMap<Node, Int> = HashMap()
        val stack = ArrayDeque<Node>()
        var node: Node? = root

        while (stack.isNotEmpty() || node != null) {
            //如果节点不为空 压入栈中 第一次循环的时候会把最左边的节点都压入栈中
            while (node != null) {
                stack.add(node)
                //如果存在子节点 压入栈中
                if (node.children.isNotEmpty()) {
                    map[node] = 0
                    node = node.children[0]
                } else {
                    node = null
                }
            }

            //拿到一个节点
            node = stack.last()
            val index = (map[node] ?: 0) + 1
            //如果有最左边未遍历的子节点 找到这个子节点 然后重新进入循环将这一列节点压入栈中
            if (node.children.size > index) {
                map[node] = index
                node = node.children[index]
            }
            //没有子节点就记录数据并移除
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