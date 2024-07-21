import kotlin.math.max

//You are given an m x n integer grid accounts where accounts[i][j] is the
//amount of money the ith customer has in the jth bank. Return the wealth that the 
//richest customer has. 
//
// A customer's wealth is the amount of money they have in all their bank 
//accounts. The richest customer is the customer that has the maximum wealth. 
//
// 
// Example 1: 
//
// 
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6
//.
// 
//
// Example 2: 
//
// 
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
//Explanation: 
//1st customer has wealth = 6
//2nd customer has wealth = 10 
//3rd customer has wealth = 8
//The 2nd customer is the richest with a wealth of 10. 
//
// Example 3: 
//
// 
//Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
//Output: 17
// 
//
// 
// Constraints: 
//
// 
// m == accounts.length 
// n == accounts[i].length 
// 1 <= m, n <= 50 
// 1 <= accounts[i][j] <= 100 
// 
//
// Related Topics Array Matrix 👍 4339 👎 365


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {

        // Time Complexity O(n * m)
        // Space Complexity O(1)

        var maxWealth = -1
        accounts.forEach { matrix ->
            var total = 0
            matrix.forEach { money ->
                total += money
            }
//            if(maxWealth < total) {
//                maxWealth = total
//            }

            maxWealth = Math.max(maxWealth,total)
        }

        return maxWealth
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
