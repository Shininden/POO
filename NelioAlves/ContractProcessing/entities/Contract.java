package POO.NelioAlves.ContractProcessing.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract 
{
    private LocalDate date;
    private double totalValue;
    private List<Installment> installments = new ArrayList<>();
    
    public Contract(LocalDate date, double totalValue) 
    {
        this.date = date;
        this.totalValue = totalValue;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}