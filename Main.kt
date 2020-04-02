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
        'a' -> arrayOf("          ",
                       "          ",
                       " .oooo.   ",
                       "`P  )88b  ",
                       " .oP\"888  ",
                       "d8(  888  ",
                       "`Y888\"\"8o ",
                       "          ",
                       "          ",
                       "          ")
        'A' -> arrayOf("      .o.       ",
                       "     .888.      ",
                       "    .8\"888.     ",
                       "   .8' `888.    ",
                       "  .88ooo8888.   ",
                       " .8'     `888.  ",
                       "o88o     o8888o ",
                       "                ",
                       "                ",
                       "                ")
        'b' -> arrayOf(" .o8       ",
                       "\"888       ",
                       " 888oooo.  ",
                       " d88' `88b ",
                       " 888   888 ",
                       " 888   888 ",
                       " `Y8bod8P' ",
                       "           ",
                       "           ",
                       "           ")
        'B' -> arrayOf("oooooooooo.  ",
                       "`888'   `Y8b ",
                       " 888     888 ",
                       " 888oooo888' ",
                       " 888    `88b ",
                       " 888    .88P ",
                       "o888bood8P'  ",
                       "             ",
                       "             ",
                       "             ")
        'c' -> arrayOf("          ",
                       "          ",
                       " .ooooo.  ",
                       "d88' `\"Y8 ",
                       "888       ",
                       "888   .o8 ",
                       "`Y8bod8P' ",
                       "          ",
                       "          ",
                       "          ")
        'C' -> arrayOf("  .oooooo.   ",
                       " d8P'  `Y8b  ",
                       "888          ",
                       "888          ",
                       "888          ",
                       "`88b    ooo  ",
                       " `Y8bood8P'  ",
                       "             ",
                       "             ",
                       "             ")
        'd' -> arrayOf("      .o8  ",
                       "     \"888  ",
                       " .oooo888  ",
                       "d88' `888  ",
                       "888   888  ",
                       "888   888  ",
                       "`Y8bod88P\" ",
                       "          ",
                       "          ",
                       "          ")
        'D' -> arrayOf("oooooooooo.   ",
                       "`888'   `Y8b  ",
                       " 888      888 ",
                       " 888      888 ",
                       " 888      888 ",
                       " 888     d88' ",
                       "o888bood8P'   ",
                       "              ",
                       "              ",
                       "              ")
        'e' -> arrayOf("          ",
                       "          ",
                       " .ooooo.  ",
                       "d88' `88b ",
                       "888ooo888 ",
                       "888    .o ",
                       "`Y8bod8P' ",
                       "          ",
                       "          ",
                       "          ")
        'e' -> 0
        'f' -> arrayOf(" .o88o. ", " 888 `\" ", "o888oo  ", " 888    ", " 888    ", +
        " 888    ", "o888o   ")
        'F' -> 0
        'g' -> arrayOf( "           ", "           ", " .oooooooo ", "888' `88b  ",
                        "888   888  ", "`88bod8P'  ", "`8oooooo.  ", "d\"     YD  ",
                        "\"Y88888P'  ", "           ")
        'G' -> 0
        'h' -> arrayOf("oooo        ",
                       "`888        ",
                       " 888 .oo.   ",
                       " 888P"Y88b  ",
                       " 888   888  ",
                       " 888   888  ",
                       "o888o o888o ",
                       "            ",
                       "            ",
                       "            ")
        'H' -> 0
        'i' -> arrayOf(" o8o  ",
                       " `"'  ",
                       "oooo  ",
                       "`888  ",
                       " 888  ",
                       " 888  ",
                       "o888o ",
                       "      ",
                       "      ",
                       "      ")
        'I' -> 0
        'j' -> arrayOf("    o8o ",
                       "    `"' ",
                       "   oooo ",
                       "   `888 ",
                       "    888 ",
                       "    888 ",
                       "    888 ",
                       "    888 ",
                       ".o. 88P ",
                       "`Y888P  ")
        'J' -> 0
        'k' -> arrayOf("oooo        ",
                       "`888        ",
                       " 888  oooo  ",
                       " 888 .8P'   ",
                       " 888888.    ",
                       " 888 `88b.  ",
                       "o888o o888o ",
                       "            ",
                       "            ",
                       "            ")
        'K' -> 0
        'l' -> arrayOf("oooo  ",
                       "`888  ",
                       " 888  ",
                       " 888  ",
                       " 888  ",
                       " 888  ",
                       "o888o ",
                       "      ",
                       "      ",
                       "      ")
        'L' -> 0
        'm' -> arrayOf("                  ",
                       "                  ",
                       "ooo. .oo.  .oo.   ",
                       "`888P\"Y88bP\"Y88b  ",
                       " 888   888   888  ",
                       " 888   888   888  ",
                       "o888o o888o o888o ",
                       "                  ",
                       "                  ",
                       "                  ")
        'M' -> 0
        'n' -> arrayOf("            ",
                       "            ",
                       "ooo. .oo.   ",
                       "`888P\"Y88b  ",
                       " 888   888  ",
                       " 888   888  ",
                       "o888o o888o ",
                       "            ",
                       "            ",
                       "            ")
        'N' -> 0
        'o' -> arrayOf("          ",
                       "          ",
                       " .ooooo.  ",
                       "d88' `88b ",
                       "888   888 ",
                       "888   888 ",
                       "`Y8bod8P' ",
                       "          ",
                       "          ",
                       "          ")
        'O' -> 0
        'p' -> arrayOf("           ",
                       "           ",
                       "oo.ooooo.  ",
                       " 888' `88b ",
                       " 888   888 ",
                       " 888   888 ",
                       " 888bod8P' ",
                       " 888       ",
                       "o888o      ",
                       "           ")
        'P' -> 0
        'q' -> arrayOf("           ",
                       "           ",
                       " .ooooo oo ",
                       "d88' `888  ",
                       "888   888  ",
                       "888   888  ",
                       "`V8bod888  ",
                       "      888. ",
                       "      8P'  ",
                       "      \"    ")
        'Q' -> 0
        'r' -> arrayOf("         ",
                       "         ",
                       "oooo d8b ",
                       "`888\"\"8P ",
                       " 888     ",
                       " 888     ",
                       "d888b    ",
                       "         ",
                       "         ",
                       "         ")
        'R' -> 0
        's' -> arrayOf("         ",
                       "         ",
                       " .oooo.o ",
                       "d88(  \"8 ",
                       "`\"Y88b.  ",
                       "o.  )88b ",
                       "8\"\"888P' ",
                       "         ",
                       "         ",
                       "         ")
        'S' -> 0
        't' -> arrayOf("    .   ",
                       "  .o8   ",
                       ".o888oo ",
                       "  888   ",
                       "  888   ",
                       "  888 . ",
                       "  \"888\" ",
                       "        ",
                       "        ",
                       "        ")
        'T' -> 0
        'u' -> arrayOf("            ",
                       "            ",
                       "oooo  oooo  ",
                       "`888  `888  ",
                       " 888   888  ",
                       " 888   888  ",
                       " `V88V\"V8P' ",
                       "            ",
                       "            ",
                       "            ")
        'U' -> 0
        'v' -> arrayOf("            ",
                       "            ",
                       "oooo    ooo ",
                       " `88.  .8'  ",
                       "  `88..8'   ",
                       "   `888'    ",
                       "    `8'     ",
                       "            ",
                       "            ",
                       "            ")
        'V' -> 0
        'w' -> arrayOf("                 ",
                       "                 ",
                       "oooo oooo    ooo ",
                       " `88. `88.  .8'  ",
                       "  `88..]88..8'   ",
                       "   `888'`888'    ",
                       "    `8'  `8'     ",
                       "                 ",
                       "                 ",
                       "                 ")
        'W' -> 0
        'x' -> arrayOf("            ",
                       "            ",
                       "oooo    ooo ",
                       " `88b..8P'  ",
                       "   Y888'    ",
                       " .o8"'88b   ",
                       "o88'   888o ",
                       "            ",
                       "            ",
                       "            ")
        'X' -> 0
        'y' -> arrayOf("            ",
                       "            ",
                       "oooo    ooo ",
                       " `88.  .8'  ",
                       "  `88..8'   ",
                       "   `888'    ",
                       "    .8'     ",
                       ".o..P'      ",
                       "`Y8P'       ",
                       "            ")
        'Y' -> 0
        'z' -> arrayOf("           ",
                       "           ",
                       "  oooooooo ",
                       " d'\"\"7d8P  ",
                       "   .d8P'   ",
                       " .d8P'  .P ",
                       "d8888888P  ",
                       "           ",
                       "           ",
                       "           ")
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