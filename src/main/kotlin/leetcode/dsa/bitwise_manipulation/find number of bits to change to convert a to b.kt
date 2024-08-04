package leetcode.dsa.bitwise_manipulation

import kotlin.math.log10
import kotlin.math.log2

fun main() {
    val numberOfBits = numberOfBitToChange(3, 2)
    println("number of bits to change: $numberOfBits")

    println("number of digits: ${numberOfDigitalInBinary(1)}")
}


fun numberOfBitToChange(a: Int, b: Int): Int {
    if (a == b) {
        return -1
    }

    val result = a xor b
    val ans = log2(result.toDouble()) //log base 2 give number of 1 in binary

    return ans.toInt() + 1
}

fun numberOfDigitalInBinary(a: Int): Int {
    return log10(a.toDouble()).toInt() + 1
}


