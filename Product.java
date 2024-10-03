import java.util.Objects;
public class Product{
	private String name;
	private double price;
	private String id;
	private int quantity;
	private static int counter=0;
	
	//constructor
	public Product( String name, double price, int quantity) {
        this.id = String.format("%03d", ++counter);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name) {
        this(name,0);
    }
	
	//setter methods
	public void setName(String name){
		this.name=name;
	} 
	public String getName() {
        return name;
    }
	
	public void setPrice(double price){
		this.price=price;
	} 
	public double getPrice() {
        return price;
    }
	
	public void setQuantity(int quantity){
		this.quantity=quantity;
	} 
	public int getQuantity() {
        return quantity;
    }
	
	public void setId(String id){
		this.id=id;
	} 
	public String getId() {
        return id;
    }
	
	public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Product.counter = counter;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(id, product.id) ;
    }
	
