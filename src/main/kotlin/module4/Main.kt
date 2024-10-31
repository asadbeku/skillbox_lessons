package module4

fun main() {
//    val juniorGrossSalary = 50_000
//    val middleGrossSalary = 134_000
//    val seniorGrossSalary = 167_000
//
//    calculateSavings(juniorGrossSalary, 0.3, 15)
//    calculateSavings(middleGrossSalary, 0.2)
//    calculateSavings(seniorGrossSalary)

    val first =
        calculateSavings(
            55000,
            0.12,
            8,
            printInfo = { salary, rate, period, bank -> println("First member's bank: $bank") })
    val second = calculateSavings(
        134000,
        0.2,
        8,
        printInfo = { salary, rate, period, bank -> println("Second member's bank: $bank") })

    println(first + second)
}

fun calculateSavings(
    salary: Int,
    rate: Double = 0.3,
    period: Int = 12,
    printInfo: ((salary: Int, rate: Double, period: Int, bank: Double) -> Unit)? = null
): Double {
    val netSalary = salary * 0.87
    val bank = netSalary * rate * period
    printInfo?.invoke(salary, rate, period, bank)
    return bank
}