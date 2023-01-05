package com.lin.leetcode.page018;

public class Leetcode1803Test {


    class Solution {
        // �ֵ����ĸ��ڵ�
        private Trie root = null;
        // ���λ�Ķ�����λ���Ϊ 14
        private static final int HIGH_BIT = 14;

        public int countPairs(int[] nums, int low, int high) {
            //��������С��high������ ��������С��low-1������
            //��������ܿ� low<= x <=high �ļ���
            return f(nums, high) - f(nums, low - 1);
        }

        public int f(int[] nums, int x) {
            //�׽��
            root = new Trie();
            int res = 0;
            //�������һ��
            for (int i = 1; i < nums.length; i++) {
                //������ת�ɶ����ƴ����ֵ���
                add(nums[i - 1]);
                //�������ֵ�������nums[i]�����С��x��
                res += get(nums[i], x);
            }
            return res;
        }

        public void add(int num) {
            Trie cur = root;
            //�Ӹ�λ��ʼ Ҳ�����׽ڵ�����
            for (int k = HIGH_BIT; k >= 0; k--) {
                //���Ƶ�ָ��λ ��ָ��λ��������(��λ������)�Ѷ�Ӧ������λժ���� 0&1=0 1&1=1
                int bit = (num >> k) & 1;
                //����������Ӧ�ӽڵ��Ƿ�յģ����˾��¼��ӽڵ�
                //�����������±����ʽ�洢 1����son[1] 0����son[0]
                if (cur.son[bit] == null) {
                    cur.son[bit] = new Trie();
                }
                //�л��ڵ�
                cur = cur.son[bit];
                //�����ӽڵ���
                cur.sum++;
            }
        }

        public int get(int num, int x) {
            Trie cur = root;
            int sum = 0;
            //�Ӹ�λ��ʼ Ҳ�����׽ڵ�����
            for (int k = HIGH_BIT; k >= 0; k--) {
                //����num�Ķ�Ӧ������λ�ϵ�bit
                int r = (num >> k) & 1;
                //����x(high��low)���ӽڵ���������
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
        // son[0] ��ʾ��������son[1] ��ʾ������
        Trie[] son = new Trie[2];
        int sum;

        public Trie() {
            sum = 0;
        }
    }

}
