package src.first50Solution

//kotlin solution 03/27/2024

fun main() {
   
    val limit = 1000
    var sum = 0

    for (i in 1 until limit) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }

    println("The sum of all multiples of 3 and 5 below $limit is: $sum")   
}

//Answer:  233168
