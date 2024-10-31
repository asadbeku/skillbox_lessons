package module4

fun main() {
//    val anonymous: (Int, Double) -> Unit = fun(a: Int, b: Double) { println("a=$a \t b=$b") }
//    anonymous(12456, 12.5)
//
//    val lambda = { println("Hello world!") }
//    val lambdaWithParams = { message: String -> println(message) }
//    val lambdaWithParamsAndReturnValue = { a: Int, b: Int -> a * b }
//
//    lambda
//    lambdaWithParams("Hello")
//    lambdaWithParamsAndReturnValue

    val str = "This is a typical task for developer interview"

    println(str.count { it == 'e' })

    val vowels = "aeiou"

    println(str.filter { it !in vowels })

}

fun checkSymbol(char: Char): Boolean = char == 'e'