import java.io.*;
import java.util.*;

public class Vt4main{

   private static final Scanner input = new Scanner(System.in);
		
   public static void main(String [] args){
   
   Property uusiKiinteisto = new Property();
   InsuranceInfo info = new InsuranceInfo();
   InsInfoContainer cont = new InsInfoContainer();
   
  // if (Property < 5) {
	  
	  String loc;
	  String propTyp;
	  double arvo;
	  int luku;
	  
      System.out.println("Tervetuloa vakuutustietojen varastointipalveluun.");
	  
      System.out.print("Anna uuden kiinteiston tyyppi: ");
      propTyp = input.nextLine();
      uusiKiinteisto.setPropertyType(propTyp);   
	  
      System.out.print("Anna uuden kiinteiston sijaintipaikka: ");
      loc = input.nextLine();
      uusiKiinteisto.setLocation(loc);   

      System.out.print("Anna uuden kiinteiston arvo: ");
      arvo = input.nextDouble();
      info.setKiinteistoArvo(arvo);  

	  
 //  }
   
 //  else {
	   
	  cont.printInsurances();
	  

      System.out.print("Anna arvo, jota vakuutusarvollisesti pienemmat kiinteistot haluat nahda: ");	  
	  luku = input.nextInt();
	  cont.printSmallerProp();
	  
      System.out.print("Anna arvo, jota vakuutusarvollisesti suuremmat kiinteistot haluat nahda: ");	  
	  luku = input.nextInt();	  
	  cont.printLargerProp(); 
	  
  // }
   
   
   
   
   
   
   
   
   }
	
}