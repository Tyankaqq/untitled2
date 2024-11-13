import java.time.LocalDate
import java.time.temporal.ChronoUnit


open class Book(
    val title: String,
    val author: String,
    val publicationYear: Int
) {

    fun calculateBookAge(): Int {
        val currentYear = LocalDate.now().year
        return currentYear - publicationYear
    }


    fun daysSincePublication(): Long {
        val publicationDate = LocalDate.of(publicationYear, 1, 1)
        val currentDate = LocalDate.now()
        return ChronoUnit.DAYS.between(publicationDate, currentDate)
    }
}

fun main() {

    val book = Book("Преступление и наказание", "Фёдор Достоевский", 1866)


    println("Возраст книги: ${book.calculateBookAge()} лет")


    println("Дней с издания книги: ${book.daysSincePublication()} дней")
}