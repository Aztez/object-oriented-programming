import java.util.*;

public class Pankkitili {
   
   private String tilinumero;
   private String omistaja;
   private double saldo;
   private double lisaa_saldo;
   private double vahenna_saldo;
   
   
   public String getTilinumero(){
      
	  return tilinumero;
	   
   }   
   
   public String getOmistaja(){
      
	  return omistaja;
	   
   }      
   
   public double getLisaa_saldo(){
	   
	  return lisaa_saldo;
	   
   }      
   
   public double getVahenna_saldo(){
	   
	  return vahenna_saldo;
	   
   }      
     
   
   public void setTilinumero(final String tilinumero){
	   
      this.tilinumero = tilinumero;
	  
   }   
   
   public void setOmistaja(final String omistaja){
	   
      this.omistaja = omistaja;
	  
   }     
  
   public void setSaldo(final double saldo){
	   
      this.saldo = saldo;
	  
   }  
   
   public void setLisaa_saldo(final double lisaa_saldo){
	   
      saldo += lisaa_saldo;
	  System.out.println("Tilisi saldo on nyt: " +saldo);
	  
   }
   
   public void setVahenna_saldo(final double vahenna_saldo){
	   
      saldo -= vahenna_saldo;
	  System.out.println("Tilisi saldo on nyt: " +saldo);
	  
   }
   
 
   public void printTiedot(){
	   
	   System.out.println("\nTilin tiedot:");
	   System.out.println("Tilin omistaa " +omistaja);
	   System.out.println("Tilinumerosi on " +tilinumero);
	   System.out.println("Tilin saldo on " +saldo);
	   
   }
  
	  
}
   