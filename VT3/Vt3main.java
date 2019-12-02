import java.io.*;
import java.util.*;


public class Vt3main {

   private static final Scanner input = new Scanner(System.in);

   public static void main( String [] args ){
      
	  RegularSubscription regularSub = new RegularSubscription();
	  StandingSubscription standingSub = new StandingSubscription();
	  Subscription subscr = new Subscription();
	  
	  int syote;
	  int tilauksenkesto;
	  String lehdennimi;
	  String tilaajannimi;
	  String toimitus;
      double kkhinta;
	  String tyyppi;
	  
	  
	  kkhinta = 10;
	  subscr.setKuukausihinta(kkhinta);
	  
	  System.out.println("Tervetuloa tilaamaan lehtea!\n");
	  
	  System.out.print("Syota oma nimesi: ");
	  tilaajannimi = input.nextLine();
	  subscr.setTilaajan_nimi(tilaajannimi);
	  
	  System.out.print("Syota lehden nimi, jonka haluat tilata: ");
	  lehdennimi = input.nextLine();
	  subscr.setLehden_nimi(lehdennimi);
	  
	  System.out.println("\nValitsemasi lehti maksaa " + kkhinta + "e kuukaudessa.");
	  System.out.println("Jos haluat tilata lehden koko vuodeksi, kannattaa valita kestotilaus!");
	  System.out.println("Kestotilauksen valitessasi saat -20% alennuksen!!!\n");
	  
	  System.out.println("Valitse tilauksen tyyppi numeronappaimilla:");
	  System.out.println("1. Kuukausitilaus");
	  System.out.println("2. Kestotilaus");
	  syote = input.nextInt();
	  
	  if (syote == 1) {
		  
		  System.out.print("Syota montako kuukautta haluat tilauksesi kestavan: ");
		  tilauksenkesto = input.nextInt();
		  regularSub.setTilauksen_kesto(tilauksenkesto);
		  
		  tyyppi = ("Kuukausitilaus");
		  subscr.setTilauksentyyppi(tyyppi);
		  
	  }
	  
	  else if (syote == 2){
		  
		  tilauksenkesto = 12;
		  standingSub.setAlennusprosentti(tilauksenkesto);
		  
		  regularSub.setTilauksen_kesto(tilauksenkesto);
		  
		  tyyppi = ("Kestotilaus");
		  subscr.setTilauksentyyppi(tyyppi);
	  }
	  
	  input.nextLine();
	  System.out.print("Syota viela lehden toimitusosoite: ");
	  toimitus = input.nextLine();
	  subscr.setToimitusosoite(toimitus);
	  
	  System.out.print("\nTilaus vastaanotettu! Kiitos tilauksestanne!\n");
	  subscr.printInvoice();
   }
     
	 static void printSubscriptionInvoice(Subscription subscr){
		 
       subscr.printInvoice();
		 
	 }
	 
}