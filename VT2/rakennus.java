public class rakennus extends tontti{
	
   private double taloPinta_ala;
   private int huonelkm;
	
	
   public double getTaloPinta_ala(){
      return taloPinta_ala;
   }
	
   public int getHuonelkm(){
      return huonelkm;
   }
	
   public void setTaloPinta_ala(final double taloPinta_ala){
      this.taloPinta_ala = taloPinta_ala;
   }
	
	
   public void setHuonelkm(final int huonelkm){
      this.huonelkm = huonelkm;
   }
	
   public void tulostaRakennus(){
   System.out.println("\nRakennuksen tiedot:");	
   System.out.println("Asunnon huoneiden lukumaara: " + huonelkm);
   System.out.println("Asunnon pinta-ala on: " + taloPinta_ala + " m2");
   }

}
	
	