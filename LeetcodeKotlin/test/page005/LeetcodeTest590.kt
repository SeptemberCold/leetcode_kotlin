package page005

import base.BaseTest

object LeetcodeTest590 : BaseTest<Leetcode590.Node, List<Int>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        //递归算法
        methodTest(getExample()) { return@methodTest Leetcode590().postorder(it) }
        //迭代算法
        methodTest(getExample()) { return@methodTest Leetcode590().postorderIteration(it) }
    }

    override fun getExample(): List<Leetcode590.Node> {
        return getArrayList().also {
            it.add(firstExample())
            it.add(secondExample())
        }
    }

    private fun firstExample(): Leetcode590.Node {
        //首节点
        val root = Leetcode590.Node(1)
        //第二层子节点
        root.children.add(Leetcode590.Node(3))
        root.children.add(Leetcode590.Node(2))
        root.children.add(Leetcode590.Node(4))
        //第三层子节点
        root.children[0]?.children?.add(Leetcode590.Node(5))
        root.children[0]?.children?.add(Leetcode590.Node(6))
        return root
    }

    private fun secondExample(): Leetcode590.Node {
        //首节点
        val root = Leetcode590.Node(1)
        //第二层子节点
        root.children.add(Leetcode590.Node(2))
        root.children.add(Leetcode590.Node(3))
        root.children.add(Leetcode590.Node(4))
        root.children.add(Leetcode590.Node(5))
        //第三层子节点
        root.children[1]?.children?.add(Leetcode590.Node(6))
        root.children[1]?.children?.add(Leetcode590.Node(7))
        root.children[2]?.children?.add(Leetcode590.Node(8))
        root.children[3]?.children?.add(Leetcode590.Node(9))
        root.children[3]?.children?.add(Leetcode590.Node(10))
        //第四层子节点
        root.children[1]?.children?.get(1)?.children?.add(Leetcode590.Node(11))
        root.children[2]?.children?.get(0)?.children?.add(Leetcode590.Node(12))
        root.children[3]?.children?.get(0)?.children?.add(Leetcode590.Node(13))
        //第五次子节点
        root.children[1]?.children?.get(1)?.children?.get(0)?.children?.add(Leetcode590.Node(14))
        return root
    }

}