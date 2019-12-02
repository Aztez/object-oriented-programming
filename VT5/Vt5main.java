import java.io.*;
import java.util.*;

public class Vt5main {
	
   private static final Scanner input = new Scanner(System.in);
   
   public static void main(String [] args){

	   List<Rakennus> list = new ArrayList<Rakennus>();
	   Asukkaat a []  = new Asukkaat [10];

	   String nimi;
	   String tontinNimi;
	   String osoite;
	   String asukas;
	   double pintaAla;
	   double pintaAlaAsunnon;
	   int asuntoMaara;
	   int apu;
	   int rakennusMuoto;
	   int huonelkm;
	   int counter = 0;

	   String [] asukkaat = new String [6];

	   System.out.print("Anna tontin nimi: ");
	   tontinNimi = input.nextLine();

	   System.out.print("Anna tontin katuosoite: ");
	   osoite = input.nextLine();

	   System.out.print("Anna tontin pinta-ala: ");
	   pintaAla = input.nextDouble();

	   System.out.print("\n1 = Kerrostalo | 2 = Rivitalo | 3 = Omakotitalo\nValitse rakennuksen tyyppi numeronappaimilla: ");
	   rakennusMuoto = input.nextInt();

	   if ( rakennusMuoto == 2 || rakennusMuoto == 1){
		   System.out.print("Anna Asuntojen maara: ");
		   asuntoMaara = input.nextInt();

		   for (int i=1; i <= asuntoMaara; i++){
				System.out.print("\nAnna " + i + ". asunnon pinta-ala: ");
				pintaAlaAsunnon = input.nextDouble();

				System.out.print("Anna huoneiden lukumaara: ");
				huonelkm = input.nextInt();

				System.out.print("Anna asunnon asukkaiden maara: ");
				apu = input.nextInt();
				input.nextLine();
				for(int idx = 1; idx<= apu; idx++){

					System.out.print("Anna asukkaan nimi: ");

					nimi = input.nextLine();
					asukkaat[idx-1] = nimi;
				}
				a[counter] = new Asukkaat(asukkaat[0],asukkaat[1],asukkaat[2],asukkaat[3],asukkaat[4],asukkaat[5]);
				counter++;
				list.add(new Rakennus(tontinNimi, osoite, pintaAla, pintaAlaAsunnon, huonelkm, rakennusMuoto));
			   }
	   }
	   
	   else {

			asuntoMaara = 1;
		    System.out.print("Anna talon pinta-ala: ");
		    pintaAlaAsunnon = input.nextDouble();

			System.out.print("Anna huoneiden lukumaara: ");
			huonelkm = input.nextInt();

			System.out.print("Anna asunnon asukkaiden maara: ");
				apu = input.nextInt();
				input.nextLine();
				for(int i = 1; i<= apu; i++){

					System.out.print("Anna asukkaan nimi: ");

					nimi = input.nextLine();
					asukkaat[i-1] = nimi;
				}
			a[counter] = new Asukkaat(asukkaat[0],asukkaat[1],asukkaat[2],asukkaat[3],asukkaat[4],asukkaat[5]);

			list.add(new Rakennus(tontinNimi, osoite, pintaAla, pintaAlaAsunnon, huonelkm, rakennusMuoto));
	   }

				System.out.println("\nAntamasi tiedot: \n");
				list.get(0).tulostaTontti();

				System.out.println("\nAsuntojen tiedot: ");
				for(int i=0; i<asuntoMaara; i++ ){
					System.out.println("\nAsunto: " );
					list.get(i).tulostaRakennus();
					a[i].getAsukas();
				}
	   }

}

