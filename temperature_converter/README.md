<h1>Temperature Converter</h1>
There are three main temperature scales used in the world: Celsius, Fahrenheit, and Kelvin.<br>

In the initial code provided in the following code snippet, write a program that converts a temperature from one scale to another with these formulas:<br>

> Celsius to Fahrenheit: ° F = 9/5 (° C) + 32<br>
> Kelvin to Celsius: ° C = K - 273.15<br>
> Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15<br>
Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.

```kotlin
fun main() {
    // Fill in the code.
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
```
Complete the *main()*  function so that it calls the *printFinalTemperature()* function and prints the following lines.<br> You need to pass arguments for the temperature and conversion formula.<br>** Hint:** you may want to use Double values to avoid Integer truncation during division operations.


> 27.0 degrees Celsius is 80.60 degrees Fahrenheit.
> 350.0 degrees Kelvin is 76.85 degrees Celsius.
> 10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
