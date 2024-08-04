package leetcode.dsa.bitwise_manipulation

fun division() {
    println("divide by 2: ${divideBy2(8)}")
    println("divide by 2 with right shift: ${divideBy2WithBitwise(8)}")
}

fun divideBy2(a:Int):Int {
    return a/2
}

fun divideBy2WithBitwise(a:Int): Int {
    return a.shr(1)
}