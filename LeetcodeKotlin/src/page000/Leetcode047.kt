package page000

/**
 *
 * 题目: 全排列 II
 *
 * 描述: 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 *
 * 限制: 1 <= nums.length <= 8
 *      -10 <= nums[i] <= 10
 *
 * 链接: https://leetcode.cn/problems/permutations-ii/description/
 *
 */
class Leetcode047 {

    /**
     * 模拟 哈希
     * 时间 275ms
     * 内存 40.63MB
     */
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val answer = ArrayList<List<Int>>()
        val hashMap = HashMap<String, Int>()
        answer.add(arrayListOf(nums[0]))
        //拿到所有排列组合
        for (i in 1 until nums.size) {
            val num = nums[i]
            val tempList = ArrayList<List<Int>>()
            //遍历已有的排列组合
            for (list in answer) {
                //每种组合都加一次
                for (j in 0..list.size) {
                    val temp = ArrayList(list)
                    temp.add(j, num)
                    //添加一个到缓存列表
                    if (!hashMap.containsKey(temp.toString())) {
                        tempList.add(temp)
                        hashMap[temp.toString()] = 1
                    }
                }
            }
            answer.clear()
            answer.addAll(tempList)
        }
        return answer
    }

}