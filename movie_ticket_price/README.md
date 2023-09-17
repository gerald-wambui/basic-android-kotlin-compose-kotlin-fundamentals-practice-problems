 \t\t **Movie Ticket** \n
 [source](https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems#2)
item Movie tickets are typically priced differently based on the age of moviegoers.

In the initial code provided in the following code snippet, write a program that calculates these age-based ticket prices:

A children's ticket price of $15 for people 12 years old or younger.
A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
A -1 value to indicate that the price is invalid when a user inputs an age outside of the age specifications.

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
}
Complete the ticketPrice() function so that the program prints these lines:


The movie ticket price for a person aged 5 is $15.
The movie ticket price for a person aged 28 is $25.
The movie ticket price for a person aged 87 is $20.
