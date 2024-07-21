package leetcode

import Solution

fun main() {
    val sol = Solution()
    val ans = sol.runningSum(intArrayOf(1,2,3,4))
    ans.forEach {
        print("$it ")
    }
}