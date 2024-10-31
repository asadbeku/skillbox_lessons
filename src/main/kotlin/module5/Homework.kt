package module5

fun main() {

    var n: Int
    do {
        println("Enter a number")
        n = readln().toIntOrNull() ?: return
    } while (n < 0)

    for (i in 0..<n){
        println(fibNumbers(i))
    }


}
val fibCache = mutableMapOf<Int, Int>()

fun fibNumbers(n: Int): Int {
    if (n <= 1) return n
    fibCache[n]?.let { return it }
    val result = fibNumbers(n - 1) + fibNumbers(n - 2)
    fibCache[n] = result
    return result
}