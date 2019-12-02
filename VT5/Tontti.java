import java.io.*;
import java.util.*;

abstract public class Tontti{

    protected static String nimi;
	protected static String osoite;
	protected double pinta_ala;
	protected String rakennusTyyppi;


	public double getPinta_ala(){
		return pinta_ala;
    }

	public void setNimi(final String nimi){
		this.nimi = nimi;
	}

	public void setPinta_ala(final double pinta_ala){
		this.pinta_ala = pinta_ala;
	}

	public void tulostaTontti(){
	System.out.println("Tontin nimi: " + nimi );
	System.out.println("Tontin osoite: " + osoite);
	System.out.println("Tontin pinta-ala: " + pinta_ala + " m2");
	System.out.println("Rakennuksen tyyppi: " + rakennusTyyppi);
	}
}
