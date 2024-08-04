package leetcode.dsa.bitwise_manipulation


class BitMasking {

    private var a:Int = 12

    //use this function to update the value
    fun updateDefaultValue(updated:Int) {
        a = updated
    }

    //print the value of an Integer
    fun printByte() {
        println("print a: $a")
    }

    // helper function to get the bit at the position of value in binary
    fun findIthBit(pos:Int):Int {
       return a shr pos and 1
    }

    //helper function to set a bit at given position.
    fun setIthBit(pos: Int):Int {
         return a shr pos or 1

    }

    //helper function to clear bit at given position.
    fun clearIthBit(pos: Int):Int {
        return a and ( a shr pos ).inv()
    }

}

fun main() {

    val bitMasking = BitMasking()
    bitMasking.printByte()

    println("bit at 1nd pos: ${bitMasking.findIthBit(1)}")

    println("set bit at 2nd pos: ${bitMasking.setIthBit(2)}")

    println("clear bit at 2nd pos: ${bitMasking.clearIthBit(1)}")



}