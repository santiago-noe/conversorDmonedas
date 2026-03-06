import java.util.Map;

public class Moneda {

    private Map<String, Double> rates;

    public double getRate(String moneda) {
        return rates.get(moneda);
    }

}
