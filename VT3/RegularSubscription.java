public class RegularSubscription extends Subscription {
   
   protected int tilauksen_kesto;
   protected int tilauksen_hinta;
   protected double kuukausihinta;
   
   public int getTilauksen_kesto(){
      
	  return tilauksen_kesto;
	   
   }
   
   public double getKuukausihinta(){
      
	  return kuukausihinta;
	   
   }   
   
   public int getTilauksen_hinta(){
      
	  return tilauksen_hinta;
	   
   }   
   
   public void setTilauksen_kesto(final int tilauksen_kesto){
	   
      this.tilauksen_kesto = tilauksen_kesto;
	  
   }     
   
   public void setKuukausihinta(final double kuukausihinta){
	   
      this.kuukausihinta = kuukausihinta;
	  
   }   
   
   public void setTilauksen_hinta(final int tilauksen_hinta){
	  int apuri;
      apuri = (int) kuukausihinta;	  
	   
      this.tilauksen_hinta = apuri * tilauksen_kesto;
   }   
   
   
   
}