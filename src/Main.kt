import kotlin.random.Random
fun main(args: Array<String>) {
var mas = Array(Random.nextInt(10,50))
{Random.nextInt(10,50) -30}
for (i in mas)
print("$i")
        println()
var positive = 0
var negative = 0
var sumPos = 0.0
var sumNeg = 0.0
for (i in mas)
{
    if (i > 0) {
        sumPos += 1
        positive++
    } else if (i < 0)
    {
        sumNeg+=1
        negative++
    }
}
    println(String.format("Среднее арифметическо положительных %6.2f", sumPos/positive))
    println(String.format("Среднее арифметическо отрицательных %6.2f", sumNeg/negative))

}

