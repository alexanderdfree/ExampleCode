public class FryingPan{
   double radius;
   double depth;
   String material;
   double temp;
   boolean clean;
   
   public FryingPan(double r, double d, String m, double t, boolean c){
      radius = r;
      depth = d;
      material = m;
      temp = t;
      clean = c;
   }
   
   public void heat(double hotTemp){
      temp = hotTemp;
   }
   
   public void cool(double coolTemp){
      temp = coolTemp;
   }
   
   public void fry(String food){
      clean = false;
   }
   
   public void wash(){
      clean = true;
   }
}