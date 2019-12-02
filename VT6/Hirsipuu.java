import java.io.*;
import java.util.*;
import java.nio.charset.Charset;

public class Hirsipuu{
	
	private String sana;
	private String sana_;
	private boolean onLoppu = true;
	private boolean arvausOikein;
	private boolean arvaus;
	private int arvauksiaJaljella;
	private int sanoja;
	private int kirjaimiaJaljella;
	private char[] arvatutKirjm;
	
	private List<Character> arv = new ArrayList<Character>();
	
	public Hirsipuu(Sanalista sanalista, int arvaukset){
		
		arvauksiaJaljella = arvaukset;
		Random rand = new Random();
		sana = sanalista.list.get(rand.nextInt(sanalista.list.size()));
		arvatutKirjm = new char[sana.length()];
		
		for(int i = 0; i < sana.length(); i++){
			
			kirjaimiaJaljella = sana.length();
			arvatutKirjm[i] = '*';
			
		}
		
	}
	
	public boolean arvaa(Character merkki){
		
		arv.add(merkki);
		int pituus = sana.length();
		arvaus = false;  
		
		for(int i = 0; i<pituus; i++){
			
			if ((char)Character.toLowerCase(merkki) == sana.charAt(i)){
				
				arvatutKirjm[i] = merkki;
				kirjaimiaJaljella -= 1;
				arvaus = true;
				
			}
			
		}
		
		if(arvaus == false){
			
			arvauksiaJaljella = arvauksiaJaljella - 1;
			
		}
		
		return arvaus;
		
	}
	
	public List<Character> arvaukset (){
		
		return arv;
		
	}
	
	public int arvauksiaOnJaljella(){
		
		return arvauksiaJaljella;
		
	}
	
	public String sana(){
		
		return sana;
		
	}
	
	public boolean onLoppu(){
		
		int luku = arvauksiaOnJaljella();
		
		if (luku == 0 || kirjaimiaJaljella == 0){
			
			onLoppu = false;
			
		}
		
		return onLoppu;
		
	}
	
	public void arvatutKirjaimet(){
		
		System.out.print("Sana: ");
		
		for(int i = 0; i < arvatutKirjm.length; i++){
			
			System.out.print(arvatutKirjm[i]);
			
		}
		
		System.out.println(" ");
		
	}
	
}








