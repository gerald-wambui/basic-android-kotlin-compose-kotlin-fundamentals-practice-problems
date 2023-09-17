fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    var price: Int = 0
    if (age > 0 && age <= 12){
          price = 15
         return price
    }
    else if (age >= 13 && age <= 60 && isMonday != false){
         price = 25
    }
    else if (age >= 13 && age <= 60 && isMonday != true){
         price = 30
    }
    else if (age > 60 && age <= 100){
         price = 20
    }
    else if (age < 0){
        price
    }

    return price
}
