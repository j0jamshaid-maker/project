public class Laptops{
    public static void main(String[] args){
        Laptop lap=new Laptop();
        lap.name="hp";
        lap.quantity=5;
        lap.pricePerUnit=50000.0;
        lap.TotalValue();
    }
}
class Laptop{
    String name;
    int quantity;
   double pricePerUnit;
   public void TotalValue(){
       double TotalValue=(quantity*pricePerUnit);
       System.out.println("Total Value: "+TotalValue);
   }
    
}