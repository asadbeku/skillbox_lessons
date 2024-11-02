package module2

fun main() {
    val n: Int = readlnOrNull()?.toIntOrNull() ?: 0
    val allNumbers: String = readln()
    var sum = 0

    val listTest = allNumbers.trim().splitToSequence(' ').toMutableList()

    listTest.map {
        sum += it.toInt()
    }

    println(100 / sum)
}