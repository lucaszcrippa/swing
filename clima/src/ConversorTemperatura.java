
public class ConversorTemperatura {
private double temp;
    private String clima;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public ConversorTemperatura(double temp) {
        this.temp = temp;
    }

    public double temperaturaFah() {
        double conta = (temp - 32) * 5 / 9;
        return conta;
    }

    public double temperaturaCell() {
        double conta = (temp * 9 / 5) + 32;
        return conta;
    }

    public String mostrarClima() {
        if (temp <= 64.4) {
            return "Clima frio.";
        } else if (temp >= 66.2 && temp <= 73.4) {
            return "Clima agradável.";
        } else if (temp >= 75.2 && temp <= 95) {
            return "Clima quente.";
        } else {
            return "Clima muito quente.";
        }
    }

    @Override
    public String toString() {
        return "ConversorTemp{" + temp + '}';
    }
    
    
    
}

