package signature

import java.io.File
import java.util.*
import kotlin.reflect.typeOf

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter name and surname: ")
    val name = scanner.nextLine()
    printFile(name)
    /*println("Enter person's status: ")
    val status = scanner.nextLine()
    val lenName = lenString(name)
    val lenStatus = status.length
    val len = if (lenName > lenStatus) lenName else lenStatus + 4
    val asterisks = CharArray(len) { _ -> '*'}
    println(asterisks.joinToString(""))
    printName(name, len)
    printStatus(status, len)
    println(asterisks.joinToString(""))*/
}

fun roman(x: Char): Comparable<in Any> {
    return when (x) {
        'a' -> arrayOf("          ", "          ", " .oooo.   ", "`P  )88b  ", +
                " .oP\"888  ", "d8(  888  ", "`Y888\"\"8o ")
        'A' -> arrayOf()
        'b' -> arrayOf(" .o8       ", "\"888       ", " 888oooo.  ", " d88' `88b ", +
                " 888   888 ", " 888   888 ", " `Y8bod8P' ")
        'B' -> 0
        'c' -> arrayOf("          ", "          ", " .ooooo.  ", "d88' `\"Y8 ", +
                    "888       ", "888   .o8 ", "`Y8bod8P' ")
        'C' -> 0
        'd' -> arrayOf("      .o8  ", "     \"888  ", " .oooo888  ", "d88' `888  ", +
                    "888   888  ", "888   888  ", "`Y8bod88P\" ")
        'D' -> 0
        'e' -> arrayOf("          ", "          ", " .ooooo.  ", "d88' `88b ", +
                    "888ooo888 ", "888    .o ", "`Y8bod8P' ")
        'e' -> 0
        'f' -> arrayOf(" .o88o. ", " 888 `\" ", "o888oo  ", " 888    ", " 888    ", +
                    " 888    ", "o888o   ")
        'F' -> 0
        'g' -> 0
        'G' -> 0
        'h' -> 0
        'H' -> 0
        'i' -> 0
        'I' -> 0
        'j' -> 0
        'J' -> 0
        'k' -> 0
        'K' -> 0
        'l' -> 0
        'L' -> 0
        'm' -> 0
        'M' -> 0
        'n' -> 0
        'N' -> 0
        'o' -> 0
        'O' -> 0
        'p' -> 0
        'P' -> 0
        'q' -> 0
        'Q' -> 0
        'r' -> 0
        'R' -> 0
        's' -> 0
        'S' -> 0
        't' -> 0
        'T' -> 0
        'u' -> 0
        'U' -> 0
        'v' -> 0
        'V' -> 0
        'w' -> 0
        'W' -> 0
        'y' -> 0
        'Y' -> 0
        'z' -> 0
        'Z' -> 0
        else -> 1
    }
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

fun printName(string: String, len: Int) {
    var n = 0
    val whiteSpace = (len - lenString(string) + 2) / 2
    val spaces = CharArray(whiteSpace) { _ -> ' '}
    for (n in 0..2) {
        print("*")
        print(spaces.joinToString(""))
        for (i in string) {
            val m = alphabet(i)
            print(m[n])
            print(" ")
        }
        print(spaces.joinToString(""))
        println("*")
    }
}

fun lenString(string: String): Int {
    var len = 4
    for (i in string) {
        val m = alphabet(i)
        len += m[0].length + 1
    }
    return len
}

fun printStatus(string: String, len: Int) {
    print("*")
    val spaces = CharArray( (len - 2 - string.length) / 2) { _ -> ' '}
    print(spaces.joinToString(""))
    print(string)
    if (2*spaces.size + 2 + string.length < len) print(" ")
    print(spaces.joinToString(""))
    println("*")
}