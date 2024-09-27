import java.util.Scanner;
public class Shop{

       private String Shopname;
       private String owner;
       private Product list[]=new Product[100];
     private static int counter=0;
     // constructor
       public Shop(String Shopname,String owner,Product product){
          this.Shopname=Shopname;
          this.owner=owner;
          this.product=product;}
      //
        
       public void setShopname(String S){
              this.Shopname=S; }

       public String getShopename(){
          return Shopname;}
      
        public void setowner(String o){
              this.owner=o; }

       public String getowner(){
          return owner;}

        // function to add

       public void addproduct(){
  
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product details");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        Product product =new Product(name,prize,quatity);
        Productlist[productcount++]=product;
        System.out.println("Product added");
}

       // funtion to sell

       public void sale(){
         System.out.println("Sale Menu");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        String id= scanner.nextLine();
 
        for(int i=0; i<productCount ;i++){
              if(productlist[i].getId.equals(id)){
                  productList[i].setQuantity(productList[i].getQuantity()-1);
                  revenue+=productList[i].getPrice();
                  System.out.println("Sale successful");}
            else{
                System.out.println("Product not found");
           }}
}
}