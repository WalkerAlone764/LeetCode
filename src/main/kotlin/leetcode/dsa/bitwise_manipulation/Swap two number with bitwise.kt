package leetcode.dsa.bitwise_manipulation

fun main() {
    var a = 5
    var b = 10

    println("before swap: a = $a amd b = $b")
    a = a xor b
    b = a xor b
    a = a xor b
    println("after swap: a = $a amd b = $b")
}