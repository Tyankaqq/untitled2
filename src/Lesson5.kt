////object person {
////    val name = "Tom"
////    val age = 20
////    fun sayHello() {
////        println("Hello, $name, $age")
////    }
////}
//
//
//
//fun main(args: Array<String>) {
////    val userAcc = Person("Tom", "123456")
////    userAcc.showDetalis()
////    val acc = BankAccount(10000)
////    acc.Transaction().pay(25000)
////    val day: Day = Day.MONDAY
////    println(day)
////    println(Day.TUESDAY)
////    val day1: Day = Day.TUESDAY
////    println(day1.value)
////    println("Name: ${person.name}, Age: ${person.age}")
////    person.sayHello()
//    Car.printCount()
//    Car("BMW")
//    Car("Toyota")
//    Car.printCount()
//}
//
//
//
//
//
//
////class Person(username: String, password: String){
////    private val account:Account=Account(username, password)
////    private class Account(val username: String, val password: String)
////    fun showDetails(){
////        println(account.username)
////    }
////}
////
////class BankAccount(private var sum:Int){
////    fun showDetails(){
////        println("$sum={sum}")
////    }
////}
//
//
////data-класс необходим только для хранения некоторых данных
data class  Person (val name:String,val age:Int)
//enum class Day{
//    MONDAY, TUESDAY,WEDNESDAY, THURSDAY,  FRIDAY, SATURDAY, SUNDAY
//}
////Анонимные классы и объекты
////var person = object {
////    val name = "Tom"
////    val age = 20
////    fun sayHello() {
////        println("Hello, $name, $age")
////    }
////companion - объекты
//class Car(val model:String){
//    companion object{
//        var counter = 0
//        fun printCount() = println("Counter: $counter")
//    }
//}