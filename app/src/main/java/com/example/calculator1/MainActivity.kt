

fun parseTime(input: String): Int {
    // Используем raw string для регулярного выражения
    val regex = """(d+h)?(d+m)?(d+s)?""".toRegex()
    val matchResult = regex.matchEntire(input)
    var totalSeconds = 0

    if (matchResult != null) {
        val groups = matchResult.groupValues
        if (groups[1].isNotEmpty()) {
            totalSeconds += groups[1].dropLast(1).toInt() * 3600
        }
        if (groups[2].isNotEmpty()) {
            totalSeconds += groups[2].dropLast(1).toInt() * 60
        }
        if (groups[3].isNotEmpty()) {
            totalSeconds += groups[3].dropLast(1).toInt()
        }
    }
    return totalSeconds
}