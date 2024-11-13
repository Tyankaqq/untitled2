fun main() {
    val list = listOf(1, 2, 3, 4, 3, 2, 1, 5, 6)

    // Создаем карту, которая подсчитывает количество вхождений каждого элемента
    val frequencyMap = list.groupingBy { it }.eachCount()

    // Выводим те элементы, которые встречаются только один раз
    val uniqueElements = list.filter { frequencyMap[it] == 1 }

    println("Элементы, встречающиеся только один раз: $uniqueElements")
}

fun main() {
    val inputString = "hello world"

    // Используем Set для удаления повторяющихся символов
    val uniqueChars = inputString.toSet()

    // Выводим количество различных символов
    println("Количество различных символов: ${uniqueChars.size}")
}

fun main() {
    val numberMap = mapOf("a" to 2, "b" to 3, "c" to 4, "d" to 5)

    // Перемножаем все значения в словаре
    val product = numberMap.values.fold(1) { acc, value -> acc * value }

    // Выводим результат
    println("Произведение всех значений: $product")
}