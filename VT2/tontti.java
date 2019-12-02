abstract public class tontti{
	
   String nimi;
   String sijaintiNorth;
   String sijaintiEast;
   double pinta_ala;

   public String getNimi(){  
      return nimi;
   }
   
   public String getSijaintiEast(){
      return sijaintiEast;
   }
   
   public String getSijaintiNorth(){
      return sijaintiNorth;
   }
   
   public double getPinta_ala(){
      return pinta_ala;
   }
	
   public void setNimi(final String nimi){   
      this.nimi = nimi;
   }
   
   public void setSijaintiEast(final String sijaintiEast){
      this.sijaintiEast = sijaintiEast;
   }
   
   public void setSijaintiNorth(final String sijaintiNorth){
	  this.sijaintiNorth = sijaintiNorth;
   }
   
   public void setPinta_ala(final double pinta_ala){
      this.pinta_ala = pinta_ala;
   }
	
   public void tulostaTontti(){
   System.out.println("Tontin nimi on: " + nimi );
   System.out.println("Tontin koordinaatit ovat: leveys: " + sijaintiNorth +" ja pituus: " + sijaintiEast);
   System.out.println("Tontin pinta-ala on: " + pinta_ala + " m2");
   }
   
}