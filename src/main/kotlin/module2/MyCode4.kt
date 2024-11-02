package module2

import kotlin.math.min

//fun main() {
//    val n = readln().toInt()
//    val str = "17:00 20:00"
//    val list = str.split(" ").toMutableList()
//    val times = mutableListOf<Int>()
//    list.map {
//        times.add(convertToMinutes(it))
//    }
//
//    times.sort()
//
//    println(times)
//
//    var minDifference = 100000
//
//    for (i in 1..<times.size) {
//        val second = times[i]
//        val first = times[i - 1]
//        minDifference = minOf(minDifference, second - first)
//    }
//
//    minDifference = minOf(minDifference, (times[0] + 1440) - times.last())
//
//    println(minDifference)
//}

fun main() {
    val n = readln().toInt()
    val str = readln().trim()
    val list = str.split(" ").filter { it.isNotEmpty() } // Remove any empty strings
    val times = mutableListOf<Int>()
    var minValue = 1440 // Set to the maximum number of minutes in a day

    // Convert each time to minutes and store in `times`
    list.forEach {
        times.add(convertToMinutes(it))
    }

    times.sort()

    // Calculate the minimum difference between consecutive times
    for (i in 1 until times.size) {
        minValue = minOf(minValue, times[i] - times[i - 1])
    }

    // Check circular difference between the first and last times
    minValue = minOf(minValue, 1440 - (times.last() - times.first()))

    // Print the result
    println(minValue)
}

// Helper function to convert time in HH:MM format to minutes
fun convertToMinutes(time: String): Int {
    val list = time.split(":")
    return list[0].toInt() * 60 + list[1].toInt()
}

