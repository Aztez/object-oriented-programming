public class StandingSubscription extends Subscription {
   
   protected int alennusprosentti;
   
   public int getAlennusprosentti(){
	   
      alennusprosentti = 80;
	   
      return alennusprosentti;
	   
   }
   
   public void setAlennusprosentti(final int alennusprosentti){
	   
      this.alennusprosentti = alennusprosentti;
	  
   }     
   
   
}