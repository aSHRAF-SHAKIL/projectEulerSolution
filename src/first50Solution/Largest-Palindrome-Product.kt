package src.first50Solution
//Date:05/13/24

fun isPalindrome(n: Int): Boolean {
    return n.toString() == n.toString().reversed()//to check ispalindrome
}

fun main() {
    var largestPalindrome = 0
    var a = 0
    var b = 0
    for (i in 100 until 1000) {
        for (j in 100 until 1000) {
            val product = i * j
            if (isPalindrome(product) && product > largestPalindrome) {
                largestPalindrome = product
                a = i
                b = j
            }
        }
    }
    println("The two numbers are: $a and $b")	
    println("The largest palindrome made from the product of two 3-digit numbers is: $largestPalindrome")
}