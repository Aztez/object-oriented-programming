import java.io.*;
import java.util.*;

public class PankkitiliMain {

   private static final Scanner input = new Scanner(System.in);


   public static void main( String [] args ){
      
      Pankkitili tili = new Pankkitili();
	  
      String tilinumero_apu;
      String omistaja_apu;
      double saldo_apu;
	  double luku_apu;
	  int syote;
	  
      System.out.print("\nTervetuloa pankkiautomaatille!\nSyota nimesi: ");
      omistaja_apu = input.nextLine();
	  tili.setOmistaja(omistaja_apu);
	  
      System.out.print("Syota tilinumerosi: ");
      tilinumero_apu = input.nextLine();
      tili.setTilinumero(tilinumero_apu);
	  
	  System.out.print("Syota viela tilisi saldo: ");
      saldo_apu = input.nextDouble();
      tili.setSaldo(saldo_apu);
	  
	  tili.printTiedot();
	   
	 
      do {
	  
	  System.out.println("\n\n  >> VALIKKO <<");
      System.out.println("\n  1. Talletus");
      System.out.println("  2. Nosto");
	  System.out.println("  3. Tilin tiedot");
      System.out.println("  4. Poistu");
	  System.out.println("\nValitse numeronappaimilla"); 
	  System.out.print("mita haluat tehda: ");
      syote = input.nextInt();
	  
	     if (syote == 1) {
            System.out.print("\nSyota summa, jonka haluat tallettaa: ");
            luku_apu = input.nextDouble();
		    tili.setLisaa_saldo(luku_apu);
                
		 
         } 
	  
	     else if (syote == 2) {

            System.out.print("\nSyota summa jonka haluat nostaa: ");
            luku_apu = input.nextDouble();
            tili.setVahenna_saldo(luku_apu);
			

         }   
	  
	     else if (syote == 3) {
			 
			tili.printTiedot();
			 
		 }
	  
	  
	  
       } while (syote != 4);

      System.out.println("\nKiitos ja tervetuloa uudelleen!");

   
	  
	  
	  
   }
     
}