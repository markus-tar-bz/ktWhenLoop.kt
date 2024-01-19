fun greeting() {

    var country = ""

    while (country !=null) {
        println("Where are you from?")
        country = readLine().toString()
        when (country) {
            in "USA" -> println("Hello")
            in "India" -> println("Namaste")
            in "exit" -> break
            else -> println("I don't know that!")
        }
        continue
    }
}