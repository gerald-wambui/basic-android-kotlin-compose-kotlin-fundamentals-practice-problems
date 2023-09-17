fun main() {
    // Fill in the code.
    val celciusToFahrenheit: (Double) -> Double = {celcius -> (celcius * 9/5) + 32 }
    printFinalTemperature(27.0, "Celcius", "Fahrenheit", celciusToFahrenheit)

    val kelvinToCelcius: (Double) -> Double = {kelvin -> kelvin - 273.15}
    printFinalTemperature(350.0, "Kelvin", "Celcius", kelvinToCelcius)

    val fahrenheitToKelvin: (Double) -> Double = {fahrenheit -> (fahrenheit - 32) * 5/9 + 273.15)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin)

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
