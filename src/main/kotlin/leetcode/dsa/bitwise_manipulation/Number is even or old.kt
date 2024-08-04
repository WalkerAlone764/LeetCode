package leetcode.dsa.bitwise_manipulation

fun checkNumberEvenOrOdd() {
    val a = 13
    checkNumberEvenOrOddModulus(a)
    checkNumberEvenOrOddBitwise(a)
}

fun checkNumberEvenOrOddModulus(a:Int) {

    if(a%2 == 0) {
        println("even")
    } else {
        println("odd")
    }
}

fun checkNumberEvenOrOddBitwise(a:Int) {
    if(a.and(1) == 0) {
        println("bitwise even")
    } else {
        println("bitwise odd")
    }
}