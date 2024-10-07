fun main(args: Array<String>) {
    val userAcc = Person("Tom", "+79114575345")
    userAcc.showDetalis()
    val acc = BankAccount(10000)
    acc.Transaction().pay(25000)
}






class Person(username: String, password: String){
    private val account:Account=Account(username, password)
    private class Account(val username: String, val password: String)
    fun showDetails(){
        println(account.username)
    }
}

class BankAccount(private var sum:Int){
    fun showDetails(){
        println("$sum={sum}")
    }
}