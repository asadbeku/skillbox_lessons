package module3

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
    var number: Int = 5

    val firstVariable: Int = 5
    var secondVariable: Int = 10

//    println(secondVariable)

    secondVariable = -999
//    println(secondVariable)


//    Типы данных. Числа

    val numberInt = 10000

    val floatNumber: Float = 2.0f

    val longNumber: Long = numberInt.toLong()

    val a = 5
    val b = 11
//    println("b/a=${b.toDouble() / a.toDouble()}")

//    Типы данных. Логический тип

    var numberForCheck = -5

    var isPositive = numberForCheck > 0
    var isEven = numberForCheck % 2 == 0
//    println("Is number positive or even? - ${isPositive || isEven}")

    numberForCheck = 9

    isPositive = numberForCheck > 0
    isEven = numberForCheck % 2 == 0

//    println("Is number positive or even? - ${isPositive || isEven}")
//


    val firstName = "Asadbek"
    val lastName = "Uralbayev"
    var height: Double = 173.0
    var weight: Float = 70.1f
    var isChild: Boolean = (height < 150.0 || weight < 40.0f)
    val info = "Name: $firstName, Last name: $lastName, Weight: $weight, Height: $height, Is child: $isChild"

    println(info)

    weight = 39.9f
    isChild = (height < 150.0 || weight < 40.0f)
    println("Name: $firstName, Last name: $lastName, Weight: $weight, Height: $height, Is child: $isChild")


}