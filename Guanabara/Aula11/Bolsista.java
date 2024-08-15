package POO.Guanabara.Aula11;

public class Bolsista extends Estudante 
{
   private double bolsa;

   public void renovarBolsa()
   {
      System.out.println("Renovando bolsa de " + getName());
   }

   @Override
   public void pagarMensalidade()
   {
      System.out.println(getName() + " é bolsitsta, pagamento facilitado");
   }

   public double getBolsa() {
       return bolsa;
   }
   public void setBolsa(double bolsa) {
       this.bolsa = bolsa;
   }
}