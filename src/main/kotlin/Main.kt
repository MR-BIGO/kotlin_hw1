import java.text.SimpleDateFormat
import java.util.*

fun main() {
    //1
    val array: Array<Int> = arrayOf(2, 4, 3, 1, 5, 9, 7, 4)
    println(sumOfNumbers(array))

    //2
    println(checkPalindrome("radar"))
    println(checkPalindrome("?rad%ar!"))
    println(checkPalindrome("davita"))

    //3
    val obj = Date()
    val currDate = Calendar.getInstance().time

    println(obj.form(currDate))
}


fun sumOfNumbers(array: Array<Int>): Int{

    var sum = 0

    for (i in 0..array.size step 2){
        if (i < array.size) sum += array[i]
    }
    return sum
}

fun checkPalindrome(text: String): Boolean{

    val cleanText: String = text.replace("[.,!?-_#$@%/{}()]".toRegex(), "")

    if (cleanText == cleanText.reversed()) return true
    return false
}

fun Date.form(date: Date): String{
    return SimpleDateFormat("dd, MMMM, yyyy").format(date)
}
