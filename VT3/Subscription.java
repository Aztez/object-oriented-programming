public class Subscription {

   private static String lehden_nimi;
   private static String tilaajan_nimi;
   private static String toimitusosoite;
   private double kuukausihinta;
   
   private static double tilauksen_hinta;
   private static String tilauksentyyppi;
   private static int tilauksen_kesto_apu;

   
   public String getTilauksentyyppi(){
      
	  return tilauksentyyppi;
	   
   }   
   
   public String getLehden_nimi(){
      
	  return lehden_nimi;
	   
   }
   
   public String getTilaajan_nimi(){
      
	  return tilaajan_nimi;
	   
   }   
   
   public String getToimitusosoite(){
	   
      return toimitusosoite;
	   
   }   
   
   public double getKuukausihinta(){
      
	  return kuukausihinta;
	   
   }   
   
   public void setTilauksentyyppi(final String tilauksentyyppi){
	   
      this.tilauksentyyppi = tilauksentyyppi;
	  
	  if (tilauksentyyppi == "Kestotilaus") {
	   
	     tilauksen_hinta = tilauksen_hinta * 0.80; // tässä pitäis jotenkin kutsua standingsubista alennusprosenttia, mutta miten???
	   
      }
	  
   }      
   
   public void setLehden_nimi(final String lehden_nimi){
	   
      this.lehden_nimi = lehden_nimi;
	  
   }   
   
   public void setTilaajan_nimi(final String tilaajan_nimi){
	   
      this.tilaajan_nimi = tilaajan_nimi;
	  
   }      
   
   public void setToimitusosoite(final String toimitusosoite){
	   
      this.toimitusosoite = toimitusosoite;
	  
   }      
   
   public void setKuukausihinta(final double kuukausihinta){
	   
      this.kuukausihinta = kuukausihinta;
	  
   }      
   
   
   public static void printInvoice(){
	   
	   System.out.println("Tilauksen tyyppi: "+tilauksentyyppi);
	   System.out.println("Lehden nimi: " +lehden_nimi);
	   System.out.println("Tilaajan nimi: " +tilaajan_nimi);
	   System.out.println("Toimitusosoite: " +toimitusosoite);
	   System.out.println("Laskutettavien kuukausien maara: " +tilauksen_kesto_apu);
	   System.out.println("Tilauksen hinta: " +tilauksen_hinta);
	   
   }
   

     
}