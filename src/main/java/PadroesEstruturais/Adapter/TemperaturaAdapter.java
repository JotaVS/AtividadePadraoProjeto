package PadroesEstruturais.Adapter;

public class TemperaturaAdapter {
    private final TemperaturaFahrenheit adaptee;

    public TemperaturaAdapter(TemperaturaFahrenheit adaptee) {
        this.adaptee = adaptee;
    }

    public double getTemperatureEmCelsius() {
        return (adaptee.getTemperaturaFahrenheit() - 32) * 5.0 / 9.0;
    }

    public void setTemperatureEmCelsius(double temperatureInCelsius) {
        adaptee.setTemperaturaFahrenheit((temperatureInCelsius * 9.0 / 5.0) + 32);
    }
}
