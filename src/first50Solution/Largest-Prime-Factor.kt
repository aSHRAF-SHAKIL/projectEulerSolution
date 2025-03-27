package src.first50Solution

fun main(){
    var number = 600851475143L
    var factors = mutableListOf<Long>()
    var divisor = 2L

    while (number > 1) {
        while (number % divisor == 0L) {
            factors.add(divisor)
            number /= divisor
        }
        divisor++
        
    }   
  println(factors.maxOrNull())//lergest prime factor
}
 
