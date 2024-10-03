import java.util.Scanner;

public class Shop{
   private Product pro_list[]=new Product[20];
   private Person owner;
   private String address;
   private static double revenue;
   private static int pro_count=0;
   
   public Shop(Person owner,String address){
	   this.owner=owner;
	   this.pro_list=new Product[20];
	   this.address=address;
   }
   
   public void add_pro(){
	   Scanner input=new Scanner(System.in);
	   System.out.println("Adding details of Product : ");
	   System.out.println("Name :");
	   String name=input.nextLine();
	   System.out.println("Price :");
	   double price=input.nextDouble();
	   System.out.println("Quantity : ");
	   int quantity=input.nextInt();
	   Product product=new Product(name,price,quantity);
	   pro_list[pro_count]=product;
	   System.out.println("Successfully Added");
	   pro_count++; 
	   
   }
   public void sale(){
	   System.out.println("Sale --->>>>");
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Product Id : ");
	   String id=sc.nextLine();
	   for(int i=0;i<pro_count;i++){
		   if (pro_list[i].getId().equals(id))
		   {
			   pro_list[i].setQuantity(pro_list[i].getQuantity()-1);
			   revenue+=pro_list[i].getPrice();
			   System.out.println("Sale Successfully");
		   }
	   }
   }
   
   public void modify(){
	   System.out.println("Modifying the product");
	   Scanner sc2=new Scanner(System.in);
	   System.out.println("Enter Product Id which u want to modify: ");
	   String id=sc2.nextLine();
	   System.out.println("Now tell me the details :");
	   System.out.println("Name ; ?");
	   String name=sc2.nextLine();
	   System.out.println("Price : ?");
	   double price=sc2.nextDouble();
	   System.out.println("Quantity : ?");
	   int quantity=sc2.nextInt();
	   for(int i=0;i<pro_count;i++){
		   if (pro_list[i].getId().equals(id))
		   {
			   pro_list[i].setName(name);
			   pro_list[i].setPrice(price);
			   pro_list[i].setQuantity(quantity);
			   System.out.println("Successfully Modified");
			   break;
		   }
	   
	   }
   }
   
   public void remove_pro() {
    System.out.println("Removing a product");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Product Id of the product you want to remove: ");
    String id = sc.nextLine();
    for (int i = 0; i < pro_count; i++) {
        if (pro_list[i].getId().equals(id)) {
            
            pro_list[i] = null; // Simply set the product to null
            System.out.println("Product removed successfully.");
            break;
        }
    }
   }
   
   //display method 
   public void display() {
        System.out.println("Displaying Products:");
		System.out.println("Name : "+owner.getName()+"   Email : "+owner.getEmail()+"Address : "+address);
		
        for (int i = 0; i < pro_count; i++) {
            if (pro_list[i] != null) {
                System.out.println(pro_list[i]); 
            }
        }
   }
}
