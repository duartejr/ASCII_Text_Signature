package signature

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val name = scanner.nextLine().toUpperCase()
    val asterisks = CharArray(name.length) { _ -> '*'}
    //println(asterisks.joinToString(""))
    newString(name)
    //println(asterisks.joinToString(""))
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
        'R' -> arrayOf("____", "|__/", "| \\ ")
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

fun newString(string: String) {
    var n = 0
    for (n in 0..2) {
        for (i in string) {
            val m = alphabet(i)
            print(m[n])
            print("  ")
        }
        println("")
    }
}

