fun main(args: Array<String>)
{
    val cats = listOf(Cat("Barsik", 3),
        Cat("Vaska", 2),
        Cat("Arinka",17))
    println(cats.size)
    println(cats.isEmpty())
    println(cats.contains(Cat("Barsik", 3)))
    for (cat in cats) println(cat)
    val numbers = listOf(1,2,3,4,5)
    println(numbers)

    println(numbers.get(3))
    println(numbers[3])
    //изменяемые списки arrayListOf(), mutableListOf()
    var mut1:ArrayList<Int> = arrayListOf(1,2,3,4,5)
    var mut2:MutableList<Int> = arrayListOf(1,2,3,4,5)
    mut1.add(6);
    println(mut1)
}

data class Cat(val name:String,val age:Int)