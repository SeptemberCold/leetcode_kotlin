package com.lin.leetcode.page018;

public class Leetcode1803Test {


    class Solution {
        // 字典树的根节点
        private Trie root = null;
        // 最高位的二进制位编号为 14
        private static final int HIGH_BIT = 14;

        public int countPairs(int[] nums, int low, int high) {
            //计算异或后小于high的数量 计算异或后小于low-1的属性
            //两者相减避开 low<= x <=high 的计算
            return f(nums, high) - f(nums, low - 1);
        }

        public int f(int[] nums, int x) {
            //首结点
            root = new Trie();
            int res = 0;
            //数组遍历一次
            for (int i = 1; i < nums.length; i++) {
                //把数据转成二进制存入字典树
                add(nums[i - 1]);
                //计算在字典树中与nums[i]计算后小于x的
                res += get(nums[i], x);
            }
            return res;
        }

        public void add(int num) {
            Trie cur = root;
            //从高位开始 也就是首节点算起
            for (int k = HIGH_BIT; k >= 0; k--) {
                //左移到指定位 对指定位做与运算(按位与运算)把对应二进制位摘出来 0&1=0 1&1=1
                int bit = (num >> k) & 1;
                //检查下链表对应子节点是否空的，空了就新加子节点
                //数据以数组下标的形式存储 1存入son[1] 0存入son[0]
                if (cur.son[bit] == null) {
                    cur.son[bit] = new Trie();
                }
                //切换节点
                cur = cur.son[bit];
                //保存子节点数
                cur.sum++;
            }
        }

        public int get(int num, int x) {
            Trie cur = root;
            int sum = 0;
            //从高位开始 也就是首节点算起
            for (int k = HIGH_BIT; k >= 0; k--) {
                //计算num的对应二进制位上的bit
                int r = (num >> k) & 1;
                //计算x(high、low)的子节点走左还是右
                if (((x >> k) & 1) != 0) {
                    if (cur.son[r] != null) {
                        sum += cur.son[r].sum;
                    }
                    if (cur.son[r ^ 1] == null) {
                        return sum;
                    }
                    cur = cur.son[r ^ 1];
                } else {
                    if (cur.son[r] == null) {
                        return sum;
                    }
                    cur = cur.son[r];
                }
            }
            sum += cur.sum;
            return sum;
        }
    }

    class Trie {
        // son[0] 表示左子树，son[1] 表示右子树
        Trie[] son = new Trie[2];
        int sum;

        public Trie() {
            sum = 0;
        }
    }

}
