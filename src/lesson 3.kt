



class Person
{
    var name : String = "undefined"
    var age : Int = 20
    constructor(_name: String, _age: Int){
        name = _name
        age = _age
    }
    fun print() {
        println("Name: $name, age: $age")
    }
}
class Human(val)
fun main() {
    val bob: Person = Person()  // создаем объект
    println(bob.name)       // Undefined
    println(bob.age)        // 18

    bob.name = "Bob"
    bob.age = 25

    println(bob.name)       // Bob
    println(bob.age)        // 25
    bob.print()
}
}