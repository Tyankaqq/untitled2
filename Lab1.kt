//11.73


fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 15, 20, 25, 30)

    val evenCount = array.count { it % 2 == 0 }
    val endingWithFiveCount = array.count { it % 10 == 5 }

    println("Количество четных элементов: $evenCount")
    println("Количество элементов, оканчивающихся на 5: $endingWithFiveCount")
}



//12.70
fun main() {
    val results = arrayOf(
        intArrayOf(2, 1, 3, 0, 4, 5, 0, 2, 1, 3, 2, 4, 5, 3, 0, 1, 1, 3, 4, 2, 1, 2),
        intArrayOf(1, 2, 3, 0, 2, 4, 5, 1, 2, 3, 1, 0, 2, 2, 3, 4, 1, 0, 2, 1, 0, 2)
    )

    var wins = 0
    var draws = 0
    var losses = 0
    var gamesWithDiffGreaterThanThree = 0
    var totalPoints = 0

    for (i in results[0].indices) {
        val scored = results[0][i]
        val missed = results[1][i]

        when {
            scored > missed -> {
                println("Игра ${i + 1}: выигрыш")
                wins++
                totalPoints += 3
            }
            scored == missed -> {
                println("Игра ${i + 1}: ничья")
                draws++
                totalPoints += 1
            }
            else -> {
                println("Игра ${i + 1}: проигрыш")
                losses++
            }
        }

        if (scored - missed >= 3) {
            gamesWithDiffGreaterThanThree++
        }
    }

    println("Количество выигрышей: $wins")
    println("Количество ничьих: $draws")
    println("Количество проигрышей: $losses")
    println("Количество игр с разностью больше или равной 3: $gamesWithDiffGreaterThanThree")
    println("Общее число очков: $totalPoints")
}