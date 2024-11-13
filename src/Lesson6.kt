//class Person<T,K>(val id: Int, val name: String, val age: Int, val password:K)
//class PersonString (val id: String, val name: String, val age: Int)
//class PersonInt (val id: Int, val name: String, val age: Int)
//fun main(args: Array<String>) {
//    val person1 = Person<Int,String>(367, "Tom", age = 25, "2123131233")
//    val person2 = PersonInt(368, "K1d", age = 18)
//    val person3 = Person<String,Int> (369, "Sam", age = 32,"1234")
//    val person4 = Person<Int,String> (370, "Kate", age = 28, '642232')
//}
//fun main() {
//
//    val tom: Person<Int> = Person(367, "Tom")
//    val bob: Person<String> = Person("A65", "Bob")
//
//    println("${tom.id} - ${tom.name}")
//    println("${bob.id} - ${bob.name}")
//}
//fun<T:Message> send(message: T){
//    println(message.text)
//}
//
//interface Message{
//    val text: String
//}
//class EmailMessage(override val text: String): Message
//class SmsMessage(override val text: String): Message
fun<T> getBiggest (args1:Array<T>,args2:Array<T>):Array<T>{
    if (args1.size > args2.size) return args1
    return args2
}