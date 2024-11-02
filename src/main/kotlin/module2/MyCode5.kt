package module2

import java.io.File
import java.io.InputStream

fun main() {
    val list = mutableListOf<String>()
    val inputStream: InputStream =
        File("C:\\Users\\Asadbek\\IdeaProjects\\Lesson1\\src\\main\\kotlin\\module2\\input.txt").inputStream()
    inputStream.bufferedReader().forEachLine { str ->
        list.add(str)
    }

    sortString(list)
}

fun sortString(list: List<String>) {
    val listWithIndex: MutableMap<Int, String> = mutableMapOf()
    val answer: MutableList<String> = mutableListOf()

    list.map { word ->
        val index = word.filter { it.isDigit() }
        val w = word.replace(("[0-9]").toRegex(), "")
        listWithIndex += index.toInt() to w
    }

    listWithIndex.entries.sortedBy { it.key }.map { items ->
        answer += items.value
    }

    File("C:\\Users\\Asadbek\\IdeaProjects\\Lesson1\\src\\main\\kotlin\\module2\\output.txt").printWriter().use { out ->
        answer.map {
            out.println(it)
        }
    }
}