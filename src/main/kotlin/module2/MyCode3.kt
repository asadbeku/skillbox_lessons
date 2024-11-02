package module2

fun main() {
    val str = readln()
    val answer = mutableListOf<String>()

    val list: List<String> = str.split("/").filter { it != "" }

    for (item in list) {
        if (item == "..") {
            if (answer.isNotEmpty()) answer.removeAt(answer.size - 1)
        } else if (item == ".") continue
        else {
            answer.add(item)
        }
    }

    println("/" + answer.joinToString("/"))
}