<h1>Mobile Notifications</h1>
Typically, your phone provides you with a summary of notifications.<br>

In the initial code provided in the following code snippet, write a program that prints the summary message based on the number of notifications that you received. <br>The message should include:

  * The exact number of notifications when there are less than 100 notifications.<br>
  * 99+ as the number of notifications when there are 100 notifications or more.

```kotlin
fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
}
```
Complete the `printNotificationSummary()` function so that the program prints these lines:<br>


> You have 51 notifications.<br>
> Your phone is blowing up! You have 99+ notifications.<br>

![IMPORTANT]
> Have fun**!!**
