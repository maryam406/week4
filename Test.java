import java.util.Scanner;
public class Test{
public static void main(String arg[]){

	
	//shop class
	 Shop shop= new Shop(new Person("John", "email"),"Lahore");
	 System.out.println("Person Info -->");
	 shop.display();
	 System.out.println("Press 1 for add product");
	 System.out.println("Press 2 for sale product");
	 System.out.println("Press 3 for modify product");
	 System.out.println("Press 4 for remove product");
	 System.out.println("Press 5 for displaying info");
	 System.out.println("Press 0 for exit programme");
        Scanner sc = new Scanner(System.in);
        while(true) {
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                shop.add_pro();
                break;
                case 2:
                    shop.sale();
                    break;
				case 3:
                    shop.modify();
                    break;
				case 4:
                    shop.remove_pro();
                    break;
				case 5:
                    shop.display();
                    break;
                case 0:
                   System.exit(0);
                   break;
                default:
            }



        }

	
}

}
