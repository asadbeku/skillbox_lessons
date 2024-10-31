package module6

fun main() {
    val n = readln().toInt()
    val words = List(n) { readln() }

    val sortedWords = words.withIndex()
        // Sort by vowels descending
        .sortedByDescending { (_, word) -> word.count { it in "aeiou" } }
        // Sort by length ascending (stable)
        .sortedByDescending { (_, word) -> word.length }
        // Sort by original index ascending
        .sortedByDescending { it.index }
        .map { it.value }

    sortedWords.forEach { println(it) }
}