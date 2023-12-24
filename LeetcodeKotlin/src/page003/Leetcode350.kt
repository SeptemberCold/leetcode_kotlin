package page003

/**
 *
 * 题目: 两个数组的交集 II
 *
 * 描述: 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
 *      返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
 *      可以不考虑输出结果的顺序。
 * 限制: 1 <= nums1.length, nums2.length <= 1000
 *      0 <= nums1[i], nums2[i] <= 1000
 *
 * 链接: https://leetcode.cn/problems/intersection-of-two-arrays-ii/description/
 *
 */
class Leetcode350 {

    /**
     * 哈希算法
     * 208 ms
     * 36.62 MB
     */
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap = HashMap<Int, Int>()
        val list = ArrayList<Int>()

        for (num in nums1) {
            hashMap[num] = (hashMap[num] ?: 0) + 1
        }

        val hashMap2 = HashMap<Int, Int>()
        for (num in nums2) {
            hashMap2[num] = (hashMap2[num] ?: 0) + 1
            val count = hashMap[num] ?: 0
            if (count != 0 && hashMap2[num]!! <= count) {
                list.add(num)
            }
        }
        return list.toIntArray()
    }

}