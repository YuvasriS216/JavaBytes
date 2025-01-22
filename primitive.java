public class primitive {
    public static void main(String[] args) {
    int price = 500;
    float costPerItem = 9.89f;
    char currency = '$';
    float totalCost = price + costPerItem;
     
    System.out.println(price * costPerItem );
    System.out.println("total cost: "+ price + costPerItem );
    System.out.println(totalCost + currency);
    }
    
}
