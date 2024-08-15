package POO.Guanabara.Aula10;

public class Funcionario extends Person
{
    private String sector;
    private boolean isWorking;


    public void changeJob(String sector)
    {
        this.isWorking = ! this.isWorking;
    }

    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isWorking() {
        return isWorking;
    }
    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }
}
