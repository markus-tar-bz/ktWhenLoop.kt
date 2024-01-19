fun main() {

    whenn()
    greeting()
}

fun whenn(){

    println("Enter Your Age:")
    val age = readLine()?.toInt()
    val x = 55
    //could also be written as:
    //when(readLine()?.toInt()) disregarding tha variable


    when(age) { //a better version of if else and switch statement in java,
        //unlike if statement when is only dependent on one variable as a parameter, if(age in 0..5 && x =6)
        in 0..5 -> {
            println("You're a young kid")
            println("")
        }
        in 6..17 -> println("You're a teenager")
        18 -> println("Finally, you're 18")
        19,20 -> println("You're a young adult")
        in 21..65 -> println("You're an adult")
        66 -> if (x == 6) { //only way to implement more than 1 var in while loop
            println("KPI")
        }
        else -> println("You're really old")
    }
}
