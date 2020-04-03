package signature

import java.io.File
import java.util.*
import kotlin.reflect.typeOf

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter name and surname: ")
    val name = scanner.nextLine()
    printName(name, 10)

    /*println("Enter person's status: ")
    val status = scanner.nextLine()
    val lenName = lenString(name)
    val lenStatus = status.length
    val len = if (lenName > lenStatus) lenName else lenStatus + 4
    val asterisks = CharArray(len) { _ -> '*'}
    println(asterisks.joinToString(""))

    printStatus(status, len)
    println(asterisks.joinToString(""))*/
}

fun roman(x: Char): Array<String> {
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
        'E' -> arrayOf("oooooooooooo ",
                "`888'     `8 ",
                " 888         ",
                " 888oooo8    ",
                " 888    \"    ",
                " 888       o ",
                "o888ooooood8 ",
                "             ",
                "             ",
                "             ")
        'f' -> arrayOf(" .o88o. ",
                " 888 `\" ",
                "o888oo  ",
                " 888    ",
                " 888    ",
                " 888    ",
                "o888o   ",
                "        ",
                "        ",
                "        ")
        'F' -> arrayOf("oooooooooooo ",
                "`888'     `8 ",
                " 888         ",
                " 888oooo8    ",
                " 888    \"    ",
                " 888         ",
                "o888o        ",
                "             ",
                "             ",
                "             ")
        'g' -> arrayOf( "           ",
                "           ",
                " .oooooooo ",
                "888' `88b  ",
                "888   888  ",
                "`88bod8P'  ",
                "`8oooooo.  ",
                "d\"     YD  ",
                "\"Y88888P'  ",
                "           ")
        'G' -> arrayOf("  .oooooo.    ",
                " d8P'  `Y8b   ",
                "888           ",
                "888           ",
                "888     ooooo ",
                "`88.    .88'  ",
                " `Y8bood8P'   ",
                "              ",
                "              ",
                "              ")
        'h' -> arrayOf("oooo        ",
                "`888        ",
                " 888 .oo.   ",
                " 888P\"Y88b  ",
                " 888   888  ",
                " 888   888  ",
                "o888o o888o ",
                "            ",
                "            ",
                "            ")
        'H' -> arrayOf("ooooo   ooooo ",
                "`888'   `888' ",
                " 888     888  ",
                " 888ooooo888  ",
                " 888     888  ",
                " 888     888  ",
                "o888o   o888o ",
                "              ",
                "              ",
                "              ")
        'i' -> arrayOf(" o8o  ",
                " `\"'  ",
                "oooo  ",
                "`888  ",
                " 888  ",
                " 888  ",
                "o888o ",
                "      ",
                "      ",
                "      ")
        'I' -> arrayOf("ooooo ",
                "`888' ",
                " 888  ",
                " 888  ",
                " 888  ",
                " 888  ",
                "o888o ",
                "      ",
                "      ",
                "      ")
        'j' -> arrayOf("    o8o ",
                "    `\"' ",
                "   oooo ",
                "   `888 ",
                "    888 ",
                "    888 ",
                "    888 ",
                "    888 ",
                ".o. 88P ",
                "`Y888P  ")
        'J' -> arrayOf("   oooo ",
                "   `888 ",
                "    888 ",
                "    888 ",
                "    888 ",
                "    888 ",
                ".o. 88P ",
                "`Y888P  ",
                "        ",
                "        ")
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
        'K' -> arrayOf("oooo    oooo ",
                "`888   .8P'  ",
                " 888  d8'    ",
                " 88888[      ",
                " 888`88b.    ",
                " 888  `88b.  ",
                "o888o  o888o ",
                "             ",
                "             ",
                "             ")
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
        'L' -> arrayOf("ooooo        ",
                "`888'        ",
                " 888         ",
                " 888         ",
                " 888         ",
                " 888       o ",
                "o888ooooood8 ",
                "             ",
                "             ",
                "             ")
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
        'M' -> arrayOf("ooo        ooooo ",
                "`88.       .888' ",
                " 888b     d'888  ",
                " 8 Y88. .P  888  ",
                " 8  `888'   888  ",
                " 8    Y     888  ",
                "o8o        o888o ",
                "                 ",
                "                 ",
                "                 ")
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
        'N' -> arrayOf("ooooo      ooo ",
                "`888b.     `8' ",
                " 8 `88b.    8  ",
                " 8   `88b.  8  ",
                " 8     `88b.8  ",
                " 8       `888  ",
                "o8o        `8  ",
                "               ",
                "               ",
                "               ")
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
        'O' -> arrayOf("  .oooooo.   ",
                " d8P'  `Y8b  ",
                "888      888 ",
                "888      888 ",
                "888      888 ",
                "`88b    d88' ",
                " `Y8bood8P'  ",
                "             ",
                "             ",
                "             ")
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
        'P' -> arrayOf("ooooooooo.   ",
                "`888   `Y88. ",
                " 888   .d88' ",
                " 888ooo88P'  ",
                " 888         ",
                " 888         ",
                "o888o        ",
                "             ",
                "             ",
                "             ")
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
        'Q' -> arrayOf("  .oooooo.      ",
                " d8P'  `Y8b     ",
                "888      888    ",
                "888      888    ",
                "888      888    ",
                "`88b    d88b    ",
                " `Y8bood8P'Ybd' ",
                "                ",
                "                ",
                "                ")
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
        'R' -> arrayOf("ooooooooo.   ",
                "`888   `Y88. ",
                " 888   .d88' ",
                " 888ooo88P'  ",
                " 888`88b.    ",
                " 888  `88b.  ",
                "o888o  o888o ",
                "             ",
                "             ",
                "             ")
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
        'S' -> arrayOf(" .oooooo..o ",
                "d8P'    `Y8 ",
                "Y88bo.      ",
                " `\"Y8888o.  ",
                "     `\"Y88b ",
                "oo     .d8P ",
                "8\"\"88888P'  ",
                "            ",
                "            ",
                "            ")
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
        'T' -> arrayOf("ooooooooooooo ",
                "8'   888   `8 ",
                "     888      ",
                "     888      ",
                "     888      ",
                "     888      ",
                "    o888o     ",
                "              ",
                "              ",
                "              ")
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
        'U' -> arrayOf("ooooo     ooo ",
                "`888'     `8' ",
                " 888       8  ",
                " 888       8  ",
                " 888       8  ",
                " `88.    .8'  ",
                "   `YbodP'    ",
                "              ",
                "              ",
                "              ")
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
        'V' -> arrayOf("oooooo     oooo ",
                " `888.     .8'  ",
                "  `888.   .8'   ",
                "   `888. .8'    ",
                "    `888.8'     ",
                "     `888'      ",
                "      `8'       ",
                "                ",
                "                ",
                "                ")
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
        'W' -> arrayOf("oooooo   oooooo     oooo ",
                " `888.    `888.     .8'  ",
                "  `888.   .8888.   .8'   ",
                "   `888  .8'`888. .8'    ",
                "    `888.8'  `888.8'     ",
                "     `888'    `888'      ",
                "      `8'      `8'       ",
                "                         ",
                "                         ",
                "                         ")
        'x' -> arrayOf("            ",
                "            ",
                "oooo    ooo ",
                " `88b..8P'  ",
                "   Y888'    ",
                " .o8\"'88b   ",
                "o88'   888o ",
                "            ",
                "            ",
                "            ")
        'X' -> arrayOf("ooooooo  ooooo ",
                " `8888    d8'  ",
                "   Y888..8P    ",
                "    `8888'     ",
                "   .8PY888.    ",
                "  d8'  `888b   ",
                "o888o  o88888o ",
                "               ",
                "               ",
                "               ")
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
        'Y' -> arrayOf("oooooo   oooo ",
                " `888.   .8'  ",
                "  `888. .8'   ",
                "   `888.8'    ",
                "    `888'     ",
                "     888      ",
                "    o888o     ",
                "              ",
                "              ",
                "              ")
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
        'Z' -> arrayOf(" oooooooooooo ",
                "d'\"\"\"\"\"\"d888' ",
                "      .888P   ",
                "     d888'    ",
                "   .888P      ",
                "  d888'    .P ",
                ".8888888888P  ",
                "              ",
                "              ",
                "              ")
        else -> arrayOf("          ", "          ", "          ", "          ",
                        "          ", "          ", "          ", "          ",
                        "          ", "          ", "          ")
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
    for (n in 0..9) {
        print("88 ")
        for (i in string) {
            val m = roman(i)
            print(m[n])
        }
        println(" 88")
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