//Вариант 14
fun main() {
    val list = listOf(1, 2, 3, 4, 3, 2, 1, 5, 6)

  
    val frequencyMap = list.groupingBy { it }.eachCount()

  
    val uniqueElements = list.filter { frequencyMap[it] == 1 }

    println("Элементы, встречающиеся только один раз: $uniqueElements")
}

fun main() {
    val inputString = "hello world"


    val uniqueChars = inputString.toSet()


    println("Количество различных символов: ${uniqueChars.size}")
}

fun main() {
    val numberMap = mapOf("a" to 2, "b" to 3, "c" to 4, "d" to 5)

    val product = numberMap.values.fold(1) { acc, value -> acc * value }


    println("Произведение всех значений: $product")
}
