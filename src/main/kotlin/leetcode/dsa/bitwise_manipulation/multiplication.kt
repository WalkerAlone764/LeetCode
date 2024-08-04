package leetcode.dsa.bitwise_manipulation

fun multiplication() {
    println("multiply by 2: ${multiplyBy2(3)}")
    println("multiply by 2 with left shift: ${multiplyBy2Bitwise(3)}")
}

fun multiplyBy2(a:Int):Int {
    return a*2
}

fun multiplyBy2Bitwise(a:Int):Int {
    return a.shl(1)
}