//import javax.print.attribute.standard.QueuedJobCount
//
//fun main(){
//    println("Hello World")
//    showMessage("WonderK1d")
//    displayUser(name = "K1d", age = 18)
//    var nums = intArrayOf(4,7,4)
//    mas(nums)
//    printStrings("Маша", "Арина", "Леха")
//    sum(4,65,66,6,64,64,64,4,4)
//    sum(1,5,7,4,7)
//    printCount(3,"a","b","c")
//    val numInt = intArrayOf(1,2,3,4,5)
//    changeNumbers(3,*numInt)
//}
//fun hello(){
//    println("Hello World")
//}
//fun showMessage(message: String){
//    println(message)
//}
//fun displayUser(name: String, age: Int){
//    println("Меня зовут $name, мне $age")
//}
//fun mas (num:IntArray){
//    num[0] =num[1] *2
//    println(num[0])
//}
//fun printStrings(vararg strings: String){
//    for (str in strings){
//        println(str)
//    }
//
//}
//fun sum(vararg nums: Int){
//    var s=0
//    for (num in nums){
//        s+=num
//    }
//    println("s=$s")
//}
//fun printCount(count: Int, vararg str:String,){
//    for(i in 1..count){
//        for (s in str)
//        {
//            print("$s ")
//        }
//    }
//}
//fun changeNumbers(k:Int,vararg nums: Int){
//    for(i in nums) println(i*k)
//
//}
//fun IsAdult(age:Int):Boolean{
//    fun ageIsValid():Boolean = (age > 0) and (age <150)
//    return ageIsValid() and (age>= 18)
//}
fun main(args: Array<String>) {
    print("Введите первое число:")
    val a = readln().toInt()
    print("Введите второе число:")
    val b = readln().toInt()
//    println("$a+$b=${action(a, b,::add)}")
//    println("$a-$b=${action(a, b,::sub)}")
//    println("$a*$b=${action(a, b,::mul)}")
//    println("$a/$b=${action(a, b,::div)}")
//    println("$a%$b=${action(a, b,::mod)}")
//    print("Введите знак операции")
//    val c = readln().toCharArray()
//    val op = selectAction(c[0])
    val sum = fun(x:Int, y:Int):Int = x + y
    val message = fun() = println("hello")
    println(sum(a,b))


}
fun action(x:Int,y:Int,op:(Int,Int)->Int):Int=op(x,y)
fun add(a: Int, b: Int): Int = a + b
fun sub(a: Int, b: Int): Int = a - b
fun mul(a: Int, b: Int): Int = a * b
fun div(a: Int, b: Int): Int = a / b
fun mod(a: Int, b: Int): Int = a % b
fun empty(a: Int, b: Int): Int = 0

//Возвращение функции из функции
fun selectAction(key:Char):(Int,Int)->Int{
    return when(key){
        '+'-> ::add
        '-'-> ::sub
        '*'-> ::mul
        '/'-> ::div
        '%'-> ::mod
        else -> ::empty
    }
}
//Анонимная функция как аргумент функции
fun doOperation(x:Int,y:Int,op:(Int,Int)->Int) =println(op(x,y))