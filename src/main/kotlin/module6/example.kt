package module6

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
    val n = readln().toIntOrNull()?:return
    val a = List(n) { readln() }

    result(a).map { println(it) }

}

fun result(a: List<String>): List<String> {

    val validWords = a.filter { it.matches("[a-zA-Z]+".toRegex()) }.toMutableList()

    val second: MutableList<String> = mutableListOf()
    val third = mutableListOf<Pair<Int, String>>()

    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var counter = 0

    validWords.map { word ->
        second.add(word.filter { it in vowels })
    }

    for (i in validWords.indices) {
        third.add(Pair(second[i].length, validWords[i]))
    }

    third.sortByDescending { it.first }
    third.sortByDescending { it.second.length }

    return third.map { it.second }
}


