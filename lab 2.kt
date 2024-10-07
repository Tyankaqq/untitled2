//20 вариант

fun main() {
    val a = 15
    val b = 28
    val c = 35

    if (areCoprime(a, b, c)) {
        println("Числа $a, $b и $c являются взаимно простыми.")
    } else {
        println("Числа $a, $b и $c не являются взаимно простыми.")
    }
}

fun areCoprime(a: Int, b: Int, c: Int): Boolean {
    return gcd(a, b) == 1 && gcd(b, c) == 1 && gcd(a, c) == 1
}

fun gcd(x: Int, y: Int): Int {
    return if (y == 0) x else gcd(y, x % y)
}
