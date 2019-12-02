import java.io.*;
import java.util.*;
import java.nio.charset.Charset;

public class Main { 

   private static final Scanner input = new Scanner(System.in);
   
   public static void main(String [] args){
	   
	   int arvauksia = 5;
	   String tiedostonimi = "sanoja.txt";
	   boolean pelikaynnissa = true;
	   
	   Sanalista s = new Sanalista(tiedostonimi);
	   Hirsipuu h = new Hirsipuu(s , arvauksia);
	   
	   while(pelikaynnissa == true){
		   
		   System.out.print("Syota kirjain: ");
		   char merkki = input.next().charAt(0);
		   boolean oikein = h.arvaa(merkki);
		   
		   if(oikein== true){
			   
			   System.out.println("\nArvaus oikein!");
			   h.arvatutKirjaimet();
			   
			   if(h.onLoppu() == false){
				   
				   System.out.println("Voitit pelin!");
				   break;
				   
			   }
			   
		   }
		   
		   else {
			   
			   System.out.println("\nArvaus vaarin!");
			   h.arvatutKirjaimet();
			   
			   if(h.onLoppu() == false){
				   
				   System.out.println("Havisit pelin! Sana oli: " + h.sana());
				   
			   }
			   
		   }
		   
		    System.out.print("Arvatut kirjaimet: ");
			
		    for(char a: h.arvaukset()){
				
				  System.out.print(a +" ");
				  
			  }
			  
		   System.out.println("\nVaaria arvauksia jaljella: " + h.arvauksiaOnJaljella());
		   pelikaynnissa = h.onLoppu();
		   
	   }
	   
	}

}