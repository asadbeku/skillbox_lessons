package module4

fun main() {
    val str = "F2p)v\"y233{0->c}ttelciFc"

    val firstHalf = str.removeRange(str.length / 2, str.length)
    val secondHalf = str.removeRange(0, str.length / 2)

    println(processFirstHalf(firstHalf) + processSecondHalf(secondHalf))
}

fun processFirstHalf(str: String): String {

    var firstHalf = str

    shiftUp(firstHalf, 1, strUp = { answer -> firstHalf = answer })
    firstHalf = firstHalf.replace(oldChar = '5', newChar = 's')
    firstHalf = firstHalf.replace(oldChar = '4', newChar = 'u')
    shiftDown(firstHalf, 3, strDown = { answer -> firstHalf = answer })
    firstHalf = firstHalf.replace(oldChar = '0', newChar = 'o')

    return firstHalf
}

fun processSecondHalf(str: String): String {

    var secondHalf = str

    secondHalf = secondHalf.reversed()
    shiftDown(secondHalf, 4, strDown = { answer -> secondHalf = answer })
    secondHalf = secondHalf.replace("_", " ")

    return secondHalf

}

fun shiftUp(str: String, upCount: Int, strUp: (answer: String) -> Unit) {
    strUp(str.map {
        it + upCount
    }.joinToString(""))
}

fun shiftDown(str: String, downCount: Int, strDown: (answer: String) -> Unit) {
    strDown(str.map {
        it - downCount
    }.joinToString(""))
}