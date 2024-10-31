package module5

fun main() {
    val n = readln().toIntOrNull() ?: return

    var i: Int = 0
    var summ = 0
//    while (i <= n) {
//        if (i % 2 != 0) continue
//        println(i)
//        summ += i
//        i++
//    }

    for (j in 0..n) {
        if (j % 2 != 0) continue
        println(j)
        summ += j
    }

    println("Sum of first $n, number - $summ")


}