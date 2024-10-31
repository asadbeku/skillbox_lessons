package module5

fun main() {
    val n = readln().toIntOrNull() ?: return

//    printNumbers(n)

    println(calculateSum(n))
}

fun printNumbers(number: Int): Int {
    return if (number > 0) {
        println(number)
        printNumbers(number - 1)
    } else {
        0
    }
}

tailrec fun calculateSum(n: Int, currentSum: Int=0): Int {
    if (n==0) return currentSum
    return calculateSum(n - 1, currentSum+n)
}