import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        // Add exchange rates for your desired currencies here
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.72);
        exchangeRates.put("JPY", 110.0);
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        double fromRate = exchangeRates.getOrDefault(fromCurrency, 1.0);
        double toRate = exchangeRates.getOrDefault(toCurrency, 1.0);

        return amount * (toRate / fromRate);
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Supported currencies: USD, EUR, GBP, JPY");

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the currency you're converting from (e.g., USD): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the currency you're converting to (e.g., EUR): ");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = converter.convert(amount, fromCurrency, toCurrency);

        System.out.printf("%.2f %s is equal to %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);

        scanner.close();
    }
}