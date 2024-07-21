package leetcode

import Solution

fun main() {
    val sol = Solution()
    val ans = sol.runningSum(intArrayOf(0,0,0,0))
    ans.forEach {
        print("$it ")
    }
}