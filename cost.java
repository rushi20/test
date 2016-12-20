import java.util.*;
class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        double tip= (mealCost*(tipPercent))/100.0;
         double tax= (mealCost*(taxPercent))/100.0;
        
        mealCost=mealCost+tip+tax;
       
        int totalCost = (int) Math.round(mealCost);   
      System.out.println("The total mean cost is "+totalCost+" dollars.");     
    
    }    
}