import java.util.Objects;
public class Product{
 
           private String name;
           private String id;
           private int quantity;
           private double price;
          
          private static int counter=0;



         public Product(String name, double price,int quantity) {
           this.name=name;
          this.id=String.format("%03d", ++counter);
          this.quantity=quantity;}

        public Product(String name, double price) {
           this(name, price, 0);
    }
        public Product(String name) {
            this(name,0);}// calling of a constructor
       
          
         // setter and getter method
         public void setname(String n){
            this.name=n;}      

         public String getname(){
               return name;}
         
         public void setid(String i){
                 this.id=i;}
         
          public String getid(){
                   return id;}

         public void setquantity(int q){
                this.quantity=quantity;}
     
         public int getquantity(){
                   return quantity;}

          public double getPrice() {
             return price; }

        public void setPrice(double price) {
          this.price = price; }


          public static int getCounter() {
            return counter; }

         public static void setCounter(int counter) {
              Product.counter = counter;}

          
      @Override
       public boolean equals(Object o) {
         if(this == o){
             return true;}
        if(o == null || getClass() != o.getClass()){
              return false;}
        Product product = (Product) o;
        return  Objects.equals(id, product.id) ;
    }
       @Override
        public String toString() {
        return String.format("%s %s %f %d",id,name, price, quantity );}

} 