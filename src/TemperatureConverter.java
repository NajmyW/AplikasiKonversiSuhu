/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class TemperatureConverter {

    // Method untuk mengonversi suhu
    public double convertTemperature(double temp, String fromUnit, String toUnit) {
        // Langkah 1: Konversi suhu dari unit asal ke Celsius
        double tempInCelsius;
        
        // Konversi dari unit asal ke Celsius
        switch (fromUnit) {
            case "Celsius":
                tempInCelsius = temp;
                break;
            case "Fahrenheit":
                tempInCelsius = (temp - 32) * 5 / 9; // Konversi Fahrenheit ke Celsius
                break;
            case "Kelvin":
                tempInCelsius = temp - 273.15; // Konversi Kelvin ke Celsius
                break;
            case "Reamur":
                tempInCelsius = temp * 5 / 4; // Konversi Reamur ke Celsius
                break;
            default:
                throw new IllegalArgumentException("Unit tidak dikenal: " + fromUnit);
        }

        // Langkah 2: Konversi suhu dari Celsius ke unit tujuan
        double result;
        switch (toUnit) {
            case "Celsius":
                result = tempInCelsius;
                break;
            case "Fahrenheit":
                result = (tempInCelsius * 9 / 5) + 32; // Konversi Celsius ke Fahrenheit
                break;
            case "Kelvin":
                result = tempInCelsius + 273.15; // Konversi Celsius ke Kelvin
                break;
            case "Reamur":
                result = tempInCelsius * 4 / 5; // Konversi Celsius ke Reamur
                break;
            default:
                throw new IllegalArgumentException("Unit tidak dikenal: " + toUnit);
        }
        
        // Mengembalikan hasil konversi suhu
        return result;
    }

}
