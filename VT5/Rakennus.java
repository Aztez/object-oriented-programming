
public class Rakennus extends Tontti{

    private double talon_Ala;
	private double asunnonAla;
    private int huonelkm;
	private int asuntomaara;
	private int asukasmaara;

	private Asukkaat asukkaat;

	public Rakennus(String tNimi, String osoite, double pintaAla, double pintaAlaAsunnon, int huonelkm, int tyyppi){

			nimi = tNimi;
            this.osoite =osoite;
            pinta_ala= pintaAla;
            talon_Ala = pintaAlaAsunnon;
			this.huonelkm = huonelkm;
			if(tyyppi==1){
				rakennusTyyppi = "Kerrostalo";
			}else if(tyyppi==2){
				rakennusTyyppi = "Rivitalo";
			}else{
				rakennusTyyppi = "Omakotitalo";
			}
    }



	public void tulostaRakennus(){

        System.out.println("Asunnon pinta-ala: " + talon_Ala + " m2");
        System.out.println("Huoneiden lukumaara: " + huonelkm );
	}

}
