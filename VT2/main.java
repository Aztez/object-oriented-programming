import java.io.*;
import java.util.*;


public class main { 

   private static final Scanner input = new Scanner(System.in);
   
   public static void main(String [] args){
	  
      asukkaat tiedotA = new asukkaat();
	  rakennus tiedotR = new rakennus();
	  
	  String tonttiNimi;
	  String koordinaatti;
	  String asukas;
      double pintaAla;
	  double pintaAlaTalon;
      int huonelkm;
	   
      System.out.print("Anna tontille nimi: ");
      tonttiNimi = input.nextLine();
      tiedotR.setNimi(tonttiNimi);
	   
      System.out.print("Anna tontin pituus-koordinaatti: ");
      koordinaatti = input.nextLine();
      tiedotR.setSijaintiEast(koordinaatti);
	   
      System.out.print("Anna tontin leveys-koordinaatti: ");
      koordinaatti = input.nextLine();
      tiedotR.setSijaintiNorth(koordinaatti);
	   
      System.out.print("Anna tontin pinta-ala neliometreina: ");
      pintaAla = input.nextDouble();
      tiedotR.setPinta_ala(pintaAla);
	   
	   
      System.out.print("Anna talon pinta-ala neliometreina: ");
      pintaAlaTalon = input.nextDouble();
      tiedotR.setTaloPinta_ala(pintaAlaTalon);
	   
      System.out.print("Anna talon huoneiden lukumaara: ");
      huonelkm = input.nextInt();
      tiedotR.setHuonelkm(huonelkm);
	   
      for(int i=1; i<6; i++){
         if(i==1){
		    System.out.println("Anna talon " + i +". Asukkaan nimi ja syntymaaika (pp/kk/vvvv)\n");
		    asukas = input.nextLine();
		    asukas = input.nextLine();
		    tiedotA.setAsukas(asukas);
		 }
		 
		 else{
		    System.out.println("Anna talon " + i +". Asukkaan nimi ja syntymaaika (pp/kk/vvvv)\n(jos ei enempaa asukkaita jata tyhjaksi)");
		    asukas = input.nextLine();
		    tiedotA.setAsukas(asukas);
		 }
			   
      }
		    
      System.out.println("Antamasi tiedot ovat:");
      tiedotR.tulostaTontti();
      tiedotR.tulostaRakennus();
      tiedotA.getAsukas();
	  
   }

}
	   
	   
    
	