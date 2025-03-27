package src.first50Solution

//kotlin solution 3/29/2024
fun main() {
    val limit = 4000000
    var a = 1
    var b = 2
    var sum = 0

    while (b <= limit) {
        if (b % 2 == 0) {
            sum += b
        }
        val nextTerm = a + b
        a = b
        b = nextTerm
    }

    println(" the sum of the even-valued terms exceeding $limit is: $sum")
}
