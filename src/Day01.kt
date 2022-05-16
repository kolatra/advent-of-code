fun main() {
    var floor = 0
    val input = readInput("day01")

    for ((index, value) in input[0].split("").withIndex()) {
        when (value) {
            "(" -> floor++
            ")" -> {
                if (floor == 0) {
                    println("entering basement at: ${index+1}")
                }
                floor--
            }
        }
    }

    println("final floor: $floor")
}
