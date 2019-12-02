public class asukkaat{

   private String[] asukas = new String[5];  // talossa nyt maksimissaan 6 asukasta
   private int muuttuja=0;
	  
   public void getAsukas(){
      System.out.println("Talon asukkaat: \n");
      
	     for(String element: asukas){	 
         System.out.println( element);		
		}
   }		
	
   public void setAsukas(final String asukas){   
      this.asukas[muuttuja] = asukas;
      muuttuja++;
   }

}