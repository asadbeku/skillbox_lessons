package module6

import kotlin.random.Random

fun main() {
//    val list = listOf(1, 2, 3, 4, 5)
//    val randomNumbers = MutableList(10) { Random.nextInt(-10, 10) }
//    println(randomNumbers)
////    list.forEachIndexed { index, item ->
////        println(item*index)
////    }
//
////    val iterator = randomNumbers.iterator()
////    while (iterator.hasNext()) {
////
////        val item = iterator.next()
////        if (item < 0) {
////            iterator.remove()
////        }
////
////    }
//
//
//
//
//    randomNumbers.removeAll { it < 0 }
//
//    println(randomNumbers)

    val first = Developer("Asad")
    val second = Developer("Asad")

    first.age = 20
    second.age = 30


    println(first == second)

    var s: String = "gg"


}

data class Developer(val name: String) {
    var age: Int = 0
}

