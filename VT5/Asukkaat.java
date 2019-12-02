public class Asukkaat{

    private String[] asukas = new String[6];

	public Asukkaat(String asukas0, String asukas1,String asukas2,String asukas3,String asukas4,String asukas5){

		this.asukas[0] = asukas0;
		this.asukas[1] = asukas1;
		this.asukas[2] = asukas2;
		this.asukas[3] = asukas3;
		this.asukas[4] = asukas4;
		this.asukas[5] = asukas5;
	}

	public void getAsukas(){
		System.out.println("\nAsukkaat: ");
		for(String element: asukas){
	    System.out.println( element);
		}
	}
}
