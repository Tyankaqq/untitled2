fun main(args: Array<String>) {
    //1
    val people = sequenceOf("Tom", "Jerry", "SorokaSvin")
    println(people.joinToString())
    //2
    val employes = listOf("Sam","SorokaSobaka.ru")
    val people2 = employes.asSequence()
    println(people2.joinToString())
    //3
    var number = 0
    val numbers = generateSequence(5) { number+=2;if(it==25) null else it+5 }
    println(numbers.take(5).joinToString())
    //4
    val nums = sequence {
        yield(1)
        yield(10)
        yield(4)
    }
    println(nums.joinToString())
    for (i in nums) println("$i")
    println()
    var mans1 = listOf(Human("Tom", 32,),Human("Sam", 21),Human("Nick", 22))
    var mans2 = sequenceOf(Human("Tom", 32,),Human("Sam", 21),Human("Nick", 22))
    var sub1 = mans1.filter { println("Age filter:${it}");it.age>40 }
    println(sub1)
    var sub2 = mans2.filter { println("Age filter:${it}");it.age>40 }
    for (i in sub2) println("$i")
    println()

}
data class Human(val name: String, val age: Int)