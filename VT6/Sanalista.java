import java.io.*;
import java.util.*;
import java.nio.charset.Charset;

public class Sanalista{

    List<String> list = new ArrayList<String>();
	
	public Sanalista(String tiedostonimi){
		
		String tiedNimi = tiedostonimi;
		try(BufferedReader file = new BufferedReader (new InputStreamReader (new FileInputStream(tiedNimi),"utf-8"))){
				
			String rivi;
				
			while( (rivi = file.readLine()) != null) {
				
				list.add(rivi);
				
			}
			
			if (rivi == null) {
			
				System.out.println("\nArvattavat sanat luettu annetusta tiedostosta.\nLisataksesi uusia sanoja, muokkaa txt-tiedostoa.\n");
				System.out.println("Tervetuloa hirsipuupeliin!\nTassa pelissa yritat arvata sanan syottamalla kirjaimia nappimistolta.\nVoit arvata 5 kertaa vaarin.");
				System.out.println("Onnea peliin!\n");
			
			}
			
		}
			
		catch(IOException ioe){
				
			System.out.println("error");
			ioe.printStackTrace();
				
		}
		
	}
	
	public List<String> annaSanat(){
		
		return list;
		
	}

}