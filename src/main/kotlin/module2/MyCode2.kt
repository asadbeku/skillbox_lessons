package module2

fun main() {
    val time = "20:13:12"

    val n = readln().toInt()
    val list = mutableListOf<Long>()
    var answer = 1

    for (i in 0..<n) {
        val input = readln()
        list.add(convertToSecond(input))
    }

    for (i in 0..<list.size-1) {
        if (list[i] >= list[i + 1]) {
            answer++
        }
    }

    println(answer)
}

fun convertToSecond(time: String): Long {
    val list = time.split(":")

    val hour = list[0].toInt() * 60 * 60
    val minute = list[1].toInt() * 60
    val second = list[2].toInt()

    return (hour + minute + second).toLong()
}