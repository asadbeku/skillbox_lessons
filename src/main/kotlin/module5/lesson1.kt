package module5

fun main() {
//    println(maxNumber(5, 28))
    println("Enter a")
    val a: Int = readln().toIntOrNull() ?: return
    println("Enter b")
    val b: Int = readln().toIntOrNull() ?: return
    println("Enter c")
    val c: Int = readln().toIntOrNull() ?: return

    val x = solveEquation(a, b, c)

    if (x==null)
        println("No solution")
    else
        println(x)

}

fun solveEquation(a: Int, b: Int, c: Int): Double? {
    if (a == 0) return null
    return (c - b) / a.toDouble()
}

fun maxNumber(a: Int, b: Int): Int = if (a > b) a else b