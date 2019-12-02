import java.util.*;

public class InsInfoContainer extends Vt4main {
   
   //tallentaa vakuutus-olioita vector säiliöön
   
   Vector<String> sailio = new Vector<String>();
   
   public void InsInfoContainer(){
   
      sailio.addElement("uusiKiinteisto");
   }
   
   
   
   public void printInsurances(){  //tulostaa säiliön koko sisällön
   
      Enumeration en = sailio.elements();
      System.out.println("\nSailion sisalto:");
      
	  while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
   
   }

   public void printLargerProp(){
   
   System.out.println("Suuremmat");
   //tulostaa tiedot kiinteistöistä, joiden vakuutusarvo on parametrina
   //annettua rajaa suurempi. Tulostaa vakuutusarvon
   
   }

   public void printSmallerProp(){
   
   System.out.println("Pienemmat");
   //tulostaa tiedot kiinteistöistä, joiden vakuutusarvo on parametrina
   //annettua rajaa pienempi. Tulostaa vakuutusarvon
   
   }

}