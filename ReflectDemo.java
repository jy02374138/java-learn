import java.lang.Class;
import java.lang.ClassNotFoundException;

class ReflectDemo{
	
	public static void main(String[] args){
		try{
			Class<?> classType = Class.forName("Employ");
		}catch(ClassNotFoundException $e){}
		
		try{
			Employ e = (Employ) classType.newInstance();
		}catch(InstantiationException $e){
			
		}
		
		
		System.out.println(e.getName());
		
	}
}


class Employ{
	
	private String name;
	
	private int age;
	
	public Employ(){
		name = "Î´ÃüÃû";
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String $name){
		name = $name;
	}
}