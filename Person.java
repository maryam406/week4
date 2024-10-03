public class Person{
	private String name;
	private String email;
	
	//Conmstructor
	public Person(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	
	//setter and getter method 
	public void setName(String name){
		this.name=name;
	} 
	public String getName() {
        return name;
    }
	
	public void setEmail(String email){
		this.email=email;
	} 
	public String getEmail() {
        return email;
    }
	@Override
	public String toString(){
		return String.format("Name : %s  Email : %s",name,email);
	}
}
