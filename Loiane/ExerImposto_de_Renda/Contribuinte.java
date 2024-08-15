package POO.Loiane.ExerImposto_de_Renda;

public class Contribuinte 
{
    private String name;
    private String tipoDoc;
    private double income;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
}