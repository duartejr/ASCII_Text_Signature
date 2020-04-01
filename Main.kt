package signature

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter name and surname: ")
    val name = scanner.nextLine().toUpperCase()
    println("Enter person's status: ")
    val status = scanner.nextLine()
    val lenName = lenString(name)
    val lenStatus = status.length
    val len = if (lenName > lenStatus) lenName else lenStatus + 6
    val lenChar = if (len == lenStatus + 6) len else len + 6
    val asterisks = CharArray(lenChar) { _ -> '*'}
    println(asterisks.joinToString(""))
    printName(name, len)
    printStatus(status, lenChar)
    println(asterisks.joinToString(""))
}


fun alphabet(x: Char): Array<String> {
    return when (x) {
        'A' -> arrayOf("____","|__|","|  |")
        'B' -> arrayOf("___ ", "|__]", "|__]")
        'C' -> arrayOf("____", "|   ", "|___")
        'D' -> arrayOf("___ ", "|  \\", "|__/")
        'E' -> arrayOf("____", "|___", "|___")
        'F' -> arrayOf("____", "|___", "|   ")
        'G' -> arrayOf("____", "| __", "|__]")
        'H' -> arrayOf("_  _", "|__|", "|  |")
        'I' -> arrayOf("_", "|", "|")
        'J' -> arrayOf(" _", " |", "_|")
        'K' -> arrayOf("_  _", "|_/ ", "| \\_")
        'L' -> arrayOf("_   ", "|   ", "|___")
        'M' -> arrayOf("_  _", "|\\/|", "|  |")
        'N' -> arrayOf("_  _", "|\\ |", "| \\|")
        'O' -> arrayOf("____", "|  |", "|__|")
        'P' -> arrayOf("___ ", "|__]", "|   ")
        'Q' -> arrayOf("____", "|  |", "|_\\|")
        'R' -> arrayOf("____", "|__/", "|  \\")
        'S' -> arrayOf("____", "[__ ", "___]")
        'T' -> arrayOf("___", " | ", " | ")
        'U' -> arrayOf("_  _", "|  |", "|__|")
        'V' -> arrayOf("_  _", "|  |", " \\/ ")
        'W' -> arrayOf("_ _ _", "| | |", "|_|_|")
        'X' -> arrayOf("_  _", " \\/ ", "_/\\_")
        'Y' -> arrayOf("_   _", " \\_/ ", "  |  ")
        'Z' -> arrayOf("___ ", "  / ", " /__")
        else -> arrayOf("    ", "    ", "    ")
    }
}

fun printName(string: String, len: Int) {
    var n = 0
    var whiteSpace = (len - lenString(string)) / 2 - 1
    whiteSpace = if (whiteSpace <= 1) 2 else whiteSpace
    val spaces = CharArray(whiteSpace) { _ -> ' '}
    for (n in 0..2) {
        print("*")
        print(spaces.joinToString(""))
        for (i in string.indices) {
            val m = alphabet(string[i])
            print(m[n])
            if (i != string.length -1 ) print(" ")
        }
        print(spaces.joinToString(""))
        if (lenString((string)) + 2 * whiteSpace + 2 < len) print(" ")
        println("*")
    }
}

fun lenString(string: String): Int {
    var len = 0
    for (i in string) {
        val m = alphabet(i)
        len += m[0].length + 1
    }
    return len - 1
}

fun printStatus(string: String, len: Int) {
    print("*  ")
    val spaces = CharArray( (len - string.length - 6) / 2) { _ -> ' '}
    print(spaces.joinToString(""))
    print(string)
    if (2*spaces.size + 6 + string.length < len) print(" ")
    print(spaces.joinToString(""))
    println("  *")
}