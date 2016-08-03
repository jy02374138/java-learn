public class Student{
	
	public String id;
	public String name;
	public int age;
	public String des;
	
	
	public static void main(String[] args){
		Student s = new Student();
		s.attendClass();
		s.exam();
		
	}
	
	public void attendClass(){
		id = "123";
		name = "¼ÎÊµ¶à";
		age = 45;
		des = "È¢ÄãÄÌ±È";
		
	}
	
	public void exam(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(des);
		
	}
}