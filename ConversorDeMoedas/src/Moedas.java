public class Moedas {
    private ConversionRates conversion_rates;

    public ConversionRates getConversionRates() {
        return conversion_rates;
    }
}

class ConversionRates {
    private double USD;
    private double BRL;
    private double EUR;
    private double GBP;
    private double JPY;
    private double TRY;

    public double getUSD() {
        return USD;
    }

    public double getBRL() {
        return BRL;
    }

    public double getEUR() {
        return EUR;
    }

    public double getGBP() {
        return GBP;
    }

    public double getJPY() {
        return JPY;
    }

    public double getTRY() {
        return TRY;
    }
}
