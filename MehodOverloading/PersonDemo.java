package MehodOverloading;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person person1 = new Person("Agnes");
		System.out.println("Name : "+person1.getName());
		
		Person person2 = new Person("Agnes", 22);
		System.out.println("Name : "+ person2.getName() +" ,Age : "+ person2.getAge());
		
		Person person3 = new Person("Raffi", 5 , "Surandai");
		System.out.println("Name : "+ person3.getName() +" ,Age : "+ person3.getAge() +" ,Address : " + person3.getAddress());
	
		
	}
}

class Person
{
	private String name;
	private int age;
	private String address;
	
	public Person(String name)
	{
		this.name = name;
	}
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
}
