package io.github.tundraclimate

fun main() {
    val regex = readRegex("Please type a Regex> ")
    while (true) {
        print("String to Check> ")
        val str = readLine() ?: break
        if (str.isBlank()) break
        println(regex.matches(str))
    }
    println("Regex Checker Closed.")
}

fun readRegex(prefix: String): Regex {
    print(prefix)
    var reg = readLine()
    while (reg.isNullOrBlank()) {
        print(prefix)
        reg = readLine()
    }
    return Regex(reg)
}